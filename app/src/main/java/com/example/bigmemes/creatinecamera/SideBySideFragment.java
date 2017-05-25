package com.example.bigmemes.creatinecamera;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Ryan Mitchell Tuller on 12/13/2016.
 */

public class SideBySideFragment extends Fragment{

    View myView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //launch the side by side fragment
        myView  = inflater.inflate(R.layout.side_by_side_layout,container,false);

        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", MODE_PRIVATE).getBoolean("firstboot",true);

        if (firstboot){
            //Create a toast notification for the user if it's their first time launching the app.
            Context context = getActivity().getApplicationContext();
            CharSequence text = "Click an image to add your first progress picture";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(context, text, duration).show();

            //set the value of firstboot
            getActivity().getSharedPreferences("BOOT_PREF",MODE_PRIVATE)
                    .edit()
                    .putBoolean("firstboot",false)
                    .apply();
        }


        //add the image view objects
        ImageView topPicture = (ImageView) myView.findViewById(R.id.topPicture);
        ImageView bottomPicture = (ImageView) myView.findViewById(R.id.bottomPicture);
        return myView;
    }





}
