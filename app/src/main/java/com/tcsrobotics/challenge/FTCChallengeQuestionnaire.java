package com.tcsrobotics.challenge;

import com.tcsrobotics.domain.FTCTeam;

/**
 * Created by jayhamilton on 1/25/16.
 */
public interface FTCChallengeQuestionnaire {
    public void setChallenge(Object challengeDTO);

    public void displayChallenge();

    public void rankChallenge(FTCTeam team);

    public void scoreChallenge(FTCTeam team);

    public void saveChallenge(Object challenge);

    public void updateChallenge(Object challenge);

    public void deleteChallenge(Object challenge);


}
