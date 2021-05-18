package com.sbnz.workoutrecommender.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private int restBetweenExercises;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Feedback feedback;

    @OneToMany(mappedBy = "workout", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WorkoutExercise> workoutExercises;

    @ManyToOne(fetch = FetchType.LAZY)
    private RegisteredUser registeredUser;

    public Workout() {
    }

    public Workout(Long id, String name, int restBetweenExercises, Feedback feedback, List<WorkoutExercise> workoutExercises, RegisteredUser registeredUser) {
        this.id = id;
        this.name = name;
        this.restBetweenExercises = restBetweenExercises;
        this.feedback = feedback;
        this.workoutExercises = workoutExercises;
        this.registeredUser = registeredUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestBetweenExercises() {
        return restBetweenExercises;
    }

    public void setRestBetweenExercises(int restBetweenExercises) {
        this.restBetweenExercises = restBetweenExercises;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public List<WorkoutExercise> getWorkoutExercises() {
        return workoutExercises;
    }

    public void setWorkoutExercises(List<WorkoutExercise> workoutExercises) {
        this.workoutExercises = workoutExercises;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }
}
