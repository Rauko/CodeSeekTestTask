package com.footballmanager.repository;

import com.footballmanager.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// player table interface
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player save(Player player);

    List<Player> findAll();

    Optional<Player> findById(Long id);

    void deleteById(Long id);
    // JpaRepository
}