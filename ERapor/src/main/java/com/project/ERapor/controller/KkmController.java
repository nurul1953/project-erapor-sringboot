package com.project.ERapor.controller;

import com.project.ERapor.dto.KkmDto;
import com.project.ERapor.model.Kkm;
import com.project.ERapor.repositories.KkmRepository;
import com.project.ERapor.service.KkmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class KkmController {
    @Autowired
    private KkmRepository kkmRepository;
    @Autowired
    private KkmService kkmService;

    List<Kkm> kkms = null;
    KkmDto kkmDto = new KkmDto();

    @GetMapping("/getKkm")
    public String getMapel(Model model) throws Exception{
        kkms = kkmRepository.getKkm();
        model.addAttribute("kkm", kkms);
        model.addAttribute("kkmDto",kkmDto);
        return "kkm";
    }


    @RequestMapping(value = "/insertKkm", method = RequestMethod.GET)
    public String insertData(ModelMap modelMap) throws Exception{
        modelMap.addAttribute("kkmDto", kkmDto);
        return "insertKkm";
    }

    @RequestMapping(value = "/saveKkm", method = RequestMethod.POST)
    public  String insertMapel(KkmDto kkmDto) throws Exception{
        kkmService.insertKKm(kkmDto);
        return "redirect:/getKkm";
    }

    @GetMapping("/updateKkm")
    public String updateKkm(int id, ModelMap modelMap) throws Exception{
        kkmDto = kkmService.getKkmById(id);
        modelMap.addAttribute("kkmDto", kkmDto);
        return "updateKkm";
    }

    @RequestMapping(value = "/saveUpdateKkm", method = RequestMethod.POST)
    public String updateKkm(KkmDto kkmDto) throws Exception{
        kkmService.updateKkm(kkmDto);
        return "redirect:/getKkm";
    }

    @RequestMapping(value = "/deleteKkm")
    public String deleteMapel(int id){
        kkmService.deleteKkm(id);
        return "redirect:/getKkm";
    }
}
