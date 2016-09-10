package cn.aurora_x.android.dialogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LoginDialog loginDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginButtonClicked(View view) {
        loginDialog = new LoginDialog(this);
        loginDialog.show();
    }

    public void onDialogButtonClicked(View view) {
        String user = loginDialog.getEditTextUser().getText().toString().trim();
        String password = loginDialog.getEditTextPassword().getText().toString().trim();
        if (user.equals("Rinko") && password.equals("19980908")) {
            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
