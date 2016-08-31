package cn.aurora_x.android.fragment_v2;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.aurora_x.android.fragment_v2.wordList.WordContent;

public class MainActivity extends AppCompatActivity implements WordFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
    }

    @Override
    public void onListFragmentInteraction(WordContent.WordItem item) {
        DetailFragment fragment=DetailFragment.newInstance(item.id);
        fragmentTransaction.replace(R.id.fragment_detail,fragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}