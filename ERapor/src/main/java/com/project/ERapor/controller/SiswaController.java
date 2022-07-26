package com.project.ERapor.controller;

import com.project.ERapor.dto.SiswaDto;
import com.project.ERapor.model.Siswa;
import com.project.ERapor.repositories.SiswaRepository;
import com.project.ERapor.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SiswaController {
    @Autowired
    private SiswaRepository siswaRepository;
    @Autowired
    private SiswaService siswaService;

    List<Siswa> siswas = null;
    SiswaDto siswaDto = new SiswaDto();

    @GetMapping("/getSiswa")
    public String getSiswa(Model model) throws Exception{
        siswas = siswaRepository.getSiswa();
        model.addAttribute("siswa", siswas);
        return "siswa";
    }

    @GetMapping("/insertSiswa")
    public String insertSiswa(ModelMap modelMap) throws Exception{
        modelMap.addAttribute("siswaDto", siswaDto);
        return "insertSiswa";
    }

    @PostMapping("/saveSiswa")
    public String insertData(SiswaDto siswaDto) throws Exception{
        siswaService.insertSiswa(siswaDto);
        return "redirect:/getSiswa";
    }

    @GetMapping("/updateSiswa")
    public String updateSiswa(ModelMap modelMap, int nis) throws Exception{
        siswaDto = siswaService.getSiswaByNis(nis);
        modelMap.addAttribute("siswaDto", siswaDto);
        return "updateSiswa";
    }

    @PostMapping("/saveUpdateSiswa")
    public String updateData(SiswaDto siswaDto) throws Exception{
        siswaService.updateSiswa(siswaDto);
        return "redirect:/getSiswa";
    }

    @RequestMapping(value = "/deleteAnggota")
    public String deleteSiswa(int nis){
        siswaService.deleteSiswa(nis);
        return "redirect:/getSiswa";
    }
}
