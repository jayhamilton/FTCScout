package com.tcsrobotics.scout.states;

import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.activity.MainActivity;

/**
 * Created by jayhamilton on 1/19/16.
 */
public class InitializedState implements AppState {

    DetailActivity detailActivity;

    public InitializedState(DetailActivity _detailActivity) {

        this.detailActivity = _detailActivity;
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

        String teamId = detailActivity.getIntent().getStringExtra(MainActivity.TEAM_ID);

        FTCTeam team = null;
        if (teamId.compareTo(MainActivity.OP_NEW) == 0) {
            team = new FTCTeam("");
            detailActivity.setState(detailActivity.getNewState());
        } else {
            team = DataProvider.teamMap.get(teamId);
            detailActivity.setState(detailActivity.getEditState());
        }
        detailActivity.setTeam(team);

        detailActivity.getState().showControls(team);

    }

    @Override
    public void performUndo() {

    }

    @Override
    public void showControls(FTCTeam team) {

    }


}