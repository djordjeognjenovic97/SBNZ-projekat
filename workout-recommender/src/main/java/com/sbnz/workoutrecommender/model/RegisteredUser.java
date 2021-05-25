package com.sbnz.workoutrecommender.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RegisteredUser extends User{

    @Enumerated(EnumType.ORDINAL)
    private PreviousExperienceLevel previousExperienceLevel;

    @Enumerated(EnumType.ORDINAL)
    private DailyPhysicalActivity dailyPhysicalActivity;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Workout> workouts;

    public RegisteredUser() {
    }

    public RegisteredUser(Integer id, String firstName, String lastName, String username, String email, String password, PreviousExperienceLevel previousExperienceLevel, DailyPhysicalActivity dailyPhysicalActivity, List<Workout> workouts) {
        super(id, firstName, lastName, username, email, password);
        this.previousExperienceLevel = previousExperienceLevel;
        this.dailyPhysicalActivity = dailyPhysicalActivity;
        this.workouts = workouts;
    }

    public DailyPhysicalActivity getDailyPhysicalActivity() {
        return dailyPhysicalActivity;
    }

    public void setDailyPhysicalActivity(DailyPhysicalActivity dailyPhysicalActivity) {
        this.dailyPhysicalActivity = dailyPhysicalActivity;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public PreviousExperienceLevel getPreviousExperienceLevel() {
        return previousExperienceLevel;
    }

    public void setPreviousExperienceLevel(PreviousExperienceLevel previousExperienceLevel) {
        this.previousExperienceLevel = previousExperienceLevel;
    }
}
