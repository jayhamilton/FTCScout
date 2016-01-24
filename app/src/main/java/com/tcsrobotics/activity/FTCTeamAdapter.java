package com.tcsrobotics.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tcsrobotics.domain.FTCTeam;
import com.tcsrobotics.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jayhamilton on 1/4/16.
 */
public class FTCTeamAdapter extends BaseAdapter implements Filterable{

    private List<FTCTeam> teams;
    private List<FTCTeam> orig;
    public Context context;


    public FTCTeamAdapter(Context context, List<FTCTeam> teams) {

        super();
        this.context = context;
        this.teams = teams;

    }

    public class TeamHolder{

        TextView vteamName;
        TextView vteamId;
        TextView vteamRank;
    }

    @Override
    public int getCount() {
        return teams.size();
    }

    @Override
    public Object getItem(int position) {
        return teams.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        TeamHolder teamHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent,false);
            teamHolder = new TeamHolder();
            teamHolder.vteamName = (TextView) convertView.findViewById(R.id.textTeamName);
            teamHolder.vteamId = (TextView) convertView.findViewById(R.id.textTeamId);
            teamHolder.vteamRank = (TextView) convertView.findViewById(R.id.textTeamRank);
            convertView.setTag(teamHolder);

        }else{

            teamHolder = (TeamHolder) convertView.getTag();
        }

        teamHolder.vteamName.setText( teams.get(position).getTeamName());
        teamHolder.vteamId.setText( teams.get(position).getTeamId());
        teamHolder.vteamRank.setText( teams.get(position).getTeamRank() + "");

        return  convertView;

    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults oReturn = new FilterResults();
                final List<FTCTeam> results = new ArrayList<>();
                if (orig == null)
                    orig = teams;
                if (constraint != null) {
                    if (orig != null && orig.size() > 0) {
                        for (final FTCTeam t : orig) {
                            if (t.getTeamName().toLowerCase()
                                    .contains(constraint.toString()) || t.getTeamId().toLowerCase().contains(constraint.toString()) )
                                results.add(t);
                        }
                    }
                    oReturn.values = results;
                }
                return oReturn;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                teams = (ArrayList<FTCTeam>) results.values;
                notifyDataSetChanged();
            }
        };
    }
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
