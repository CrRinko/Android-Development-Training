package cn.aurora_x.android.sqliteoperation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rinko on 2016/9/2.
 */
public class WordsDBHelper extends SQLiteOpenHelper {
    private final static String DATABASE_NAME = "Data_words";
    private final static int DATABASE_VERSION = 1;
    private final static String SQL_CREATE_TABLE =
            "create table " + Words.Word.TABLE_NAME + "(" +
                    Words.Word.COLUMN_NAME_ID + " integer primary key autoincrement," +
                    Words.Word.COLUMN_NAME_WORD + " text," +
                    Words.Word.COLUMN_NAME_MEANING + " text," +
                    Words.Word.COLUMN_NAME_SAMPLE + " text)";
    private final static String SQL_DROP_TABLE =
            "drop table " + Words.Word.TABLE_NAME;

    public WordsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_TABLE);
        onCreate(db);
    }
}
