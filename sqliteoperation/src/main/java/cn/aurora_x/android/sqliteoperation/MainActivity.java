package cn.aurora_x.android.sqliteoperation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.aurora_x.android.sqliteoperation.content.WordContent;

public class MainActivity extends AppCompatActivity implements WordsFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WordsDBHelper dbHelper=new WordsDBHelper(this);
    }

    @Override
    public void onListFragmentInteraction(WordContent.WordItem item) {

    }
}
