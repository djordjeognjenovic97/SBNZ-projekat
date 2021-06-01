package com.sbnz.workoutrecommender.facts;

import com.sbnz.workoutrecommender.model.ExerciseDifficultyLevel;
import com.sbnz.workoutrecommender.model.MuscleGroup;
import com.sbnz.workoutrecommender.model.Rating;

import java.util.List;

public class WorkoutInfo {
    private int numberOfExercises;
    private int numberOfCardioExercises;
    private ExerciseDifficultyLevel exerciseDifficultyLevel;
    private int numberOfExercisesM1;
    private int numberOfExercisesM2;
    private int numberOfExercisesM3;
    private List<MuscleGroup> targetedMuscles;
    private Rating rating;
    private int numberOfBeginner;
    private int numberOfIntermediate;
    private int numberOfAdvanced;

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

    public int getNumberOfExercisesM1() {
        return numberOfExercisesM1;
    }

    public void setNumberOfExercisesM1(int numberOfExercisesM1) {
        this.numberOfExercisesM1 = numberOfExercisesM1;
    }

    public int getNumberOfExercisesM2() {
        return numberOfExercisesM2;
    }

    public void setNumberOfExercisesM2(int numberOfExercisesM2) {
        this.numberOfExercisesM2 = numberOfExercisesM2;
    }

    public int getNumberOfExercisesM3() {
        return numberOfExercisesM3;
    }

    public void setNumberOfExercisesM3(int numberOfExercisesM3) {
        this.numberOfExercisesM3 = numberOfExercisesM3;
    }

    public List<MuscleGroup> getTargetedMuscles() {
        return targetedMuscles;
    }

    public void setTargetedMuscles(List<MuscleGroup> targetedMuscles) {
        this.targetedMuscles = targetedMuscles;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getNumberOfBeginner() {
        return numberOfBeginner;
    }

    public void setNumberOfBeginner(int numberOfBeginner) {
        this.numberOfBeginner = numberOfBeginner;
    }

    public int getNumberOfIntermediate() {
        return numberOfIntermediate;
    }

    public void setNumberOfIntermediate(int numberOfIntermediate) {
        this.numberOfIntermediate = numberOfIntermediate;
    }

    public int getNumberOfAdvanced() {
        return numberOfAdvanced;
    }

    public void setNumberOfAdvanced(int numberOfAdvanced) {
        this.numberOfAdvanced = numberOfAdvanced;
    }
}
