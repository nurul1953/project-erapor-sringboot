package com.project.ERapor.repositories;

import com.project.ERapor.model.Guru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuruRepository extends JpaRepository<Guru,Integer> {
    Guru findByUsernameAndPassword(String username, String password);
}
