package com.cfcc.deptone.randomreaderplugin;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by Administrator on 2019/12/2.
 */

public class RandomReader extends CordovaPlugin {
    public Activity activity;/**
     * 该方法会在调用execute()方法之前调用，此时用来获取activity和webView等
     */
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView){
        super.initialize(cordova, webView);
        Log.i("initialize","============================");
        this.activity = cordova.getActivity();
    }

    /**
     * js方法接口，
     * js中通过调用该方法来执行原生的方法
     * @param action 方法名
     * @param args 参数（数组类型）
     * @param callbackContext 回掉
     *           原生方法执行完后，会执行js中传过来的回掉方法
     */
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //this.callbackContext = callbackContext;
        if(action.equals("hello")){
            String orderInfo = args.getString(0);
            hello(orderInfo,callbackContext);
            return true;
        }
        return false;
    }

    public void hello(String hello, CallbackContext callbackContext){
        //执行js中传过来的回调
        if(hello!=null && hello.length()>0){
            callbackContext.success(hello);
        }else{
            callbackContext.error("参数不能为空");
        }

        //原生代码，放在js回调后面，否则js回调不执行
        Toast.makeText(this.activity, hello, Toast.LENGTH_SHORT).show();
    }
}
