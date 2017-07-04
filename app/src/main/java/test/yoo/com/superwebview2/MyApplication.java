package test.yoo.com.superwebview2;

import android.app.Application;
import android.util.Log;

import com.uzmap.pkg.openapi.APICloud;

/**
 * Created by Administrator on 2017/7/3.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("yoo_log","______________________________");
        APICloud.initialize(getApplicationContext());
        Log.i("yoo_log","______________________________");
    }
}
