package cn.aurora_x.android.boardcast_receiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.tv_msg);
        String msg = MyReceiver.msg;
        if (msg != null) {
            textView.setText(msg);
        }
    }
}
