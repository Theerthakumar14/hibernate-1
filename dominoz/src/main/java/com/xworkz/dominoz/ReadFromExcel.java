package com.xworkz.dominoz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.dominoz.dto.DominozDTO;

public class ReadFromExcel {
	public List<DominozDTO> ReadFromexcel() throws IOException {
		
		List<DominozDTO> list = new ArrayList<DominozDTO>();
		String excelPath = "./data/TestData.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(excelPath));
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
		Iterator<Row> iterator = sheet.iterator();
		while (iterator.hasNext()) {
			Row row = iterator.next();
			if (row.getRowNum() == 0)
				continue;
			DominozDTO dominozDTO = new DominozDTO();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				int columnIndex = cell.getColumnIndex();
				switch (columnIndex + 1) {
				case 1:
					dominozDTO.setName(cell.getStringCellValue());
					break;
				case 2:
					dominozDTO.setLocation(cell.getStringCellValue());
					break;
				case 3:
					dominozDTO.setType(cell.getStringCellValue());
					break;
				case 4:
					dominozDTO.setSize(cell.getStringCellValue());
					break;
				case 5:
					dominozDTO.setPrice(cell.getNumericCellValue());
					break;
				case 6:
					dominozDTO.setAvailable(cell.getBooleanCellValue());
					break;
				}
				
			}
			list.add(dominozDTO);
		}
		xssfWorkbook.close();
		inputStream.close();
		return list;
	}
	

}
