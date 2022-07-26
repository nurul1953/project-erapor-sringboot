package com.project.ERapor.service;

import com.project.ERapor.dto.KkmDto;
import com.project.ERapor.model.Kkm;
import com.project.ERapor.repositories.KkmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KkmServiceImplement implements KkmService{
    @Autowired
    KkmRepository kkmRepository;

    @Override
    public Kkm insertKKm(KkmDto kkmDto) {
        Kkm model = new Kkm();
        try{
            model.setMapel(kkmDto.getMapel());
            model.setKkm(kkmDto.getKkm());
        }catch (Exception e){
            e.printStackTrace();
        }return kkmRepository.save(model);
    }

    @Override
    public KkmDto getKkmById(int id) {
        Kkm model = kkmRepository.getById(id);
        KkmDto dto = new KkmDto();
        dto.setId(model.getId());
        dto.setMapel(model.getMapel());
        dto.setKkm(model.getKkm());
        return dto;
    }

    @Override
    public Kkm updateKkm(KkmDto kkmDto) {
        Kkm models = new Kkm();
        try{
            models.setId(kkmDto.getId());
            models.setMapel(kkmDto.getMapel());
            models.setKkm(kkmDto.getKkm());
        }catch (Exception e){
            e.printStackTrace();
        }return kkmRepository.save(models);
    }

    @Override
    public boolean deleteKkm(int id) {
        Kkm model = kkmRepository.getById(id);
        kkmRepository.delete(model);
        return true;
    }
}
