package com.xworkz.sewing.dao;

import com.xworkz.sewing.dto.SewingMachineDTO;

public interface SewingMachineDAO {
	
	public void save(SewingMachineDTO sewingmachinedto);
	
	public void getSewingMachineDetails();
	
	public void updateSewingMachineNameandPrice();
	
	public void deleteSewingMachineDetails();
	
	public void getallSewingMachineRecords();
	
	public void getSewingMachineColourById();

}
