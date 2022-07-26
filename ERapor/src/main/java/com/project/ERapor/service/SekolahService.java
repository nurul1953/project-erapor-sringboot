package com.project.ERapor.service;

import com.project.ERapor.dto.SekolahDto;
import com.project.ERapor.model.Sekolah;

public interface SekolahService {
    public Sekolah updateSekolah(SekolahDto sekolahDto);
    public SekolahDto getSekolahByNpsn(int npsn);
}
