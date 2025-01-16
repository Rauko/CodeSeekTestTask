package com.footballmanager.service;

import com.footballmanager.model.Player;
import com.footballmanager.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Player updatePlayer(Long id, Player playerDetails) {
        Player player = playerRepository.findById(id).orElseThrow();
        player.setName(playerDetails.getName());
        player.setAge(playerDetails.getAge());
        player.setExperienceMonths(playerDetails.getExperienceMonths());
        if (playerDetails.getTeam() != null) {
            player.setTeam(playerDetails.getTeam());
        }
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}