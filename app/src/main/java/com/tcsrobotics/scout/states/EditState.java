package com.tcsrobotics.scout.states;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCTeam;
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
        /* enable main team controls */
        ViewGroup viewGroup = (GridLayout) detailActivity.findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            child.setEnabled(true);
        }

         /* enable questionnaire fragment controls */
        viewGroup = detailActivity.getDetailFragment().getGridLayoutFragment();
        count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            child.setEnabled(true);
        }


    }

    @Override
    public void performSaving() {

        //getTeamObject and add it to the dataprovider
        FTCTeam _team = detailActivity.getTeam();
        _team.setTeamId(((EditText) detailActivity.findViewById(R.id.editTextTeamId)).getText().toString());
        _team.setTeamName(((EditText) detailActivity.findViewById(R.id.editTextTeamName)).getText().toString());
        _team.setTeamRank(4);

        DataProvider.updateTeam(_team);
    }

    @Override
    public void performModification() {
        detailActivity.getOptionsMenu().findItem(R.id.action_save_active).setVisible(true);
        detailActivity.setState(detailActivity.getDirtyState());
    }

    @Override
    public void performDeleting() {

        DataProvider.deleteTeam(detailActivity.getTeam());
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
        CompoundButton isTeamActive = (CompoundButton) detailActivity.findViewById(R.id.activeTeamSwitch);


        teamId.setText(team.getTeamId());
        teamName.setText(team.getTeamName());
        String _teamRank = team.getTeamRank() + "";
        teamRanking.setText(_teamRank);
        isTeamActive.setChecked(team.isActive());


    }
}
