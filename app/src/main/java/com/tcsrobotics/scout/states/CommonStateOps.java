package com.tcsrobotics.scout.states;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.FTCChallengeQuestionnaire;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/26/16.
 */
public abstract class CommonStateOps {

    DetailActivity detailActivity;
    FTCChallengeQuestionnaire ftcQuestionnaire;

    CommonStateOps(DetailActivity detailActivity, FTCChallengeQuestionnaire ftcQuestionnaire) {
        this.detailActivity = detailActivity;
        this.ftcQuestionnaire = ftcQuestionnaire;
    }

    public void setDetailControlsState(boolean enabled) {
        ViewGroup viewGroup = (GridLayout) detailActivity.findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.isClickable()) {
                child.setEnabled(enabled);
            }
        }
         /* enable questionnaire fragment controls */
        viewGroup = detailActivity.getDetailFragment().getGridLayoutFragment();
        count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            child.setEnabled(enabled);
        }
    }

    public FTCTeam getTeamDTOFromUserSettings() {

        //getTeamObject and add it to the dataprovider
        FTCTeam _team = detailActivity.getTeam();
        _team.setTeamId(((EditText) detailActivity.findViewById(R.id.editTextTeamId)).getText().toString());
        _team.setTeamName(((EditText) detailActivity.findViewById(R.id.editTextTeamName)).getText().toString());
        _team.setActive(((CompoundButton) detailActivity.findViewById(R.id.activeTeamSwitch)).isChecked());

        String rank = ((EditText) detailActivity.findViewById(R.id.editTeamRanking)).getText().toString();
        _team.setTeamRank(Integer.parseInt(rank));

        _team.setQuestionnaireDto(getFTCQuestionnaire().getDetailDTOFromUserSettings());

        return _team;
    }


    public FTCChallengeQuestionnaire getFTCQuestionnaire() {
        return ftcQuestionnaire;
    }
}
