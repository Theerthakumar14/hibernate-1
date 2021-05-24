package com.xworkz.instagram.dao;

import com.xworkz.instagram.dto.InstagramDTO;

public interface InstagramDAO {
	
	public void saveInstagramDetails(InstagramDTO instagramdto);
	
	public void getInstagramDetailsById();

}
