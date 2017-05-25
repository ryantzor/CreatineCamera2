package com.example.bigmemes.creatinecamera;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.design.widget.Snackbar;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * Created by Ryan Mitchell Tuller on 12/13/2016.
 */

public class SideBySideFragment extends Fragment{

    View myView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView  = inflater.inflate(R.layout.side_by_side_layout,container,false);



        //add the image view objects
        ImageView topPicture = (ImageView) myView.findViewById(R.id.topPicture);
        ImageView bottomPicture = (ImageView) myView.findViewById(R.id.bottomPicture);

/*        topPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(SideBySideFragment.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("Alert message to be shown");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });*/
        return myView;
    }

}
