package cn.aurora_x.android.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Intent intent;
    String name;
    Integer age;
    EditText nameEdit,ageEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        intent = getIntent();
        name = intent.getStringExtra("Name");
        age = intent.getIntExtra("Age", 0);
        nameEdit = (EditText) findViewById(R.id.et_name);
        ageEdit = (EditText) findViewById(R.id.et_age);
        nameEdit.setText(name);
        ageEdit.setText(age.toString());
    }

    public void onBackClicked(View view) {
        name=nameEdit.getText().toString();
        String res=name+" "+ageEdit.getText().toString();
        intent.putExtra("Result",res);
        setResult(0,intent);
        finish();
    }
}
