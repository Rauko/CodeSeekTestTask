package com.footballmanager.repository;

import com.footballmanager.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    Team save(Team team);

    List<Team> findAll();

    Optional<Team> findById(Long id);

    void deleteById(Long id);
    // JpaRepository
}
