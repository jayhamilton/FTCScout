package com.tcsrobotics.scout.states;


import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCChallengeQuestionnaire;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 9/19/15.
 */
public class DirtyState extends CommonStateOps implements AppState {

    public DirtyState (DetailActivity _detailActivity ,FTCChallengeQuestionnaire _ftcChallengeQuestionnaire) {
        super(_detailActivity,_ftcChallengeQuestionnaire) ;
    }

    @Override
    public void performEditing() {

    }

    @Override
    public void performSaving() {

        setDetailControlsState(false);

        DataProvider.updateTeam(getTeamDTOFromUserSettings());

        detailActivity.getOptionsMenu().findItem(R.id.action_save_active).setVisible(false);

        detailActivity.setState(detailActivity.getSavedState());

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
