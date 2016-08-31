package cn.aurora_x.android.secondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0&&resultCode==0){
            String res=data.getStringExtra("Result");
            Toast.makeText(this,res,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSwitchClicked(View view){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("Name","Rinko");
        intent.putExtra("Age",18);
        startActivityForResult(intent,0);
    }
}
