package cn.zhanghao90.demo1;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class ZHToast extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if("getToast".equals(action)){
            showToast(args.getString(0),args.getInt(1));
        }
        return true;
    }

    private void showToast(String content, int type){
        CordovaInterface cordova = this.cordova;
        if(type == 0){
            Toast.makeText(this.cordova.getActivity(),content,type).show();
        }
        else{
            Toast.makeText(cordova.getActivity(),content,type).show();
        }
    }
}
