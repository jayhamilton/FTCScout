package com.tcsrobotics.scout.states;


import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 9/19/15.
 */
public class SavedState implements AppState {


    DetailActivity detailActivity;

    public SavedState(DetailActivity _detailActivity) {
        detailActivity = _detailActivity;
    }

    @Override
    public void performEditing() {

         /* enable controls */
        ViewGroup viewGroup = (GridLayout) detailActivity.findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            child.setEnabled(true);
        }
        detailActivity.setState(detailActivity.getEditState());
    }

    @Override
    public void performSaving() {


    }

    @Override
    public void performModification() {

    }


    @Override
    public void performDeleting() {

    }

    @Override
    public void initializeDetailScreen() {

    }

    @Override
    public void performUndo() {
        
    }

    @Override
    public void showControls(FTCTeam team) {

    }
}
