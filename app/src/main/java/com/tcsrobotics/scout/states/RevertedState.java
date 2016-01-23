package com.tcsrobotics.scout.states;

import com.tcsrobotics.myapplication.DetailActivity;

public class RevertedState implements AppState {


    DetailActivity detailActivity;

    public RevertedState(DetailActivity _detailActivity) {
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
