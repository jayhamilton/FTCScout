package com.tcsrobotics.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.tcsrobotics.scout.states.*;

public class DetailActivity extends AppCompatActivity {

    private Menu optionsMenu;

    AppState state;
    AppState dirtyState;
    AppState errorState;
    AppState initializedState;
    AppState revertedState;
    AppState savedState;
    AppState editState;
    AppState newState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /* system calls */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        initialize();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        optionsMenu = menu;
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
            case R.id.action_add_team:
                Toast.makeText(DetailActivity.this, "Adding a new team", Toast.LENGTH_SHORT).show();
                state.performSaving();
                return true;
            case R.id.action_edit_team:
                state.performEditing();
                return true;
            case R.id.action_delete_team:
                state.performDeleting();
                return true;
            case R.id.action_undo:
                state.performUndo();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }


    public void editControlClickHandler(View view) {

        switch (view.getId()) {

            case R.id.editTeamRanking:
            case R.id.editTextTeamId:
            case R.id.editTextTeamName:
            case R.id.editTextDefenseComment:


                final EditText textControl = (EditText) findViewById(view.getId());
                textControl.addTextChangedListener(new TextWatcher() {

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                        // TODO Auto-generated method stub
                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        // TODO Auto-generated method stub
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                        // TODO Auto-generated method stub
                        Toast.makeText(DetailActivity.this, "Text Changed" + textControl.getText(), Toast.LENGTH_SHORT).show();
                        state.performModification();

                    }
                });
        }

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


    public AppState getErrorState() {
        return errorState;
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

        this.dirtyState = new DirtyState(this);
        this.errorState = new ErrorState(this);
        this.initializedState = new InitializedState(this);
        this.revertedState = new RevertedState(this);
        this.savedState = new SavedState(this);
        this.editState = new EditState(this);
        this.newState = new NewState(this);
        this.state = this.initializedState;
        this.state.initializeDetailScreen();

    }


}
