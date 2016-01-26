package com.tcsrobotics.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/25/16.
 */
public class QuestionnaireFragment extends Fragment {

    GridLayout gridLayoutFragment;
    public QuestionnaireFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View rootView = inflater.inflate(R.layout.ftc_quest_fragment, container, false);
        this.gridLayoutFragment = (GridLayout)rootView.findViewById(R.id.ftc_detail_fragment);
        return rootView;

    }

    public GridLayout getGridLayoutFragment(){
        return gridLayoutFragment;
    }

}
