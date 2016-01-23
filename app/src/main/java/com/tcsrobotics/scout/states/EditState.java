package com.tcsrobotics.scout.states;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tcsrobotics.myapplication.DetailActivity;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/23/16.
 */
public class EditState implements AppState {

    DetailActivity detailActivity;

    public EditState(DetailActivity _detailActivity) {

        this.detailActivity = _detailActivity;
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

        /* enable action bar controls */
    }

    @Override
    public void performSaving() {

    }

    @Override
    public void performModification() {

        detailActivity.setState(detailActivity.getDirtyState());

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
}
