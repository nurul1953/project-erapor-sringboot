package com.project.ERapor.repositories;

import com.project.ERapor.model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiswaRepository extends JpaRepository<Siswa,Integer> {
    @Query("from Siswa order by nama")
    public List<Siswa> getSiswa();
}
