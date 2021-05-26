package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dao.DominozDAO;
import com.xworkz.dominoz.dao.DominozDAOImpl;
import com.xworkz.dominoz.dto.DominozDTO;

public class DominozServiceImpl implements DominozService {
	DominozDAO dominoz = new DominozDAOImpl();

	@Override
	public boolean validatePizzaDetails(DominozDTO dominozdto) {
		boolean isValid = true;
		System.out.println("Inside service implementation method");

		if (dominozdto.getName() == null || dominozdto.getName().length() < 4 ) {
			System.out.println("invalid name");
			isValid = false;

		if (dominozdto.getLocation() == null || dominozdto.getLocation().length() <5 ) {
				System.out.println("invalid location");
				isValid = false;
			}
		}
		if (dominozdto.getSize() == null || dominozdto.getSize().length() < 4) {
			System.out.println("Provide valid size");
			isValid = false;
		}
		if (dominozdto.getType() == null || dominozdto.getType().length() <2) {
			System.out.println("Provide valid Type");
			isValid = false;
		}
		if (dominozdto.getPrice() == 0 || dominozdto.getPrice()<100) {
			System.out.println("Pay the bill");
		}

		if (isValid) {
			dominoz.save(dominozdto);
		}
		return isValid;

		// return true;

	}

	@Override
	public void validatePizzaDetailsById() {
		dominoz.getPizza();
	}

	@Override
	public void updateThePizzaDetails() {
		dominoz.updatePizza();
		//System.out.println("updated the pizza details");
		
	}

	@Override
	public void deleteThePizzadetails() {
		dominoz.deletePizzaId();
		//System.out.println("Deleted Successfully");
	}
}
