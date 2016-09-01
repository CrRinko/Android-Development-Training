package cn.aurora_x.android.intentfilter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSwitchButtonClicked(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("aurora-x://somepath"));
        startActivity(intent);
    }
}
