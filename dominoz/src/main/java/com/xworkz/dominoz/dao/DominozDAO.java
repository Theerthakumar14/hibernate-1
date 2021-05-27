package com.xworkz.dominoz.dao;

import com.xworkz.dominoz.dto.DominozDTO;

public interface DominozDAO {
	
	public void save(DominozDTO dominozdto);
	
	public void getPizza();
	
	public void updatePizza();
	
	public void deletePizzaId();
	
	public void getAllPizzaRecords();
	
	public void getPizzaNameById();

}
