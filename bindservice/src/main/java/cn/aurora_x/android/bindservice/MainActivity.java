package cn.aurora_x.android.bindservice;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "CRRINKO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceConnection serviceConnection=new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                Log.v(TAG,"Service: onServiceConnected()");

            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        }
    }
    public void onStartButtonClicked(View view){
        Intent intent=new Intent(this,MyService.class);
        intent.putExtra("num",233);
        startService(intent);
    }
    public void onStopButtonClicked(View view){
        Intent intent=new Intent(this,MyService.class);
        stopService(intent);
    }
}
