package cn.aurora_x.android.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String myTag="CrRinko";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(myTag,"This is a verbose message.");
        Log.d(myTag,"This is a debug message.");
        Log.i(myTag,"This is a info message.");
        Log.w(myTag,"This is a warning message.");
        Log.e(myTag,"This is a error message.");
    }
}
