package com.sbnz.workoutrecommender.facts;

import com.sbnz.workoutrecommender.model.DailyPhysicalActivity;
import com.sbnz.workoutrecommender.model.PreviousExperienceLevel;

public class RegisteredUserInfo {

    private int monthsOfPrevTraining;
    private DailyPhysicalActivity dailyPhysicalActivity;
    private PreviousExperienceLevel previousExperienceLevel;

    public RegisteredUserInfo() {
    }

    public int getMonthsOfPrevTraining() {
        return monthsOfPrevTraining;
    }

    public void setMonthsOfPrevTraining(int monthsOfPrevTraining) {
        this.monthsOfPrevTraining = monthsOfPrevTraining;
    }

    public DailyPhysicalActivity getDailyPhysicalActivity() {
        return dailyPhysicalActivity;
    }

    public void setDailyPhysicalActivity(DailyPhysicalActivity dailyPhysicalActivity) {
        this.dailyPhysicalActivity = dailyPhysicalActivity;
    }

    public PreviousExperienceLevel getPreviousExperienceLevel() {
        return previousExperienceLevel;
    }

    public void setPreviousExperienceLevel(PreviousExperienceLevel previousExperienceLevel) {
        this.previousExperienceLevel = previousExperienceLevel;
    }
}
