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
@Table(name = "tb_sekolah")
public class Sekolah {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "npsn", nullable = false, unique = true)
    private Integer npsn;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "provinsi")
    private String provinsi;

    @Column(name = "web")
    private String web;

    @Column(name = "email")
    private String email;

    @Column(name = "foto")
    private String foto;
}
