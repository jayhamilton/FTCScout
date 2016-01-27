package com.tcsrobotics.scout.states;

import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/23/16.
 */
public class NewState extends CommonStateOps implements AppState {

    public NewState (DetailActivity _detailActivity) {
        super(_detailActivity);
    }


    @Override
    public void performEditing() {

    }

    @Override
    public void performSaving() {

        setDetailControlsState(false);

        DataProvider.saveTeam(getTeamDTOFromUserSettings());

        detailActivity.getOptionsMenu().findItem(R.id.action_save_active).setVisible(false);
        detailActivity.getOptionsMenu().findItem(R.id.action_edit_team_active).setVisible(true);
        detailActivity.getOptionsMenu().findItem(R.id.action_delete_team_active).setVisible(true);

        detailActivity.setState(detailActivity.getSavedState());
    }

    @Override
    public void performModification() {

        detailActivity.getOptionsMenu().findItem(R.id.action_save_active).setVisible(true);
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

        //in this state the team should be empty
        setDetailControlsState(true);

    }
}
