package jbr.springmvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jbr.springmvc.model.Person;

public class PdfView extends AbstractPdfView {

  @Override
  protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
      HttpServletRequest request, HttpServletResponse response) throws Exception {

    PdfPTable pdfPTable = new PdfPTable(3);

    pdfPTable.addCell("Name");
    pdfPTable.addCell("Address");
    pdfPTable.addCell("Phone");

    Person person = (Person) model.get("person");
    pdfPTable.addCell(person.getName());
    pdfPTable.addCell(person.getAddress());
    pdfPTable.addCell(String.valueOf(person.getPhone()));

    document.add(pdfPTable);
  }
}