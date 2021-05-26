package com.xworkz.sewing;

import com.xworkz.sewing.dao.SewingMachineDAO;
import com.xworkz.sewing.dao.SewingMachineDAOImpl;
import com.xworkz.sewing.dto.SewingMachineDTO;
import com.xworkz.sewing.service.SewingMachineService;
import com.xworkz.sewing.service.SewingMachineServiceImpl;

public class SewingMachineUtil {

	public static void main(String[] args) {
		
		SewingMachineDTO machineDTO = new SewingMachineDTO("Black", "Computerised stitch", "cmp1579sm45", 5, 20000.00, true);
		SewingMachineService sewingMachineServiceImpl = new SewingMachineServiceImpl();
		//sewingMachineServiceImpl.validateSewingMachineDetails(machineDTO);
		//sewingMachineServiceImpl .validateSewingMachineById();
		//sewingMachineServiceImpl.validatetheSewingMachineByUpdating();
		//sewingMachineServiceImpl.validateTheSewingMachineDetailsByDelete();
		
		SewingMachineDAO dao = new SewingMachineDAOImpl();
		//dao.updateSewingMachineNameandPrice();
		dao.deleteSewingMachineDetails();
		}

}
