package cn.aurora_x.android.handler;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Runnable myworker;
    Thread workThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.tv_progress);
        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                textView.setText(msg.arg1 + "%");
            }
        };
        final Runnable worker = new Runnable() {
            @Override
            public void run() {
                int progress = 0;
                while (progress <= 100) {
                    Message msg = new Message();
                    msg.arg1 = progress;
                    handler.sendMessage(msg);
                    progress += 1;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        myworker = worker;
    }

    public void onGoButtonClicked(View view) {
        if (workThread == null) {
            workThread = new Thread(null, myworker, "WorkThread");
            workThread.start();
        }
    }
}
