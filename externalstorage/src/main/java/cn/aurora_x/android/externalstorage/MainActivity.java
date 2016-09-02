package cn.aurora_x.android.externalstorage;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private static String MY_FILE_NAME = "TempFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onWriteButtonClicked(View view) {
        OutputStream outputStream = null;
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                File directory = Environment.getExternalStorageDirectory();
                File myFile = new File(directory.getCanonicalPath() + "/" + MY_FILE_NAME);
                FileOutputStream fileOutputStream = new FileOutputStream(myFile);
                outputStream = new BufferedOutputStream(fileOutputStream);
                String content = "Hello world";
                try {
                    outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                } finally {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void onReadButtonClicked(View view) {
        InputStream inputStream = null;
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                File dir = Environment.getExternalStorageDirectory();
                File myFile = new File(dir.getCanonicalPath() + "/" + MY_FILE_NAME);
                FileInputStream fileInputStream = new FileInputStream(myFile);
                inputStream = new BufferedInputStream(fileInputStream);
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                try {
                    inputStream.read(buffer);
                }
                finally {
                    inputStream.close();
                    String message = new String(buffer, "UTF-8");
                    Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        }
    }
}
