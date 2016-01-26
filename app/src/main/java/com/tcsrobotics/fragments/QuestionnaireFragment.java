package com.tcsrobotics.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/25/16.
 */
public class QuestionnaireFragment extends Fragment {

    public QuestionnaireFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View rootView = inflater.inflate(R.layout.ftc_quest_fragment, container, false);
        return rootView;

    }


}
