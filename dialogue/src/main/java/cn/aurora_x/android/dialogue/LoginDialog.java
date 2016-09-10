package cn.aurora_x.android.dialogue;

import android.app.Dialog;
import android.content.Context;
import android.widget.EditText;

/**
 * Created by Rinko on 2016/9/10.
 */
public class LoginDialog extends Dialog {
    EditText editTextUser;
    EditText editTextPassword;

    public EditText getEditTextPassword() {
        return editTextPassword;
    }

    public EditText getEditTextUser() {
        return editTextUser;
    }

    public LoginDialog(Context context) {
        super(context);
        setContentView(R.layout.login_dialog);
        editTextUser = (EditText) findViewById(R.id.editText_user);
        editTextPassword = (EditText) findViewById(R.id.editText_password);
        setTitle("Login");
    }
}
