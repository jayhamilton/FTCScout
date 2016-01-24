package com.tcsrobotics.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jayhamilton on 1/17/16.
 */
public class DataProvider {
    public static List<FTCTeam> teamList = new ArrayList<FTCTeam>();
    public static Map<String, FTCTeam> teamMap = new HashMap<>();


    static {

        addTeam("robocubs", "8421", 5);
        addTeam("team2", "3434", 1);
    }

    public static void addTeam(String teamName, String teamId, int teamRank) {

        FTCTeam _team = new FTCTeam(teamName);
        _team.setTeamId(teamId);
        _team.setTeamRank(teamRank);
        teamMap.put(teamId, _team);
        teamList.add(_team);
    }

    public static int saveTeam(FTCTeam team) {
        teamMap.put(team.getTeamId(), team);
        teamList.add(team);
        return 0;
    }

    public static int updateTeam(FTCTeam team) {

        int index = 0;
        for (FTCTeam _team : teamList) {
            if (_team == team) {
                teamList.remove(index);
                teamList.add(team);
                break;
            }
            index++;
        }
        teamMap.remove(team.getTeamId());
        teamMap.put(team.getTeamId(), team);
        return 0;
    }

    public static int deleteTeam(FTCTeam team) {
        int index = 0;
        for (FTCTeam _team : teamList) {
            if (_team == team) {
                teamList.remove(index);
                break;
            }
            index++;
        }
        teamMap.remove(team.getTeamId());
        return 0;
    }


    public static FTCTeam findItem(int id) {
        return null;
    }
}
