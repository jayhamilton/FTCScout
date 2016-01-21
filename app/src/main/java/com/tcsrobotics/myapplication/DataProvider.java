package com.tcsrobotics.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jayhamilton on 1/17/16.
 */
public class DataProvider {
    public static List<FTCTeam> teamList = new ArrayList<FTCTeam>();
    public static Map<String,FTCTeam> teamMap = new HashMap<>();


    static{

        addTeam("team1","2323",5);
        addTeam("team2","3434",1);
    }
    public static void addTeam(String teamName, String teamId, int teamRank){

        FTCTeam _team = new FTCTeam(teamName);
        _team.setTeamId(teamId);
        _team.setTeamRank(teamRank);
        teamMap.put(teamId, _team);
        teamList.add(_team);
    }
    public static int saveTeam(FTCTeam team){
        teamMap.put(team.getTeamId(), team);
        return 0;
    }
    public static int editTeam(FTCTeam team){
        teamMap.remove(team.getTeamId());
        teamMap.put(team.getTeamId(),team);
        return 0;
    }
}
