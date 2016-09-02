package cn.aurora_x.android.fileoperation;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private final static String FileName = "AFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onWriteButtonClicked(View view) {
        try {
            FileOutputStream fos = openFileOutput(FileName, Context.MODE_PRIVATE);
            String text = "Rinko 2014011374";
            fos.write(text.getBytes(StandardCharsets.UTF_8));
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public void onReadButtonClicked(View view) throws IOException {
        String str = "";
        try {
            FileInputStream fis = openFileInput(FileName);
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            str = new String(buffer, "UTF-8");
            fis.close();
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
