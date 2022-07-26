package com.project.ERapor.repositories;

import com.project.ERapor.model.Sekolah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SekolahRepository extends JpaRepository<Sekolah,Integer> {
    @Query("From Sekolah")
    public List<Sekolah> getSekolah();
}
