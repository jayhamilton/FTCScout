package com.tcsrobotics.scout.states;


import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.FTCTeam;

/**
 * Created by jayhamilton on 9/19/15.
 */
public class SavedState extends CommonStateOps implements AppState {

    public SavedState(DetailActivity _detailActivity) {
        super(_detailActivity);
    }

    @Override
    public void performEditing() {

        setDetailControlsState(true);

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
