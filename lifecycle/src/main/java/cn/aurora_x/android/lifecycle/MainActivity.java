package cn.aurora_x.android.lifecycle;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String myTag="CrRinko";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(myTag,"onCreate()");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.d(myTag,"onRestoreInstanceState()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myTag,"onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(myTag,"onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myTag,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(myTag,"onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myTag,"onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myTag,"onResume()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(myTag,"onSaveInstanceState()");
    }
}
