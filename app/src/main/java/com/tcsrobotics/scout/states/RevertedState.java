package com.tcsrobotics.scout.states;

import com.tcsrobotics.domain.FTCChallengeQuestionnaire;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.activity.DetailActivity;

public class RevertedState extends CommonStateOps implements AppState {


    public RevertedState (DetailActivity _detailActivity, FTCChallengeQuestionnaire _ftcChallengeQuestionnaire) {
        super(_detailActivity, _ftcChallengeQuestionnaire);
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
