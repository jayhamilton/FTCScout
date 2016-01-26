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
 * Created by jayhamilton on 9/19/15.
 */
public class DirtyState implements AppState {

    DetailActivity detailActivity;

    public DirtyState(DetailActivity _detailActivity) {
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

        //getTeamObject and add it to the dataprovider
        FTCTeam _team = detailActivity.getTeam();
        _team.setTeamId(((EditText) detailActivity.findViewById(R.id.editTextTeamId)).getText().toString());
        _team.setTeamName(((EditText) detailActivity.findViewById(R.id.editTextTeamName)).getText().toString());
        _team.setActive(((CompoundButton) detailActivity.findViewById(R.id.activeTeamSwitch)).isChecked());
        _team.setTeamRank(4);

        DataProvider.updateTeam(_team);

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
