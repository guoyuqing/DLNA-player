//auto generated by tool, don't modify
package com.youplayer.core;

import com.youplayer.util.LOG;

import com.youplayer.player.frame.YouPlayerEventControler;

public class You_Core {
	static
	{
	System.loadLibrary("ffmpeg");
	System.loadLibrary("char");
	System.loadLibrary("player");
	System.loadLibrary("logic");
	System.loadLibrary("wifi_setting");
	
	}
//>>>>>>>>>>>>>>>>>>>>>

public final static int	FN_PAGE_ROOTPAGE = 1;

public final static int	FN_PAGE_ONLINE = 3;

public final static int	FN_PAGE_FULL_SCREEN_PLAYER = 23;

public final static int	FN_PAGE_UTIL = 25;
public final static int	FN_PAGE_EXPLORER = 26;

public final static int	FN_PAGE_ONLINE_WEB_DETAIL = 32;

public final static int	FN_PAGE_EVT_CREATE = 1;
public final static int	FN_PAGE_EVT_SHOW = 2;//2
public final static int	FN_PAGE_EVT_PUSH = 3;//3
public final static int	FN_PAGE_EVT_POP = 4;//4
public final static int	FN_PAGE_EVT_POP_TO_PAGE = 5;
public final static int	FN_PAGE_EVT_REMAIN = 6;//5
public final static int	FN_PAGE_EVT_WAITING = 7;//6
public final static int	FN_PAGE_EVT_CANCEL_WAITING = 8;//7

public final static int	FN_PAGE_EVT_EXIT_APP = 10;

public final static int	FN_PAGE_DATA_FAV = 12;

//abstractcontrol
public final static int	FN_COREPAGE_BTN_START = 1;
public final static int	FN_COREPAGE_BTN_UI_HANDLER_CHANGE = 2;
public final static int	FN_COREPAGE_BTN_START_FROM_EXTERNAL = 3;//fromexternalapplication,suchasFileExplorer
public final static int	FN_COREPAGE_BTN_START_FROM_NOTIFICATION = 4;//fromexternalnotification
public final static int	FN_COREPAGE_BTN_ON_PUSH = 5;
public final static int	FN_COREPAGE_BTN_ON_POP = 6;
public final static int	FN_COREPAGE_BTN_STOP = 7;
public final static int	FN_COREPAGE_BTN_POP_FINISHED = 8;
public final static int	FN_COREPAGE_BTN_PUSH_FINISHED = 9;
//FN_COREPAGE_BTN_RESUME,
//Common
public final static int	FN_COMMON_BTN_MAIN_MENU = 10;
public final static int	FN_COMMON_BTN_CONTEXT_MENU = 11;
public final static int	FN_COMMON_VIEW = 12;
public final static int	FN_COMMON_BTN_BACK = 13;
public final static int	FN_COMMON_BTN_PLAY = 14;
public final static int	FN_COMMON_BTN_FAV = 15;
public final static int	FN_COMMON_BTN_DETAIL = 16;
public final static int	FN_COMMON_BTN_CACHE = 17;//predownload
public final static int	FN_COMMON_BTN_ANTHOLOGY = 18;
public final static int	FN_COMMON_BTN_DELETE = 19;
public final static int	FN_COMMON_BTN_CLEAR = 20;
public final static int	FN_COMMON_BTN_REFRESH = 21;
public final static int	FN_COMMON_BTN_MORE = 22;
public final static int	FN_COMMON_LIST_BASE = 23;
public final static int	FN_COMMON_SETTING_DATA_CTR = 24;//changesettingdata,
public final static int	FN_COMMON_ONLINE_DATA_CTR = 25;
public final static int	FN_COMMON_BTN_ONLINE_DETAIL = 26;
public final static int	FN_COMMON_FULL_SCREEN_VIEW = 0x100;
public final static int	FN_FULL_SCREEN_BTN_PLAY = 0x100 + 1;
public final static int	FN_FULL_SCREEN_BTN_PAUSE = 0x100 + 2;
public final static int	FN_FULL_SCREEN_BTN_NEXT = 0x100 + 3;
public final static int	FN_FULL_SCREEN_BTN_PREVIOUS = 0x100 + 4;
public final static int	FN_FULL_SCREEN_BTN_DONE = 0x100 + 5;
public final static int	FN_FULL_SCREEN_BTN_MODE_CHANGE = 0x100 + 6;
public final static int	FN_FULL_SCREEN_BTN_SEEK = 0x100 + 7;
public final static int	FN_FULL_SCREEN_BTN_AUDIO_CHANNEL = 0x100 + 8;
public final static int	FN_FULL_SCREEN_BTN_AUDIO_CHANNEL_CONFIM = 0x100 + 9;
public final static int	FN_FULL_SCREEN_BTN_RATE = 0x100 + 10;
public final static int	FN_FULL_SCREEN_BTN_ENTER_BACKGROUND = 0x100 + 11;
public final static int	FN_FULL_SCREEN_BTN_ENTER_FOREGROUND = 0x100 + 12;
public final static int	FN_FULL_SCREEN_BTN_FAV = 0x100 + 13;
public final static int	FN_FULL_SCREEN_AD_FRONT_FINISH = 0x100 + 14;
public final static int	FN_FULL_SCREEN_AD_BEHIND_FINISH = 0x100 + 15;
public final static int	FN_FULL_SCREEN_BTN_MENU = 0x100 + 16;
public final static int	FN_FULL_SCREEN_BTN_STOP = 0x100 + 17;
public final static int	FN_FULL_SCREEN_BTN_RELATED_CELL = 0x100 + 18;
public final static int	FN_FULL_SCREEN_BTN_VIEW_READY = 0x100 + 19;
public final static int	FN_FULL_SCREEN_SEEK_PREVIEW = 0x100 + 20;
public final static int	FN_FULL_SCREEN_BTN_SHARE = 0x100 + 21;
public final static int	FN_FULL_SCREEN_BTN_MODE_CHANGE_FORIPAD = 0x100 + 22;
public final static int	FN_FULL_PLAYER_CONVERTER_MEDIA = 0x100 + 23;
public final static int	FN_FULL_SCREEN_BTN_3D = 0x100 + 24;
public final static int	FN_FULL_SCREEN_BTN_DEFINITION = 0x100 + 25;
public final static int	FN_FULL_SCREEN_BTN_AIRONE_OPEN = 0x100 + 26;
public final static int	FN_FULL_SCREEN_BTN_AIRONE_PLAY = 0x100 + 27;

public final static int	FN_FULL_SCREEN_BTN_FEE_DURL = 0x100 + 30;
public final static int	FN_FULL_SCREEN_BTN_AIRONE_VOLUME = 0x100 + 31; 
public final static int	FN_FULL_SCREEN_BTN_AIRONE_AUTHORIZE = 0x100 + 32;

public final static int	FN_FULL_SCREEN_BTN_OURL = 0x100 + 34;

public final static int	FN_REPORT_PLAYER_INFO_START = 0x1100 + 7;
public final static int	FN_REPORT_PLAYER_INFO_END = 0x1100 + 8;

public final static int	FN_SETTING_ITEM_BASE = 0x1200;

public final static int	FN_COMMON_BTN_PLAY_FROM_EXTERNAL = 0x1300 + 2;
public final static int	FN_COMMON_BTN_PUSH_PAGE_FROM_EXTERNAL = 0x1300 + 3;

public final static int	FN_SETTING_FUCTION_MAX = FN_SETTING_ITEM_BASE + 8;


public final static int	FN_SETTING_DEFAULT_CLARITY = FN_SETTING_FUCTION_MAX + 6;

public final static int	FN_UI_EVT_DRAG_LEFT = 2;
public final static int	FN_UI_EVT_DRAG_RIGHT = 3;
public final static int	FN_UI_EVT_TOUCH_UP = 4;


public final static int	_EVT = 0;

	public static native void fn_setting_set_value(int index,int val);


	public static native int fn_setting_get_value(int index);


	public static native int  dlna_render_event(int type,String value);


	public static native void fn_get_image_with_url(Object url);
	public static native void fn_http_exe_url(Object url);
	public static native void fn_forward_url_for_app(Object url);

	public static native boolean fn_http_respose(int id,int code,byte[] url,int length);
	/**
	 * request
	 * @param ctrl       fn_page_control_e
	 * @param evt        fn_control_evt_type_e
	 * @param arg1       request argument
	 * @param ui_data    user_data
	 */
	public native static void fn_core_service_request(int ctrl, int evt, Object arg1, Object ui_data);

	/**
	 * callback
	 * @param page_id      fn_page_type_e
	 * @param page_action  fn_page_evt_type_e
	 * @param core_data    return data
	 * @param ui_data      org user_data
	 */
	public static void action_handler_callback(int page_id, int page_action, Object core_data, Object ui_data) {
		try {
			YouPlayerEventControler.action_handler_callback(page_id, page_action, core_data, ui_data);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOG.v("FN_CORE","","JAVA  exit action_handler_callback callback");
	}
}