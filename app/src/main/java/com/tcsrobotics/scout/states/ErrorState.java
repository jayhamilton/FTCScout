package com.tcsrobotics.scout.states;


import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.DetailActivity;

/**
 * Created by jayhamilton on 9/19/15.
 */
public class ErrorState implements AppState {

    DetailActivity detailActivity;

    public ErrorState(DetailActivity _detailActivity){
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

    @Override
    public void showControls(FTCTeam team) {

    }
}





