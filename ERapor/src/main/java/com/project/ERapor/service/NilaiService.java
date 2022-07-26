package com.project.ERapor.service;

import com.project.ERapor.dto.KkmDto;
import com.project.ERapor.dto.NilaiDto;
import com.project.ERapor.model.Nilai;

import java.util.List;

public interface NilaiService {
    public Nilai insertNilai(NilaiDto nilaiDto);
    public NilaiDto getNilaiById(int id);
    public Nilai updateNilai(NilaiDto nilaiDto);
    public boolean deleteNilai(int id);
}
