package com.project.ERapor.controller;

import com.project.ERapor.helper.ExcelHelper;
import com.project.ERapor.model.Nilai;
import com.project.ERapor.repositories.NilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class ExcelController {
    @Autowired
    NilaiRepository nilaiRepository;

    @GetMapping("/downloadExcel")
    public void downloadExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=rapor.xlsx";
        response.setHeader(headerKey,headerValue);

        List<Nilai> nl = nilaiRepository.findAll();
        ExcelHelper excelHelper = new ExcelHelper(nl);

        excelHelper.NilaiToExcel(response);
    }
}
