package com.myfrist.publicFun;

import android.util.Log;

import com.myfrist.config.Config;

/**
 * Created by MyPC on 2016/7/18 0018.
 */
public class Logg {
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;



    public static void v(String tag , String msg){
        if(Config.LOG_LINE <=  VERBOSE){
            Log.v(tag ,msg);
        }
    }
    public static void d(String tag , String msg){
        if(Config.LOG_LINE <= DEBUG){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if(Config.LOG_LINE <= INFO){
            Log.i(tag,msg);
        }
    }
    public static void w(String tag, String msg){
        if(Config.LOG_LINE <= WARN){
            Log.w(tag,msg);
        }
    }
    public static void e(String tag, String msg){
        if(Config.LOG_LINE <= ERROR){
            Log.e(tag,msg);
        }
    }

}