package com.example.bigmemes.creatinecamera;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ryan Mitchell Tuller on 12/13/2016.
 */

public class Notification_Center_Fragment extends Fragment{

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView  = inflater.inflate(R.layout.notification_center_layout,container,false);
        return myView;
    }
}
