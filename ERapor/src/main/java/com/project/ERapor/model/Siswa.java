package com.project.ERapor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_siswa")
public class Siswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nis", nullable = false, unique = true)
    private Integer nis;

    @Column(name = "nama")
    private String nama;

    @Column(name = "tgl_lahir")
    private String tgl_lahir;

    @Column(name = "jk")
    private String jk;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "agama")
    private String agama;

    @Column(name = "nama_ayah")
    private String nama_ayah;

    @Column(name = "nama_ibu")
    private String nama_ibu;

    @Column(name = "pekerjaah_ayah")
    private String pekerjaan_ayah;

    @Column(name = "pekerjaah_ibu")
    private String pekerjaan_ibu;

    @Column(name = "alamat_ayah")
    private String alamat_ayah;

    @Column(name = "alamat_ibu")
    private String alamat_ibu;

    @Column(name = "nama_wali")
    private String nama_wali;

    @Column(name = "pekerjaan_wali")
    private String pekerjaan_wali;

    @Column(name = "alamat_wali")
    private String alamat_wali;

    @Column(name = "kelas")
    private String kelas;
}
