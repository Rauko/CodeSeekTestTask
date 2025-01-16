package com.footballmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "players") // имя таблицы в БД
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // автоинкрементный ID
    private Long id;

    private String name; // Имя игрока
    private int age; // Возраст игрока
    private int experienceMonths; // Количество месяцев опыта

    @ManyToOne // Многим игрокам соответствует одна команда
    @JoinColumn(name = "team_id") // Внешний ключ для связи с таблицей команд
    private Team team;

    // Геттеры и сеттеры
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperienceMonths() {
        return experienceMonths;
    }

    public void setExperienceMonths(int experienceMonths) {
        this.experienceMonths = experienceMonths;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
