package com.footballmanager;

import com.footballmanager.model.Player;
import com.footballmanager.model.Team;
import com.footballmanager.repository.PlayerRepository;
import com.footballmanager.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {
        // Создаем команды
        Team teamA = new Team();
        teamA.setName("Team A");
        teamA.setCommissionRate(5.0);
        teamA.setBalance(1000000.0);

        Team teamB = new Team();
        teamB.setName("Team B");
        teamB.setCommissionRate(7.0);
        teamB.setBalance(1500000.0);

        teamRepository.save(teamA);
        teamRepository.save(teamB);

        // Создаем игроков
        Player player1 = new Player();
        player1.setName("Player One");
        player1.setAge(25);
        player1.setExperienceMonths(12);
        player1.setTeam(teamA);

        Player player2 = new Player();
        player2.setName("Player Two");
        player2.setAge(22);
        player2.setExperienceMonths(24);
        player2.setTeam(teamB);

        playerRepository.save(player1);
        playerRepository.save(player2);
    }
}