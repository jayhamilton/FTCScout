package com.tcsrobotics.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.tcsrobotics.domain.FTCChallengeQuestionnaire;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.domain.FTCChallengeQuestionnaireFactory;
import com.tcsrobotics.fragments.QuestionnaireFragment;
import com.tcsrobotics.myapplication.R;
import com.tcsrobotics.scout.states.*;

public class DetailActivity extends AppCompatActivity {

    private Menu optionsMenu;
    final Context context = this;

    AppState state;
    AppState dirtyState;
    AppState initializedState;
    AppState revertedState;
    AppState savedState;
    AppState editState;
    AppState newState;

    FTCTeam team;
    QuestionnaireFragment detailFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /* system calls */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        setDetailFragment((QuestionnaireFragment) getFragmentManager().findFragmentById(R.id.ftc_detail_fragment));

        initialize();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        optionsMenu = menu;

        if (getState() == newState) {
            optionsMenu.findItem(R.id.action_edit_team_active).setVisible(false);
            optionsMenu.findItem(R.id.action_delete_team_active).setVisible(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                Toast.makeText(DetailActivity.this, "This is a message from jay", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_save_active:
                Toast.makeText(DetailActivity.this, "Adding a new team", Toast.LENGTH_SHORT).show();
                state.performSaving();
                return true;
            case R.id.action_edit_team_active:
                state.performEditing();
                return true;
            case R.id.action_delete_team_active:
                showDialog("Sure you want to delete this team ( " + getTeam().getTeamName() + " : " + getTeam().getTeamId() + " )?");
                return true;
            case R.id.action_undo_active:
                state.performUndo();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    public void editControlClickHandler(View view) {

        state.performModification();

    }


    public void showDialog(String msg) {


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set title
        alertDialogBuilder.setTitle(msg);

        // set dialog message
        alertDialogBuilder
                .setMessage("Click no to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        /*perform delete and go back to the main activity*/
                        DetailActivity.this.getState().performDeleting();
                        Intent myIntent = new Intent(DetailActivity.this, MainActivity.class);
                        startActivity(myIntent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

    public void setState(AppState _state) {
        this.state = _state;
    }

    public AppState getState() {
        return state;
    }

    public AppState getDirtyState() {
        return dirtyState;
    }


    public AppState getInitializedState() {
        return initializedState;
    }

    public AppState getRevertedState() {
        return revertedState;
    }


    public AppState getSavedState() {
        return savedState;
    }


    public AppState getEditState() {
        return editState;
    }


    public AppState getNewState() {
        return newState;
    }

    public Menu getOptionsMenu() {
        return optionsMenu;
    }

    private void initialize() {

        FTCChallengeQuestionnaire q = getFTCChallengeQuestionnaire();
        this.dirtyState = new DirtyState(this,q);
        this.initializedState = new InitializedState(this,q);
        this.revertedState = new RevertedState(this,q);
        this.savedState = new SavedState(this,q);
        this.editState = new EditState(this,q);
        this.newState = new NewState(this,q);
        this.state = this.initializedState;
        this.state.initializeDetailScreen();

    }

    private FTCChallengeQuestionnaire getFTCChallengeQuestionnaire() {

        return FTCChallengeQuestionnaireFactory.getChallenge(this);
    }

    public FTCTeam getTeam() {
        return team;
    }

    public void setTeam(FTCTeam team) {
        this.team = team;
    }

    public QuestionnaireFragment getDetailFragment() {
        return detailFragment;
    }

    private void setDetailFragment(QuestionnaireFragment detailFragment) {
        this.detailFragment = detailFragment;
    }
}
