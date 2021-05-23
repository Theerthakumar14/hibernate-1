package com.xworkz.sewing.service;

import com.xworkz.sewing.dao.SewingMachineDAO;
import com.xworkz.sewing.dao.SewingMachineDAOImpl;
import com.xworkz.sewing.dto.SewingMachineDTO;

public class SewingMachineServiceImpl implements SewingMachineService{
	SewingMachineDAO sewingMachinedao= new SewingMachineDAOImpl();

	@Override
	public boolean validateSewingMachineDetails(SewingMachineDTO sewingmachinedto) {
		boolean flag=true;
		System.out.println("inside service implementation method");
		if(sewingmachinedto.getColour()==null || sewingmachinedto.getColour().length()<2) {
			System.out.println("Invalid colour");
			flag =false;
		}
		if(sewingmachinedto.getName()==null || sewingmachinedto.getName().length()<4) {
			System.out.println("Invalid name");
			flag =false;
		}
		if(sewingmachinedto.getModel()==null || sewingmachinedto.getModel().length()<5) {
			System.out.println("Invalid model number");
			flag=false;
		}
		if(sewingmachinedto.getPrice()==0||sewingmachinedto.getPrice()<900) {
			System.out.println("pay the full amount");
			flag =false;
			}
		if(sewingmachinedto.getSize()==0 || sewingmachinedto.getSize()<2) {
			System.out.println("provide valid size");
			flag = false;
		}
		if(flag) {
			sewingMachinedao.save(sewingmachinedto);
			System.out.println("added data successfully");
		}
		return false;
	}

	@Override
	public void validateSewingMAchineById() {
		sewingMachinedao.getSewingMachineDetails();
		System.out.println("get the details from database");
	}

}
