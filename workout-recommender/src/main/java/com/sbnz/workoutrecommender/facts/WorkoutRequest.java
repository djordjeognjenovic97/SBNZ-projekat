package com.sbnz.workoutrecommender.facts;

import com.sbnz.workoutrecommender.model.DailyPhysicalActivity;

public class WorkoutRequest {
    private int trainingDuration;
    private DailyPhysicalActivity dailyPhysicalActivity;

    public WorkoutRequest() {
    }

    public int getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(int trainingDuration) {
        this.trainingDuration = trainingDuration;
    }

    public DailyPhysicalActivity getDailyPhysicalActivity() {
        return dailyPhysicalActivity;
    }

    public void setDailyPhysicalActivity(DailyPhysicalActivity dailyPhysicalActivity) {
        this.dailyPhysicalActivity = dailyPhysicalActivity;
    }
}
