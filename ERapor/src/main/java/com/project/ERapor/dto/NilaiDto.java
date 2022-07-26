package com.project.ERapor.dto;

public class NilaiDto {
    private Integer id;
    private String nama;
    private String mapel;
    private Float nilai;
//    private Integer kkm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public Float getNilai() {
        return nilai;
    }

    public void setNilai(Float nilai) {
        this.nilai = nilai;
    }

//    public Integer getKkm() {
//        return kkm;
//    }
//
//    public void setKkm(Integer kkm) {
//        this.kkm = kkm;
//    }
}
