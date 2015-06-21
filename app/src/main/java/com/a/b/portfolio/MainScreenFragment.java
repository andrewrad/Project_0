package com.a.b.portfolio;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by Andrew on 6/20/2015.
 */
public class MainScreenFragment extends Fragment implements View.OnClickListener {
    private Button mSpotify;
    private Button mScores;
    private Button mLibrary;
    private Button mBuildItBigger;
    private Button mXyzReader;
    private Button mCapstone;

    public MainScreenFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);
        mSpotify=(Button) view.findViewById(R.id.spotify);
        mScores=(Button) view.findViewById(R.id.scores);
        mLibrary=(Button) view.findViewById(R.id.library);
        mBuildItBigger=(Button) view.findViewById(R.id.build_it_bigger);
        mXyzReader=(Button) view.findViewById(R.id.xyz_reader);
        mCapstone=(Button) view.findViewById(R.id.capstone);

        mSpotify.setOnClickListener(this);
        mScores.setOnClickListener(this);
        mLibrary.setOnClickListener(this);
        mBuildItBigger.setOnClickListener(this);
        mXyzReader.setOnClickListener(this);
        mCapstone.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Button b=(Button) v;
        Toast toast= Toast.makeText(getActivity().getApplicationContext(), "This button will launch the "
                + b.getText() + " app!", Toast.LENGTH_LONG);
//        just for fun, centered and dropped 50 to avoid landing on the library button
        toast.setGravity(Gravity.CENTER, 0,50);
        toast.show();


//        if(v==mSpotify){
//            Log.e("spots", "pressed: "+mSpotify.getText());
//        }else if(v==mScores){
//            Log.e("scores","scoressss");
//        }
    }
}
