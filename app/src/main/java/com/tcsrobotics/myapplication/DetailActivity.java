package com.tcsrobotics.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private Menu optionsMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        String teamId = getIntent().getStringExtra(MainActivity.TEAM_ID);

        FTCTeam team = null;

        if (teamId.compareTo(MainActivity.OP_NEW) == 0) {
            team = new FTCTeam("");
        } else {
            team = DataProvider.teamMap.get(teamId);
        }
        showControls(team);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void showControls(FTCTeam team) {

        EditText teamId = (EditText) findViewById(R.id.editTextTeamId);
        EditText teamName = (EditText) findViewById(R.id.editTextTeamName);
        EditText teamRanking = (EditText) findViewById(R.id.editTeamRanking);


        teamId.setText(team.getTeamId());
        teamName.setText(team.getTeamName());
        String _teamRank = team.getTeamRank() + "";
        teamRanking.setText(_teamRank);
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

        //noinspection SimplifiableIfStatement

        switch (id) {
            case R.id.action_settings:
                Toast.makeText(DetailActivity.this, "This is a message from jay", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add_team:
                Toast.makeText(DetailActivity.this, "Adding a new team", Toast.LENGTH_SHORT).show();
                //callDetail(OP_NEW, -1);
                return true;
            case R.id.action_edit_team:
                //change state to edit
                enableControls();
                return true;
            case R.id.action_delete_team:

                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private void enableControls() {
        ViewGroup viewGroup = (GridLayout) findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            child.setEnabled(true);
        }
    }
    private void disableControls() {
        ViewGroup viewGroup = (GridLayout) findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            if(child.isClickable()) {
                child.setEnabled(false);
            }
        }
    }

    private void pageIsDirty() {
        ViewGroup viewGroup = (GridLayout) findViewById(R.id.gridLayout);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = viewGroup.getChildAt(i);
            if(child.isDirty()){
                //enable save
                MenuItem menuItem = optionsMenu.getItem(R.id.action_save);
                menuItem.setEnabled(true);
                break;
            }
        }
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
                       // pageIsDirty();

                    }
                });
        }

    }

}
