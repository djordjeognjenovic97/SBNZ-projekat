package com.sbnz.workoutrecommender.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RegisteredUser extends User{

    @Enumerated(EnumType.ORDINAL)
    private PreviousExperience previousExperience;

    @Enumerated(EnumType.ORDINAL)
    private DailyPhysicalActivity dailyPhysicalActivity;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Workout> workouts;

    public RegisteredUser() {
    }

    public RegisteredUser(Integer id, String firstName, String lastName, String username, String email, String password, PreviousExperience previousExperience, DailyPhysicalActivity dailyPhysicalActivity, List<Workout> workouts) {
        super(id, firstName, lastName, username, email, password);
        this.previousExperience = previousExperience;
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

    public PreviousExperience getPreviousExperience() {
        return previousExperience;
    }

    public void setPreviousExperience(PreviousExperience previousExperience) {
        this.previousExperience = previousExperience;
    }
}
