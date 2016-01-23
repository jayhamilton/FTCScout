package com.tcsrobotics.scout.states;

import com.tcsrobotics.myapplication.DetailActivity;

/**
 * Created by jayhamilton on 1/23/16.
 */
public class NewState implements AppState{

    DetailActivity detailActivity;

    public NewState(DetailActivity _detailActivity){
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
