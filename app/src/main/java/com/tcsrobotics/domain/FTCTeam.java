package com.tcsrobotics.domain;

import com.tcsrobotics.challenge.FTCChallengeQuestionnaire;

import java.util.Date;

/**
 * Created by jayhamilton on 1/4/16.
 */
public class FTCTeam implements Comparable<FTCTeam> {


    String teamName;
    String teamId;
    int teamRank;
    Date date;
    boolean active;
    boolean auto;
    String comment;

    FTCChallengeQuestionnaire questionnaire;


    public FTCTeam(String team) {
        setTeamName(team);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public int getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(int teamRank) {
        this.teamRank = teamRank;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public FTCChallengeQuestionnaire getChallengeQuestionaire() {
        return questionnaire;
    }

    public void setChallenge(FTCChallengeQuestionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }


    public boolean equals(Object aThat) {
        if (this == aThat) return true;
        if (!(aThat instanceof FTCTeam)) return false;
        FTCTeam that = (FTCTeam) aThat;
        return
                this.teamId == that.teamId;
    }

    @Override
    public int compareTo(FTCTeam another) {

        return this.getTeamName().trim().toLowerCase().compareTo(another.getTeamName().trim().toLowerCase());
    }
}
