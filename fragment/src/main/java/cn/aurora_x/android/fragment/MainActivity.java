package cn.aurora_x.android.fragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;

import cn.aurora_x.android.fragment.word.WordContent;

public class MainActivity extends AppCompatActivity implements WordFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(WordContent.WordItem item) {
        Bundle arguments=new Bundle();
        arguments.putString("id",item.id);
        DetailFragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.fragment_Detail,fragment).commit();
    }
}
