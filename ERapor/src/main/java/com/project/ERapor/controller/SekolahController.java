package com.project.ERapor.controller;

import com.project.ERapor.dto.SekolahDto;
import com.project.ERapor.model.Sekolah;
import com.project.ERapor.repositories.SekolahRepository;
import com.project.ERapor.service.SekolahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class SekolahController {
    @Autowired
    SekolahRepository sekolahRepository;

    @Autowired
    SekolahService sekolahService;

    List<Sekolah> sekolah = null;
    SekolahDto sekolahDto = new SekolahDto();

    @GetMapping("/getSekolah")
    public String getSekolah(Model model) throws Exception{
        sekolah = sekolahRepository.getSekolah();
        model.addAttribute("Sekolah",sekolah);
        model.addAttribute("SekolahDto",sekolahDto);
        return "sekolah";
    }
    @RequestMapping(value = "/updateSekolah", method = RequestMethod.GET)
    public String updateSekolah(ModelMap modelMap, int npsn) throws Exception{
        sekolahDto = sekolahService.getSekolahByNpsn(npsn);
        modelMap.addAttribute("sekolahDto",sekolahDto);
        return "updateSekolah";
    }

    public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/webapp/images";

    @RequestMapping(value = "/saveSekolah", method = RequestMethod.POST)
    public String updateSekolah(@RequestParam("fileimage") MultipartFile multipartFile, SekolahDto sekolahDto) throws Exception{
        String filename = sekolahDto.getNpsn() + multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().length()-4);
        Path filenameAndPath = Paths.get(uploadDirectory,filename);
        try{
            Files.write(filenameAndPath, multipartFile.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
        sekolahDto.setFoto(filename);
        sekolahService.updateSekolah(sekolahDto);
        return "redirect:/getSekolah";
    }
}
