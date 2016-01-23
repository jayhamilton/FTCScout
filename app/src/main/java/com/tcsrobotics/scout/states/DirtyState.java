package com.tcsrobotics.scout.states;


import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.DetailActivity;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 9/19/15.
 */
public class DirtyState implements AppState {

    DetailActivity detailActivity;

    public DirtyState(DetailActivity _detailActivity) {
        detailActivity = _detailActivity;
    }

    @Override
    public void performEditing() {

    }

    @Override
    public void performSaving() {


        ViewGroup viewGroup = (GridLayout) detailActivity.findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.isClickable()) {
                child.setEnabled(false);
            }
        }
        detailActivity.getOptionsMenu().findItem(R.id.action_save_active).setVisible(false);
        detailActivity.setState(detailActivity.getSavedState());

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
