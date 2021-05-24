package com.xworkz.instagram.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name="instagram")


public class InstagramDTO {
	
	
	
	public InstagramDTO() {
		super();
	}

	@Column(name ="INSTAGRAM_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int instagramId;
	
	@Column(name ="NO_OF_USERS")
	private int noOfusers;
	
	@Column(name ="VERSION")
	private int version;
	
	@Column(name ="NO_OF_FEATURES")
	private int noOfFeatures;
	
	@Column(name ="IS_PUBLIC")
	private boolean isPublic;
	
	@Column(name ="NETWORTH")
	private int networth;
	
	@Column(name ="TYPE")
	private String type ;
	
	public InstagramDTO(int noOfusers, int version, int noOfFeatures, boolean isPublic, int networth, String type) {
		super();
		System.out.println(this.getClass().getSimpleName() +"created");
		this.noOfusers = noOfusers;
		this.version = version;
		this.noOfFeatures = noOfFeatures;
		this.isPublic = isPublic;
		this.networth = networth;
		this.type = type;
	}

	@Override
	public String toString() {
		return "InstagramDTO [instagramId=" + instagramId + ", noOfusers=" + noOfusers + ", version=" + version
				+ ", noOfFeatures=" + noOfFeatures + ", isPublic=" + isPublic + ", networth=" + networth + ", type="
				+ type + "]";
	}
	
	
	

}
