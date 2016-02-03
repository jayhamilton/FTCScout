package com.tcsrobotics.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import com.tcsrobotics.database.FTCDBHelper;
import com.tcsrobotics.domain.DataProvider;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    public static final String TEAM_ID = "TEAM_ID";
    public static final String OP_EDIT = "EDIT";
    public static final String OP_NEW = "NEW";

    ListView listView;
    SearchView searchView;
    Switch activeTeamSwitch;
    FTCDBHelper ftcdbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ftcdbHelper = new FTCDBHelper(this);

        listView = (ListView) findViewById(R.id.listView);
        searchView = (SearchView) findViewById(R.id.searchView);
        View header = getLayoutInflater().inflate(R.layout.list_header, null);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /*
                submit message
                */
            }
        });


        final FTCTeamAdapter adapter = new FTCTeamAdapter(this, getTeams(false));
        listView.setAdapter(adapter);
        listView.addHeaderView(header);

        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView _teamId = (TextView) view.findViewById(R.id.textTeamId);

                if (_teamId != null) {
                    callDetail(OP_EDIT, _teamId.getText().toString());
                }
            }
        });

        setupSearchView();

        activeTeamSwitch = (Switch) findViewById(R.id.switch1);
        activeTeamSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean enableActiveTeamFilter) {

                //update adapter with team list and clear adapter's internal filtered list (true)
                adapter.setTeams(getTeams(enableActiveTeamFilter), true);
                adapter.notifyDataSetChanged();
                //reapply filter
                adapter.getFilter().filter(((SearchView) findViewById(R.id.searchView)).getQuery());
            }
        });

    }

    private void setupSearchView() {

        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryHint("Search...");
    }


    private void callDetail(String operation, String teamId) {

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        if (operation.compareTo(OP_EDIT) != 0) {
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
                callDetail(OP_NEW, "");
                return true;
            case R.id.action_about:

                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private List<FTCTeam> getTeams(boolean enableActiveTeamFilter) {
        List<FTCTeam> teamList = DataProvider.getTeamList(enableActiveTeamFilter);
        if (teamList != null && !teamList.isEmpty()) {
            Collections.sort(teamList);
        }
        return teamList;

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)) {
            listView.clearTextFilter();
        } else {
            listView.setFilterText(newText);
        }
        return true;
    }
}
