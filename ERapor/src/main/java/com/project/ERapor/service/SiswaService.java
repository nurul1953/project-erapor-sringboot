package com.project.ERapor.service;

import com.project.ERapor.dto.SiswaDto;
import com.project.ERapor.model.Siswa;

public interface SiswaService {
    public Siswa insertSiswa(SiswaDto siswaDto);
    public SiswaDto getSiswaByNis(int nis);
    public Siswa updateSiswa(SiswaDto siswaDto);
    public boolean deleteSiswa(int nis);
}
