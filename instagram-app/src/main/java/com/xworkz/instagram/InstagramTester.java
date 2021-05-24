package com.xworkz.instagram;



import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramTester {

	public static void main(String[] args) {
		InstagramDTO instagramDTO = new InstagramDTO(15, 8, 10, false, 2000000, "Business");
		
		InstagramDAO instagramDAOImpl = new InstagramDAOImpl();
		instagramDAOImpl.saveInstagramDetails(instagramDTO);
		instagramDAOImpl.getInstagramDetailsById();
		
	}

}
