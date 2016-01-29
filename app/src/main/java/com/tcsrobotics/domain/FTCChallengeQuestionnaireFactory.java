package com.tcsrobotics.domain;

import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.resq.FTCChallengeQuestionnaireImpl;

/**
 * Created by jayhamilton on 1/27/16.
 */
 public  class FTCChallengeQuestionnaireFactory {

    static FTCChallengeQuestionnaire ftcChallengeQuestionnaire;
    private FTCChallengeQuestionnaireFactory(){}
    public static FTCChallengeQuestionnaire getChallenge(DetailActivity detailActivity){

        if(ftcChallengeQuestionnaire == null) {
            return new FTCChallengeQuestionnaireImpl(detailActivity);
        }else{
            return ftcChallengeQuestionnaire;
        }
    }
}
