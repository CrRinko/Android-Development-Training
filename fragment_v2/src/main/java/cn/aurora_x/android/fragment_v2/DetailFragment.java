package cn.aurora_x.android.fragment_v2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "ID";

    // TODO: Rename and change types of parameters
    private String mParam1;

    private OnFragmentInteractionListener mListener;

    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailFragment newInstance(String param1) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        Log.d("CrRinko","DetailFragment call newInstance(),param1="+param1);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("CrRinko","DetailFragment onCreate()");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            Log.d("CrRinko","DetailFragment mParam1 got");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_detail,container,false);
        TextView word=(TextView)view.findViewById(R.id.tv_word);
        TextView explain=(TextView)view.findViewById(R.id.tv_explain);
        TextView sample=(TextView)view.findViewById(R.id.tv_sample);
        if(mParam1!=null){
            switch (mParam1){
                case "1":
                    Log.d("CrRinko","DetailFragment setText according 1");
                    word.setText("apple");
                    explain.setText("苹果");
                    sample.setText("This apple is very nice.");
                    break;
                case "2":
                    Log.d("CrRinko","DetailFragment setText according 2");
                    word.setText("Orange");
                    explain.setText("橘子");
                    sample.setText("This orange is very nice.");
                    break;
                case "3":
                    Log.d("CrRinko","DetailFragment setText according 3");
                    word.setText("Banana");
                    explain.setText("香蕉");
                    sample.setText("This banana is very nice.");
                    break;
                case "4":
                    Log.d("CrRinko","DetailFragment setText according 4");
                    word.setText("Lemon");
                    explain.setText("柠檬");
                    sample.setText("This lemon is very nice.");
                    break;
                default:
                    Log.d("CrRinko","DetailFragment setText according 0");
                    word.setText("");
                    explain.setText("");
                    sample.setText("");
            }
        }
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
