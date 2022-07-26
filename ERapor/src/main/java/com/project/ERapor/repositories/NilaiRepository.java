package com.project.ERapor.repositories;

import com.project.ERapor.model.Nilai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NilaiRepository extends JpaRepository<Nilai,Integer> {
    @Query("from Nilai order by nama")
    List<Nilai> getNilai();
}
