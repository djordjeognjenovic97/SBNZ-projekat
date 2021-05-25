package com.sbnz.workoutrecommender.facts;

import com.sbnz.workoutrecommender.model.ExerciseDifficultyLevel;

public class WorkoutInfo {
    private int numberOfExercises;
    private int numberOfCardioExercises;
    private ExerciseDifficultyLevel exerciseDifficultyLevel;

    public WorkoutInfo() {
    }

    public int getNumberOfExercises() {
        return numberOfExercises;
    }

    public void setNumberOfExercises(int numberOfExercises) {
        this.numberOfExercises = numberOfExercises;
    }

    public int getNumberOfCardioExercises() {
        return numberOfCardioExercises;
    }

    public void setNumberOfCardioExercises(int numberOfCardioExercises) {
        this.numberOfCardioExercises = numberOfCardioExercises;
    }

    public ExerciseDifficultyLevel getExerciseDifficultyLevel() {
        return exerciseDifficultyLevel;
    }

    public void setExerciseDifficultyLevel(ExerciseDifficultyLevel exerciseDifficultyLevel) {
        this.exerciseDifficultyLevel = exerciseDifficultyLevel;
    }
}
