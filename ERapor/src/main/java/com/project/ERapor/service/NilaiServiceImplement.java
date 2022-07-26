package com.project.ERapor.service;

import com.project.ERapor.dto.KkmDto;
import com.project.ERapor.dto.NilaiDto;
import com.project.ERapor.model.Kkm;
import com.project.ERapor.model.Nilai;
import com.project.ERapor.repositories.KkmRepository;
import com.project.ERapor.repositories.NilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NilaiServiceImplement implements NilaiService {
    @Autowired
    NilaiRepository nilaiRepository;
    @Autowired
    KkmRepository kkmRepository;
    @Override
    public Nilai insertNilai(NilaiDto nilaiDto) {
        Nilai model = new Nilai();
        try{
            model.setNama(nilaiDto.getNama());
            model.setMapel(nilaiDto.getMapel());
            model.setNilai(nilaiDto.getNilai());
        }catch (Exception e){
            e.printStackTrace();
        }
        return nilaiRepository.save(model);
    }

    @Override
    public NilaiDto getNilaiById(int id) {
        Nilai model = nilaiRepository.getById(id);
        NilaiDto dto = new NilaiDto();
        dto.setId(model.getId());
        dto.setNama(model.getNama());
        dto.setMapel(model.getMapel());
        dto.setNilai(model.getNilai());
        return dto;
    }

    @Override
    public Nilai updateNilai(NilaiDto nilaiDto) {
        Nilai model = new Nilai();
        try{
            model.setId(nilaiDto.getId());
            model.setNama(nilaiDto.getNama());
            model.setMapel(nilaiDto.getMapel());
            model.setNilai(nilaiDto.getNilai());
        }catch (Exception e){
            e.printStackTrace();
        }
        return nilaiRepository.save(model);
    }

    @Override
    public boolean deleteNilai(int id) {
        Nilai model = nilaiRepository.getById(id);
        nilaiRepository.delete(model);
        return true;
    }
}
