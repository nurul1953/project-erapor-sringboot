package com.project.ERapor.helper;

import com.project.ERapor.model.Nilai;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    static String[] HEADERs = {"nama","mapel","nilai"};
    static String SHEEET = "Nilai";

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Nilai> nilai;

    public ExcelHelper(List<Nilai> nilai) {
        this.nilai = nilai;
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Nilai");
    }

    public static boolean hasExcelFormat(MultipartFile file) {
        if (!TYPE.equals(file.getContentType())){
            return false;
        }
        return true;
    }

    private void writeHeaderRow(){
        Row headerRow = sheet.createRow(0);
        CellStyle style = workbook.createCellStyle();
        XSSFFont fontBold = workbook.createFont();
        fontBold.setBold(true);
        style.setFont(fontBold);

        for(int col=0; col< HEADERs.length; col++){
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(HEADERs[col]);
            cell.setCellStyle(style);
        }
    }

    private void writeDataRow(){
        int rowIdx = 1;
        for(Nilai nl : nilai){
            Row row = sheet.createRow(rowIdx++);
            row.createCell(0).setCellValue(nl.getNama());
            sheet.autoSizeColumn(0);
            row.createCell(1).setCellValue(nl.getMapel());
            sheet.autoSizeColumn(1);
            row.createCell(2).setCellValue(nl.getNilai());
            sheet.autoSizeColumn(2);
        }
    }

    public void NilaiToExcel(HttpServletResponse response) throws IOException {
        writeHeaderRow();
        writeDataRow();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
