package cn.aurora_x.android.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "CRRINKO";
    public class LocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
    public MyService() {
    }
    public int add(int x,int y){
        return x+y;
    }
    @Override
    public void onCreate() {
        Log.v(TAG, "Service: onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v(TAG, "Service: onStartCommand()");
        int num = intent.getIntExtra("num", 0);
        Log.v(TAG, "num=" + num);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.v(TAG, "Service: onDestroy()");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG,"Service: onBind()");
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
