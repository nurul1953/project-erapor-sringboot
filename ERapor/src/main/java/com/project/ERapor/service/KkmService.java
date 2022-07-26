package com.project.ERapor.service;

import com.project.ERapor.dto.KkmDto;
import com.project.ERapor.model.Kkm;

public interface KkmService {
    public Kkm insertKKm(KkmDto kkmDto);
    public KkmDto getKkmById(int id);
    public Kkm updateKkm(KkmDto kkmDto);
    public boolean deleteKkm(int id);
}
