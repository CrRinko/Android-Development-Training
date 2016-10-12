package cn.aurora_x.android.bindservice;

import android.app.Service;
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
    private MyService myService = null;
    private ServiceConnection serviceConnection = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serviceConnection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                Log.v(TAG, "ServiceConnection: onServiceConnected()");
                myService = ((MyService.LocalBinder) service).getService();
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                Log.v(TAG, "ServiceConnection: onServiceDisconnected()");
            }
        };
    }
    public void onStartButtonClicked(View view){
        Intent intent=new Intent(this,MyService.class);
        bindService(intent, serviceConnection, Service.BIND_AUTO_CREATE);
    }
    public void onStopButtonClicked(View view){
        unbindService(serviceConnection);
    }

    public void onUseButtonClicked(View view) {
        if (myService != null) {
            Log.v(TAG, "Using Service: " + myService.add(1, 2));
        }
    }
}
