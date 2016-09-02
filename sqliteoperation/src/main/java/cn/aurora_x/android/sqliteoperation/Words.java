package cn.aurora_x.android.sqliteoperation;

import android.provider.BaseColumns;

/**
 * Created by Rinko on 2016/9/2.
 */
public class Words {
    public Words() {

    }

    public static abstract class Word implements BaseColumns {
        public static final String TABLE_NAME = "Words";
        public static final String COLUMN_NAME_WORD = "word";
        public static final String COLUMN_NAME_MEANING = "meaning";
        public static final String COLUMN_NAME_SAMPLE = "sample";
        public static final String COLUMN_NAME_ID = "id";
    }
}
