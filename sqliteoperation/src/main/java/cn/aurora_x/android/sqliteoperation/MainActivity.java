package cn.aurora_x.android.sqliteoperation;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SQLiteOpenHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbhelper = new WordsDBHelper(this);
        SQLiteDatabase db = dbhelper.getReadableDatabase();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbhelper.close();
    }

}
