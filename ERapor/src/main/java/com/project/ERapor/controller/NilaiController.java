package com.project.ERapor.controller;

import com.project.ERapor.dto.NilaiDto;
import com.project.ERapor.model.Kkm;
import com.project.ERapor.model.Nilai;
import com.project.ERapor.model.Siswa;
import com.project.ERapor.repositories.KkmRepository;
import com.project.ERapor.repositories.NilaiRepository;
import com.project.ERapor.repositories.SiswaRepository;
import com.project.ERapor.service.NilaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class NilaiController {
    @Autowired
    private NilaiRepository nilaiRepository;
    @Autowired
    private NilaiService nilaiService;
    @Autowired
    private SiswaRepository siswaRepository;
    @Autowired
    private KkmRepository kkmRepository;

    List<Nilai> nilai = null;
    List<Kkm> kkm=null;
    List<Siswa> siswa = null;
    NilaiDto nilaiDto = new NilaiDto();

    @GetMapping("/getNilai")
    public String getNilai(Model model) throws Exception{
        nilai = nilaiRepository.getNilai();
        model.addAttribute("Nilai", nilai);
        return "nilai";
    }

    @RequestMapping(value = "/insertNilai", method = RequestMethod.GET)
    public String insertData(ModelMap modelMap) throws Exception{
        siswa = siswaRepository.getSiswa();
        kkm = kkmRepository.getKkm();
        modelMap.addAttribute("kkm",kkm);
        modelMap.addAttribute("siswa", siswa);
        modelMap.addAttribute("nilaiDto", nilaiDto);
        return "insertNilai";
    }

    @RequestMapping(value = "/saveNilai", method = RequestMethod.POST)
    public  String insertMapel(NilaiDto nilaiDto) throws Exception{
        nilaiService.insertNilai(nilaiDto);
        return "redirect:/getNilai";
    }

    @GetMapping("/updateNilai")
    public String updateNilai(int id, ModelMap modelMap) throws Exception{
        nilaiDto = nilaiService.getNilaiById(id);
        siswa = siswaRepository.getSiswa();
        kkm = kkmRepository.getKkm();
        modelMap.addAttribute("nilaiDto", nilaiDto);
        modelMap.addAttribute("kkm",kkm);
        modelMap.addAttribute("siswa", siswa);
        return "updateNilai";
    }

    @RequestMapping(value = "/saveUpdateNilai", method = RequestMethod.POST)
    public String updateNilai(NilaiDto nilaiDto) throws Exception{
        nilaiService.updateNilai(nilaiDto);
        return "redirect:/getNilai";
    }

    @RequestMapping("/deleteNilai")
    public String deleteNilai(int id){
        nilaiService.deleteNilai(id);
        return "redirect:/getNilai";
    }
}
