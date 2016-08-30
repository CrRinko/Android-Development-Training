package cn.aurora_x.android.components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    boolean[] checkedList=new boolean[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMyToast(final Toast toast, final int cnt) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                toast.show();
            }
        }, 0, 3000);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                toast.cancel();
                timer.cancel();
            }
        }, cnt );
    }
    public void onCheckboxClicked(View view){
        boolean isChecked=((CheckBox)view).isChecked();
        TextView textView=(TextView)findViewById(R.id.tv_checkbox);
        switch (view.getId()){
            case R.id.cb_it1:
                if(isChecked){
                    checkedList[0]=true;
                    Toast message=Toast.makeText(this,"Item1 selected",Toast.LENGTH_SHORT);
                    showMyToast(message,500);
                }
                else{
                    checkedList[0]=false;
                    Toast message=Toast.makeText(this,"Item1 canceled",Toast.LENGTH_SHORT);
                    showMyToast(message,500);
                }
                break;
            case R.id.cb_it2:
                if(isChecked){
                    checkedList[1]=true;
                    Toast message=Toast.makeText(this,"Item2 selected",Toast.LENGTH_SHORT);
                    showMyToast(message,500);
                }
                else{
                    checkedList[1]=false;
                    Toast message=Toast.makeText(this,"Item2 canceled",Toast.LENGTH_SHORT);
                    showMyToast(message,500);
                }
                break;
            case R.id.cb_it3:
                if(isChecked){
                    checkedList[2]=true;
                    Toast message=Toast.makeText(this,"Item3 selected",Toast.LENGTH_SHORT);
                    showMyToast(message,500);
                }
                else{
                    checkedList[2]=false;
                    Toast message=Toast.makeText(this,"Item3 canceled",Toast.LENGTH_SHORT);
                    showMyToast(message,500);
                }
                break;
        }
        String showMessage="CheckBox: ";
        for(int i=0;i<3;i++){
            if(checkedList[i]){
                showMessage+="item"+(i+1)+" ";
            }
        }
        textView.setText(showMessage);
    }
    public void onRadioButtonClicked(View view){
        TextView textView=(TextView)findViewById(R.id.tv_radio);
        switch (view.getId()){
            case R.id.rb_it1:
                textView.setText("Radio: Item1");
                break;
            case R.id.rb_it2:
                textView.setText("Radio: Item2");
                break;
            case R.id.rb_it3:
                textView.setText("Radio: Item3");
                break;
        }
    }
    public void onButtonClinked(View view){
        EditText editText=(EditText)findViewById(R.id.et_change);
        Button button=(Button)view;
        if(editText.getText().toString().equals("Unchanged")){
            editText.setText("Changed!");
            button.setText("Click to Recover");
        }
        else{
            editText.setText("Unchanged");
            button.setText("Click to Change");
        }
    }
}
