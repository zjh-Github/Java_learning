package test;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExportExcel {
    /**
     * Maven 导入依赖
     * <dependency>
     * <groupId>org.apache.poi</groupId>
     * <artifactId>poi</artifactId>
     * <version>4.0.1</version>
     * </dependency>
     * <dependency>
     * <groupId>org.apache.poi</groupId>
     * <artifactId>poi-ooxml</artifactId>
     * <version>4.0.1</version>
     * </dependency>
     *
     */
    private static final String XLS = "xls";
    private static final String XLSX = "xlsx";

    public static void main(String[] args) {
        String excelName = "C:\\Users\\zjh\\Desktop\\data\\珠海更改银行派单客户经理1227.xlsx";
        System.out.println(readExcel(excelName));
    }

    public static List<List<String>> readExcel(String fileName) {
        List<List<String>> result = new ArrayList<>();
        Workbook workbook = null;
        FileInputStream fileInputStream = null;
        try {
            String fileType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("文件不存在");
                return null;
            }
            fileInputStream = new FileInputStream(file);
            workbook = getWorkbook(fileInputStream, fileType);
            result = parseExcel(workbook);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static Workbook getWorkbook(InputStream inputStream, String fileType) throws IOException {
        Workbook workbook = null;
        if (fileType.equalsIgnoreCase(XLS)) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (fileType.equalsIgnoreCase(XLSX)) {
            workbook = new XSSFWorkbook(inputStream);
        }
        return workbook;
    }

    public static List<List<String>> parseExcel(Workbook workbook) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Cell cell;
        int cellNum = 0;
        for (int sheetNum = 0; sheetNum < workbook.getNumberOfSheets(); sheetNum++) {
            Sheet sheet = workbook.getSheetAt(sheetNum);
            if (sheet == null) continue;
            int firstRowNum = sheet.getFirstRowNum();
            Row firstRow = sheet.getRow(firstRowNum);
            if (firstRow == null) {
                System.out.println("解析失败");
            }
            int rowStart = firstRowNum + 1;
            int rowEnd = sheet.getPhysicalNumberOfRows();
            for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
                Row row = sheet.getRow(rowNum);
                if (row == null) continue;
                cell = row.getCell(cellNum++);
                list.add(cell.getStringCellValue());
            }
            result.add(list);
        }
        return result;
    }
}
