package com.project.ERapor.controller;

import com.project.ERapor.model.Nilai;
import com.project.ERapor.repositories.NilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RaporController {
    @Autowired
    private NilaiRepository nilaiRepository;

    List<Nilai> nilai = null;

    @GetMapping("/getRapor")
    public String getRapor(Model model) throws Exception{
        nilai = nilaiRepository.getNilai();
        model.addAttribute("Nilai", nilai);
        return "lihatRapor";
    }
}
