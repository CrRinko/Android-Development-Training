package cn.aurora_x.android.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "CRRINKO";
    private LocalBinder myBinder = new LocalBinder();
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
    public void onDestroy() {
        Log.v(TAG, "Service: onDestroy()");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG,"Service: onBind()");
        return myBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v(TAG, "Service: onUnbind()");
        return super.onUnbind(intent);
    }
}
