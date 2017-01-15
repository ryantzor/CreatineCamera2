package com.example.bigmemes.creatinecamera;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Ryan Mitchell Tuller on 12/13/2016.
 */

public class SideBySideFragment extends Fragment{

    View myView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView  = inflater.inflate(R.layout.side_by_side_layout,container,false);

        ImageView imageViewTop = (ImageView) myView.findViewById(R.id.topPicture);
        ImageView imageViewBottom = (ImageView) myView.findViewById(R.id.bottomPicture);


        return myView;
    }



}
