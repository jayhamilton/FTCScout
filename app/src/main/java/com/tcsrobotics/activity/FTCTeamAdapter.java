package com.tcsrobotics.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

import java.util.List;

/**
 * Created by jayhamilton on 1/4/16.
 */
public class FTCTeamAdapter extends ArrayAdapter<FTCTeam> {

    private List<FTCTeam> teams;

    public FTCTeamAdapter(Context context, int resource, List<FTCTeam> objects) {

        super(context, resource, objects);

        teams = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        FTCTeam team = teams.get(position);
        TextView teamName = (TextView) convertView.findViewById(R.id.textTeamName);
        TextView teamNumber = (TextView) convertView.findViewById(R.id.textTeamId);
        TextView teamRank = (TextView) convertView.findViewById(R.id.textTeamRank);
        teamName.setText(team.getTeamName());
        teamNumber.setText(team.getTeamId());
        teamRank.setText(team.getTeamRank() + "");

        return  convertView;

    }
}
