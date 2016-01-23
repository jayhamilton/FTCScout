package com.tcsrobotics.scout.states;


import com.tcsrobotics.myapplication.DetailActivity;

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
}
