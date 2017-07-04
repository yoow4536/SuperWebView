package test.yoo.com.superwebview2;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.uzmap.pkg.openapi.ExternalActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/7/3.
 */

public class WebPageModule extends ExternalActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();      //调用双击退出函数
        }
        return false;
    }

    private boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;

        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            finish();
            System.exit(0);
        }
    }
}
