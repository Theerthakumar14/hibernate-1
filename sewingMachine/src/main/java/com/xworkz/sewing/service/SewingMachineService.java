package com.xworkz.sewing.service;

import com.xworkz.sewing.dto.SewingMachineDTO;

public interface SewingMachineService {
	
	public boolean validateSewingMachineDetails(SewingMachineDTO sewingmachinedto);
	
	public void validateSewingMachineById();
	
	public void validatetheSewingMachineByUpdating();
	
	public void validateTheSewingMachineDetailsByDelete();

}
