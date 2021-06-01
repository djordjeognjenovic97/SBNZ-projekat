package com.sbnz.workoutrecommender.facts;

import com.sbnz.workoutrecommender.model.DailyPhysicalActivity;
import com.sbnz.workoutrecommender.model.MuscleGroup;

import java.util.List;

public class WorkoutRequest {
    private int trainingDuration;
    private DailyPhysicalActivity dailyPhysicalActivity;
    private List<MuscleGroup> muscleGroups;

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

    public List<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }

    public void setMuscleGroups(List<MuscleGroup> muscleGroups) {
        this.muscleGroups = muscleGroups;
    }
}
