package com.tcsrobotics.domain.resq;

/**
 * Created by jayhamilton on 1/25/16.
 */
public class FTCChallengeQuestionnaireDTO {

    /*autonomous*/
    boolean autoParkBeacon;
    boolean autoParkField;
    boolean autoParkPartMnt;
    boolean autoParkLowZone;
    boolean autoParkMidZone;
    boolean autoParkHighZone;
    boolean autoEnabled;
    boolean illumBeacon;
    boolean releaseClimbers;
    String autoComment;

    public String getAutoComment() {
        return autoComment;
    }

    public void setAutoComment(String autoComment) {
        this.autoComment = autoComment;
    }

    public boolean isEndAllClear() {
        return endAllClear;
    }

    public void setEndAllClear(boolean endAllClear) {
        this.endAllClear = endAllClear;
    }

    public boolean isEndBarHang() {
        return endBarHang;
    }

    public void setEndBarHang(boolean endBarHang) {
        this.endBarHang = endBarHang;
    }

    public String getEndComment() {
        return endComment;
    }

    public void setEndComment(String endComment) {
        this.endComment = endComment;
    }

    public int getEndMountainLevel() {
        return endMountainLevel;
    }

    public void setEndMountainLevel(int endMountainLevel) {
        this.endMountainLevel = endMountainLevel;
    }

    public String getTeleComment() {
        return teleComment;
    }

    public void setTeleComment(String teleComment) {
        this.teleComment = teleComment;
    }

    /*end game*/
    boolean endAllClear;
    boolean endBarHang;
    String endComment;
    int endMountainLevel;

    /*teleop*/
    String teleDefense;
    String teleScoring;
    String teleComment;


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

    public void setAutoEnabled(boolean autoEnabled) {
        this.autoEnabled = autoEnabled;
    }

    public boolean isAutoEnabled() {
        return autoEnabled;
    }


}
