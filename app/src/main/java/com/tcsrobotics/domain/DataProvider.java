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


        addTeam("Robo Cubx", "8421", 7);
        addTeam("MFS Foxes", "110", 9);
        addTeam("Critical Mass", "207", 9);
        addTeam("Zero Gravity - 22-Z...", "220", 9);
        addTeam("Zero Gravity - DEEZ Nuts", "221", 9);
        addTeam("MFS Hawks", "237", 9);
        addTeam("Reboot", "247", 9);
        addTeam("Fatal Error", "248", 9);
        addTeam("Mech-alodons", "251", 9);
        addTeam("Mighty Irish", "391", 9);
        addTeam("CJCP Cougars", "609", 8);
        addTeam("Mechanical Wave", "755", 9);
        addTeam("Bluetooth Dragons", "756", 6);
        addTeam("Synthetic Soldiers", "757", 7);
        addTeam("Livingston Lancers", "3415", 8);
        addTeam("Fear the Gear", "3567", 7);
        addTeam("Hive Voltage", "3774", 7);
        addTeam("Mecha Lion", "3777", 7);
        addTeam("Team Mercury", "3944", 7);
        addTeam("Highlands Undefined", "3983", 7);
        addTeam("ORC", "4086", 7);
        addTeam("CHS Cougars", "4102", 6);
        addTeam("Hypnotic Robotics", "4215", 6);
        addTeam("Watt the Hex?", "4311", 5);
        addTeam("C'est le Vie", "4328", 6);
        addTeam("NanoGurus", "4347", 6);
        addTeam("The Typhoons", "4390", 6);
        addTeam("Mad Science", "4486", 6);
        addTeam("Black Spartans", "4574", 4);
        addTeam("Hive Voltage 2.0", "4890", 4);
        addTeam("Sparks", "4936", 6);
        addTeam("Watt's Up?", "5169", 6);
        addTeam("Megahertz!", "5212", 5);
        addTeam("Cougar Current", "5332", 5);
        addTeam("W.A.L.K.E.R.S.", "5339", 5);
        addTeam("ORC II", "5354", 5);
        addTeam("TecHounds", "5387", 5);
        addTeam("RoboTux", "5398", 5);
        addTeam("Optimus Bee", "5406", 5);
        addTeam("RoboCougars", "5573", 5);
        addTeam("Gear Up!", "5717", 5);
        addTeam("LBHS", "5912", 5);
        addTeam("WR That Hertz", "5968", 4);
        addTeam("Hyper Nike", "5996", 4);
        addTeam("Platinum Devils", "6018", 3);
        addTeam("W.A.G.S.", "6037", 4);
        addTeam("Pingry Robotics", "6069", 4);
        addTeam("Energized Hazard", "6101", 4);
        addTeam("e=mk2", "6102", 4);
        addTeam("Domo Inferno", "6224", 4);
        addTeam("Metal Marauders", "6337", 4);
        addTeam("Radioactive Raiders", "6508", 4);
        addTeam("Yaliens", "6613", 4);
        addTeam("Piotech", "6719", 4);
        addTeam("TranSisters", "6934", 3);
        addTeam("CodeRunners", "6936", 3);
        addTeam("Bad Wolf", "6980", 3);
        addTeam("CouGEARS", "6983", 3);
        addTeam("Jdroids", "7026", 3);
        addTeam("Cyber Falcons", "7040", 3);
        addTeam("WR The Flux Capcaitors", "7102", 3);
        addTeam("EHT PAL Enforcers", "7149", 3);
        addTeam("Comets", "7251", 3);
        addTeam("Terrier Byte Bots", "7311", 3);
        addTeam("Terrier Byte Bots II", "7312", 3);
        addTeam("Watt's NXT?", "7350", 3);
        addTeam("Deceptibots", "7414", 3);
        /*
        addTeam("The Cyclones,7433,3.00);
        addTeam("Inner City Circuits,7556,3.00);
        addTeam("Cougar Cubs,7959,3.00);
        addTeam("United Nations 2.0,7994,3.00);
        addTeam("Circuit Breakers,8085,3.00);
        addTeam("Millburn Millers,8405,2.00);
        addTeam("Robo Cubx,8421,2.00);
        addTeam("Aperature Scientists,8439,2.00);
        addTeam("CouBOTS,8485,2.00);
        addTeam("LocoMotors,8522,2.00);
        addTeam("WeByte,8574,2.00);
        addTeam("RAMpage,8591,2.00);
        addTeam("Titanium Devils,8705,2.00);
        addTeam("CyberRaptors,8812,2.00);
        addTeam("22nd Century Robotics,8816,2.00);
        addTeam("GRHS Robotics,8902,2.00);
        addTeam("Midnight Magic,9042,2.00);
        addTeam("Demons Run,9129,2.00
        addTeam("Lenape Robotics,9244,2.00
        addTeam("The Mechanical Hounds,9286,2.00
        addTeam("Monroe Minions ,9533,2.00
        addTeam("United Nations 1.0,9554,2.00
        addTeam("Cougar Juniors,9563,2.00
        addTeam("RC Robotics,9709,2.00
        addTeam("Mechanized Bacon,9765,1.00
        addTeam("Mechanical Pioneers,9848,1.00
        addTeam("Chatham Cougars,9853,1.00
        addTeam("Cruise Control,9889,1.00
        addTeam("Team Titanium,9891,1.00
        addTeam("Patriots,9921,1.00
        addTeam("The MidKnight Magic Too,9927,1.00
        addTeam("Matrix Robotics Club,9951,1.00
        addTeam("LANbros,9971,1.00
        addTeam("The Ninejas,9999,1.00
        addTeam("Technologic,10051,1.00
        addTeam("SHR Middle School,10053,1.00
        addTeam("Those Guys,10096,1.00
        addTeam("Lionheart,10159,1.00
        addTeam("HuskieBots,10203,1.00
        addTeam("JerseySTEM,10242,1.00
        addTeam("Robotic Rams,10243,1.00
        addTeam("TBD,10295,1.00
        addTeam("Robo-Dragons,10300,1.00
        addTeam("WR Positive Charge,10343,1.00
        addTeam("SciBots,10467,1.00
        addTeam("Nutley HS,10553,1.00
        addTeam("Emerald Knights,10582,1.00
        addTeam("Wood-Chips,10603,1.00
        addTeam("PCTI 2,10626,1.00
        addTeam("PCTI 1,10627,1.00
        addTeam("United Nations 3.0,10633,1.00
        addTeam("McNair HS JC,10669,1.00
        addTeam("Highlanders,10785,1.00
        addTeam("ML Robotics,10788,1.00
       addTeam(" Freire Fighters,10814,1.00
        addTeam("THC Tornado,10866,1.00
        addTeam("THC Tornado 9,10867,1.00
        addTeam("Lions,10874,1.00
        addTeam("Team Eagle Tech,10880,1.00
        addTeam("Fawkes Robotics,10919,1.00
        addTeam("Prototype Panthers,10920,1.00
        addTeam("Bergen Bees,10927,1.00
        addTeam("Warren Tech Wolves,10928,1.00
        addTeam("Marching Mariners,10974,1.00
        addTeam("Raiders-Shortcircuits,10975,1.00
        */


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

    public static List<FTCTeam> getTeamList(boolean activeTeamsOnly) {
        if (!activeTeamsOnly) {
            return teamList;
        } else {

            List<FTCTeam> activeList = new ArrayList<>();
            for (final FTCTeam t : teamList) {
                if (t.isActive()) {
                    activeList.add(t);
                }
            }
            return activeList;
        }
    }

}
