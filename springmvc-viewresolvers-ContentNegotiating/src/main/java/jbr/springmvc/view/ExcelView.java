package jbr.springmvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import jbr.springmvc.model.Person;

public class ExcelView extends AbstractXlsxView {

  @Override
  protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
      HttpServletResponse response) throws Exception {

    Sheet sheet = workbook.createSheet("persons");

    int rowCount = 0;
    int columnCount = 0;

    // Create header cells
    Row row = sheet.createRow(rowCount++);
    row.createCell(columnCount++).setCellValue("Name");
    row.createCell(columnCount++).setCellValue("Address");
    row.createCell(columnCount++).setCellValue("Phone");

    // Create data cells
    row = sheet.createRow(rowCount++);
    columnCount = 0;
    Person person = (Person) model.get("person");
    row.createCell(columnCount++).setCellValue(person.getName());
    row.createCell(columnCount++).setCellValue(person.getAddress());
    row.createCell(columnCount++).setCellValue(person.getPhone());
  }

}
