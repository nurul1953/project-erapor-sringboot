package com.project.ERapor.repositories;

import com.project.ERapor.model.Kkm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KkmRepository extends JpaRepository<Kkm, Integer> {
    @Query("from Kkm order by mapel")
    public List<Kkm> getKkm();
}
