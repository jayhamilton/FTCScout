package com.tcsrobotics.scout.states;

import android.widget.EditText;
import com.tcsrobotics.myapplication.*;

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

        initializeDetailControls(team);
        initializeActionBarControls();

    }

    @Override
    public void performUndo() {

    }

    public void initializeDetailControls(FTCTeam team) {

        EditText teamId = (EditText) detailActivity.findViewById(R.id.editTextTeamId);
        EditText teamName = (EditText) detailActivity.findViewById(R.id.editTextTeamName);
        EditText teamRanking = (EditText) detailActivity.findViewById(R.id.editTeamRanking);


        teamId.setText(team.getTeamId());
        teamName.setText(team.getTeamName());
        String _teamRank = team.getTeamRank() + "";
        teamRanking.setText(_teamRank);
    }

    public void initializeActionBarControls() {

    }
}