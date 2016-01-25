package com.tcsrobotics.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by jayhamilton on 1/4/16.
 */
public class FTCTeam implements Comparable<FTCTeam> {

    String teamId;

    public int getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(int teamRank) {
        this.teamRank = teamRank;
    }

    int teamRank;
    String teamName;
    Date date;
    boolean auto;
    boolean autoParkBeacon;
    boolean autoParkField;
    boolean autoParkPartMnt;
    boolean autoParkLowZone;
    boolean autoParkMidZone;
    boolean autoParkHighZone;
    boolean illumBeacon;
    boolean releaseClimbers;
    boolean active;
    String teleDefense;
    String teleScoring;
    String endMountainLevel;
    String endAllClear;
    String endBarHang;
    String comment;
    List<Integer> scores;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public boolean isAutoParkBeacon() {
        return autoParkBeacon;
    }

    public void setAutoParkBeacon(boolean autoParkBeacon) {
        this.autoParkBeacon = autoParkBeacon;
    }

    public boolean isAutoParkField() {
        return autoParkField;
    }

    public void setAutoParkField(boolean autoParkField) {
        this.autoParkField = autoParkField;
    }

    public boolean isAutoParkPartMnt() {
        return autoParkPartMnt;
    }

    public void setAutoParkPartMnt(boolean autoParkPartMnt) {
        this.autoParkPartMnt = autoParkPartMnt;
    }

    public boolean isAutoParkLowZone() {
        return autoParkLowZone;
    }

    public void setAutoParkLowZone(boolean autoParkLowZone) {
        this.autoParkLowZone = autoParkLowZone;
    }

    public boolean isAutoParkMidZone() {
        return autoParkMidZone;
    }

    public void setAutoParkMidZone(boolean autoParkMidZone) {
        this.autoParkMidZone = autoParkMidZone;
    }

    public boolean isAutoParkHighZone() {
        return autoParkHighZone;
    }

    public void setAutoParkHighZone(boolean autoParkHighZone) {
        this.autoParkHighZone = autoParkHighZone;
    }

    public boolean isIllumBeacon() {
        return illumBeacon;
    }

    public void setIllumBeacon(boolean illumBeacon) {
        this.illumBeacon = illumBeacon;
    }

    public boolean isReleaseClimbers() {
        return releaseClimbers;
    }

    public void setReleaseClimbers(boolean releaseClimbers) {
        this.releaseClimbers = releaseClimbers;
    }

    public String getTeleDefense() {
        return teleDefense;
    }

    public void setTeleDefense(String teleDefense) {
        this.teleDefense = teleDefense;
    }

    public String getTeleScoring() {
        return teleScoring;
    }

    public void setTeleScoring(String teleScoring) {
        this.teleScoring = teleScoring;
    }

    public String getEndMountainLevel() {
        return endMountainLevel;
    }

    public void setEndMountainLevel(String endMountainLevel) {
        this.endMountainLevel = endMountainLevel;
    }

    public String getEndAllClear() {
        return endAllClear;
    }

    public void setEndAllClear(String endAllClear) {
        this.endAllClear = endAllClear;
    }

    public String getEndBarHang() {
        return endBarHang;
    }

    public void setEndBarHang(String endBarHang) {
        this.endBarHang = endBarHang;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }


    public FTCTeam(String team) {
        setTeamName(team);
    }

    public boolean equals(Object aThat) {
        if (this == aThat) return true;
        if (!(aThat instanceof FTCTeam)) return false;
        FTCTeam that = (FTCTeam) aThat;
        return
                this.teamId == that.teamId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public int compareTo(FTCTeam another) {

        return this.getTeamName().trim().toLowerCase().compareTo(another.getTeamName().trim().toLowerCase());
    }
}
