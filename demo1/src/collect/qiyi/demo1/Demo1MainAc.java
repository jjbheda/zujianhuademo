package collect.qiyi.demo1;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


/**
 * Created by jiangjingbo on 2017/5/27.
 */

public class Demo1MainAc extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAGA","插件Demo1 Activity 启动");
        setContentView(R.layout.activity_main_demo1);
//        TextView tv = (TextView) findViewById(R.id.demo1_textView1);
//        tv.setText(R.string.app_name_demo1);
//        setContentView(getResources().getIdentifier("activity_main_demo1", "layout", getPackageName()));
    }

//    @Override
//    public Resources getResources() {
//        Log.e("chajian","getApplicationContext = " + getApplicationContext());
//        Log.e("chajian","getApplicationContext 2 = " + getApplication());
//        Log.e("chanjian ","getApplicationContext 2 = " + super.getResources());
//
//        if(getApplication() != null && getApplication().getResources() != null){
//            return getApplication().getResources();
//        }
//        return super.getResources();
//    }
//
//    @Override
//    public AssetManager getAssets() {
//        if(getApplication() != null && getApplication().getAssets() != null){
//            return getApplication().getAssets();
//        }
//        return super.getAssets();
//    }
//
//    @Override
//    public Resources.Theme getTheme() {
//        if(getApplication() != null && getApplication().getTheme() != null){
//            return getApplication().getTheme();
//        }
//        return super.getTheme();
//    }

}
