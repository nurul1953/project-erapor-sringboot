package com.project.ERapor.service;

import com.project.ERapor.dto.SiswaDto;
import com.project.ERapor.model.Siswa;
import com.project.ERapor.repositories.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiswaServiceImplement implements SiswaService{
    @Autowired
    SiswaRepository siswaRepository;

    @Override
    public Siswa insertSiswa(SiswaDto siswaDto) {
        Siswa model = new Siswa();
        try{
            model.setNama(siswaDto.getNama());
            model.setTgl_lahir(siswaDto.getTgl_lahir());
            model.setJk(siswaDto.getJk());
            model.setAlamat(siswaDto.getAlamat());
            model.setAgama(siswaDto.getAgama());
            model.setNama_ayah(siswaDto.getNama_ayah());
            model.setNama_ibu(siswaDto.getNama_ibu());
            model.setPekerjaan_ayah(siswaDto.getPekerjaan_ayah());
            model.setPekerjaan_ibu(siswaDto.getPekerjaan_ibu());
            model.setAlamat_ayah(siswaDto.getAlamat_ayah());
            model.setAlamat_ibu(siswaDto.getAlamat_ibu());
            model.setNama_wali(siswaDto.getNama_wali());
            model.setPekerjaan_wali(siswaDto.getPekerjaan_wali());
            model.setAlamat_wali(siswaDto.getAlamat_wali());
        }catch (Exception e){
            e.printStackTrace();
        }return siswaRepository.save(model);
    }

    @Override
    public SiswaDto getSiswaByNis(int nis) {
        Siswa model = siswaRepository.getById(nis);
        SiswaDto dto = new SiswaDto();
        dto.setNis(model.getNis());
        dto.setNama(model.getNama());
        dto.setKelas(model.getKelas());
        dto.setTgl_lahir(model.getTgl_lahir());
        dto.setJk(model.getJk());
        dto.setAlamat(model.getAlamat());
        dto.setAgama(model.getAgama());
        dto.setNama_ayah(model.getNama_ayah());
        dto.setNama_ibu(model.getNama_ibu());
        dto.setPekerjaan_ayah(model.getPekerjaan_ayah());
        dto.setPekerjaan_ibu(model.getPekerjaan_ibu());
        dto.setAlamat_ayah(model.getAlamat_ayah());
        dto.setAlamat_ibu(model.getAlamat_ibu());
        dto.setNama_wali(model.getNama_wali());
        dto.setPekerjaan_wali(model.getPekerjaan_wali());
        dto.setAlamat_wali(model.getAlamat_wali());
        return dto;
    }

    @Override
    public Siswa updateSiswa(SiswaDto siswaDto) {
        Siswa model = new Siswa();
        try{
            model.setNis(siswaDto.getNis());
            model.setNama(siswaDto.getNama());
            model.setKelas(siswaDto.getKelas());
            model.setTgl_lahir(siswaDto.getTgl_lahir());
            model.setJk(siswaDto.getJk());
            model.setAlamat(siswaDto.getAlamat());
            model.setAgama(siswaDto.getAgama());
            model.setNama_ayah(siswaDto.getNama_ayah());
            model.setNama_ibu(siswaDto.getNama_ibu());
            model.setPekerjaan_ayah(siswaDto.getPekerjaan_ayah());
            model.setPekerjaan_ibu(siswaDto.getPekerjaan_ibu());
            model.setAlamat_ayah(siswaDto.getAlamat_ayah());
            model.setAlamat_ibu(siswaDto.getAlamat_ibu());
            model.setNama_wali(siswaDto.getNama_wali());
            model.setPekerjaan_wali(siswaDto.getPekerjaan_wali());
            model.setAlamat_wali(siswaDto.getAlamat_wali());
        }catch (Exception e){
            e.printStackTrace();
        }return siswaRepository.save(model);
    }

    @Override
    public boolean deleteSiswa(int nis) {
        Siswa model = siswaRepository.getById(nis);
        siswaRepository.delete(model);
        return true;
    }
}
