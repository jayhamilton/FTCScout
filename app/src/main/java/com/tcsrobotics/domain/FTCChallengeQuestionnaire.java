package com.tcsrobotics.domain;

import com.tcsrobotics.domain.resq.FTCChallengeQuestionnaireDTO;

/**
 * Created by jayhamilton on 1/27/16.
 */
public interface FTCChallengeQuestionnaire {

    FTCChallengeQuestionnaireDTO getDetailDTOFromUserSettings();

    void setDetailControlsFromDetailDTO(FTCChallengeQuestionnaireDTO dto);

}

