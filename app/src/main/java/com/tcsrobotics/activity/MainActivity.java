package com.tcsrobotics.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TEAM_ID = "TEAM_ID";
    public static final String OP_EDIT = "EDIT";
    public static final String OP_NEW = "NEW";

    List<FTCTeam> teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /*
                submit message
                */
            }
        });

        setTeams(DataProvider.teamList);

        FTCTeamAdapter adapter = new FTCTeamAdapter(this, R.layout.list_item, getTeams());
        ListView view = (ListView) findViewById(R.id.listView);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                callDetail(OP_EDIT, position);

            }
        });
    }

    private void callDetail(String operation, int position) {

        FTCTeam team = null;
        String teamId = "";
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        if (operation.compareTo(OP_EDIT) == 0) {
            team = getTeams().get(position);
            teamId = team.getTeamId();
        } else {
            teamId = OP_NEW;
        }
        intent.putExtra(TEAM_ID, teamId);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
                Toast.makeText(MainActivity.this, "This is a message from jay", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add_team:
                Toast.makeText(MainActivity.this, "Adding a new team", Toast.LENGTH_SHORT).show();
                callDetail(OP_NEW, -1);
                return true;
            case R.id.action_about:

                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private List<FTCTeam> getTeams() {
        return teams;
    }

    private void setTeams(List<FTCTeam> teams) {
        this.teams = teams;
    }
}
