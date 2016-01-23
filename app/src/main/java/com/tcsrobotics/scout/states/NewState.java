package com.tcsrobotics.scout.states;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.DetailActivity;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/23/16.
 */
public class NewState implements AppState {

    DetailActivity detailActivity;

    public NewState(DetailActivity _detailActivity) {
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


        EditText teamId = (EditText) detailActivity.findViewById(R.id.editTextTeamId);
        EditText teamName = (EditText) detailActivity.findViewById(R.id.editTextTeamName);
        EditText teamRanking = (EditText) detailActivity.findViewById(R.id.editTeamRanking);


        teamId.setText(team.getTeamId());
        teamName.setText(team.getTeamName());
        String _teamRank = team.getTeamRank() + "";
        teamRanking.setText(_teamRank);

         /* enable controls */
        ViewGroup viewGroup = (GridLayout) detailActivity.findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            child.setEnabled(true);
        }

    }
}
