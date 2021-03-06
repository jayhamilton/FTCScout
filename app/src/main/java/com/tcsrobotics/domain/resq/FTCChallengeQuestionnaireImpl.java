package com.tcsrobotics.domain.resq;

import android.widget.CheckBox;
import android.widget.EditText;
import com.tcsrobotics.activity.DetailActivity;
import com.tcsrobotics.domain.FTCChallengeQuestionnaire;
import com.tcsrobotics.myapplication.R;

/**
 * Created by jayhamilton on 1/27/16.
 */
public class FTCChallengeQuestionnaireImpl implements FTCChallengeQuestionnaire {

    DetailActivity detailActivity;

    public FTCChallengeQuestionnaireImpl(DetailActivity detailActivity) {
        this.detailActivity = detailActivity;
    }

    @Override
    public FTCChallengeQuestionnaireDTO getDetailDTOFromUserSettings() {
        FTCChallengeQuestionnaireDTO dto = new FTCChallengeQuestionnaireDTO();

        CheckBox c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto);
        dto.setAutoEnabled(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_beacon);
        dto.setAutoParkBeacon(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_floor_goal);
        dto.setAutoParkField(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_highzone);
        dto.setAutoParkHighZone(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_lowzone);
        dto.setAutoParkLowZone(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_midzone);
        dto.setAutoParkMidZone(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_illuminate_beacon);
        dto.setIllumBeacon(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_release_climbers);
        dto.setReleaseClimbers(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_release_climbers);
        dto.setReleaseClimbers(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_part_mountain);
        dto.setAutoParkPartMnt(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_end_game_all_clear);
        dto.setEndAllClear(c.isChecked());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_end_game_hang);
        dto.setEndBarHang(c.isChecked());

        EditText e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextAutoComment);
        dto.setAutoComment(e.getText().toString());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextTeleopComment);
        dto.setTeleComment(e.getText().toString());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextEndGameComment);
        dto.setEndComment(e.getText().toString());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextDefense);
        dto.setTeleDefense(e.getText().toString());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextScoring);
        dto.setTeleScoring(e.getText().toString());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextMountain);
        int moutainLevel = Integer.parseInt(e.getText().toString());
        dto.setEndMountainLevel(moutainLevel);


        return dto;

    }


    @Override
    public void setDetailControlsFromDetailDTO(FTCChallengeQuestionnaireDTO dto) {

        CheckBox c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto);
        c.setChecked(dto.isAutoEnabled());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_beacon);
        c.setChecked(dto.isAutoParkBeacon());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_floor_goal);
        c.setChecked(dto.isAutoParkField());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_highzone);
        c.setChecked(dto.isAutoParkHighZone());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_lowzone);
        c.setChecked(dto.isAutoParkLowZone());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_midzone);
        c.setChecked(dto.isAutoParkMidZone());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_illuminate_beacon);
        c.setChecked(dto.isIllumBeacon());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_release_climbers);
        c.setChecked(dto.isReleaseClimbers());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_auto_park_part_mountain);
        c.setChecked(dto.isAutoParkPartMnt());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_end_game_all_clear);
        c.setChecked(dto.isEndAllClear());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_end_game_hang);
        c.setChecked(dto.isEndBarHang());

        c = (CheckBox) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.cbx_end_game_all_clear);
        c.setChecked(dto.isEndAllClear());


        EditText e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextAutoComment);
        e.setText(dto.getAutoComment());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextTeleopComment);
        e.setText(dto.getTeleComment());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextEndGameComment);
        e.setText(dto.getEndComment());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextDefense);
        e.setText(dto.getTeleDefense());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextScoring);
        e.setText(dto.getTeleScoring());

        e = (EditText) detailActivity.getDetailFragment().getGridLayoutFragment().findViewById(R.id.editTextMountain);
        e.setText(dto.getEndMountainLevel() + "");
    }
}
