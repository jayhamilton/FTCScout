package com.tcsrobotics.scout.states;

import android.widget.CompoundButton;
import android.widget.EditText;
import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/23/16.
 */
public class EditState extends CommonStateOps implements AppState {


    public EditState(DetailActivity _detailActivity) {
        super(_detailActivity);
    }


    @Override
    public void performEditing() {

        setDetailControlsState(true);

    }

    @Override
    public void performSaving() {

        DataProvider.updateTeam(getTeamDTOFromUserSettings());
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

        setDetailControlsFromDetailDTO(team.getQuestionnaireDto());


    }
}
