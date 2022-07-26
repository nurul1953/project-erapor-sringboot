package com.project.ERapor.service;

import com.project.ERapor.dto.SekolahDto;
import com.project.ERapor.model.Sekolah;
import com.project.ERapor.repositories.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SekolahServiceImplement implements SekolahService{
    @Autowired
    SekolahRepository sekolahRepository;

    @Override
    public Sekolah updateSekolah(SekolahDto sekolahDto) {
        Sekolah model = new Sekolah();
        try{
            model.setNpsn(sekolahDto.getNpsn());
            model.setNama(sekolahDto.getNama());
            model.setAlamat(sekolahDto.getAlamat());
            model.setProvinsi(sekolahDto.getProvinsi());
            model.setWeb(sekolahDto.getWeb());
            model.setEmail(sekolahDto.getEmail());
            model.setFoto(sekolahDto.getFoto());
        }catch (Exception e){
            e.printStackTrace();
        }
        return sekolahRepository.save(model);
    }

    @Override
    public SekolahDto getSekolahByNpsn(int npsn) {
        Sekolah model = sekolahRepository.getById(npsn);
        SekolahDto dto = new SekolahDto();
        dto.setNama(model.getNama());
        dto.setNpsn(model.getNpsn());
        dto.setAlamat(model.getAlamat());
        dto.setProvinsi(model.getProvinsi());
        dto.setWeb(model.getWeb());
        dto.setEmail(model.getEmail());
        dto.setFoto(model.getFoto());
        return dto;
    }
}
