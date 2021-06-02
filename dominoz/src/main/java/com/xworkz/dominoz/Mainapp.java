package com.xworkz.dominoz;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.xworkz.dominoz.dao.DominozDAO;
import com.xworkz.dominoz.dao.DominozDAOImpl;
import com.xworkz.dominoz.dto.DominozDTO;
import com.xworkz.dominoz.service.DominozServiceImpl;

public class Mainapp {
	private final String NAME ="./data/TestData.xlsx";

	public static void main(String[] args) throws IOException {
		
		
		

	//	DominozDTO dominozDTO = new DominozDTO("Tamoto ", "koramangala", true, "veg", "Medium", 120);
		DominozDAOImpl daoImpl = new DominozDAOImpl();
		ReadFromExcel readFromExcel = new ReadFromExcel();
		List<DominozDTO> readFromexcel2 = readFromExcel.ReadFromexcel();
		for (DominozDTO dominozDTO : readFromexcel2) {
			daoImpl.save(dominozDTO);
			System.out.println(dominozDTO);
			
		}
		// DominozServiceImpl dominozServiceImpl = new DominozServiceImpl();
		// dominozServiceImpl.validatePizzaDetails(dominozDTO);
		// dominozServiceImpl.validatePizzaDetailsById();
		// dominozServiceImpl.updateThePizzaDetails();
		// dominozServiceImpl.deleteThePizzadetails();

		//DominozDAO dominozdao = new DominozDAOImpl();
		// dominozdao.getAllPizzaRecords();
		// dominozdao.getPizzaNameById();
		// dominozdao.loadPizzaPriceByName("Capsicum");
		// dominozdao.loadFirstResultAndMaxResult();
		// dominozdao.getMaxPizzaPrice();
		//dominozdao.getMinPizzaPrice();
		
	
	}

}