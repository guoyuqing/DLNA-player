package com.talent.allshare.player;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.cybergarage.util.CommonLog;
import org.cybergarage.util.LogFactory;

import com.talent.allshare.util.FileHelper;



public class FileDownTask implements Runnable{

	private static final CommonLog log = LogFactory.createLog();
	private final static int MAX_REQUEST_COUNT = 3;
	private final static int CONNECT_TIME_OUT = 5000;
	
	public String requesetMethod = "GET";	
	public String requestUrl; 							
	public String saveUri; 		
	public int responsCode = 0;
	public boolean isDownloadSuccess = false;
	public DownLoadHelper.IDownLoadCallback callback;
	
	public FileDownTask(String requestUrl, String saveUri, DownLoadHelper.IDownLoadCallback callback){
		this.requestUrl = requestUrl;
		this.saveUri = saveUri;
		this.callback = callback;
	}
	
	@Override
	public void run() {

		boolean isParamValid = isParamValid();
		if(isParamValid){
			boolean ret = false;
			int count = 0;
			while(true){
				ret = request();
				if (ret || count > 2){
				
					break;
				}
				count++;
				log.d("request fail,now count = " + count);
			}
			
			request();
		}else{
			log.d("isParamValid = false!!!");
		}
	
		if (callback != null){
			callback.downLoadResult(isDownloadSuccess, saveUri);
		}
	}
	
	private boolean request(){
		
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod(requesetMethod);
			conn.setRequestProperty("Connection", "Keep-Alive"); 	
			conn.setConnectTimeout(CONNECT_TIME_OUT); 
			responsCode = conn.getResponseCode();
			if (responsCode != 200){
				log.d("responsCode = " + responsCode + ", so Fail!!!");
				return false;
			}
		
			InputStream inputStream = conn.getInputStream();
			isDownloadSuccess  = FileHelper.writeFile(saveUri, inputStream);
			log.e("fileDownLoadTask writefile ret = " + isDownloadSuccess + 
					"\nrequestUri = " + requestUrl + 
					"\nsaveUri = " + saveUri);

			inputStream.close();
			return isDownloadSuccess;
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			log.e("catch MalformedURLException e = " + e.getMessage());
		}catch (IOException e) {
			e.printStackTrace();
			log.e("catch IOException e = " + e.getMessage());
		}
	
		
		return false;
	}

	public boolean isParamValid(){
		if (requestUrl == null || saveUri == null){
			return false;
		}
		
		return true;
	}
}