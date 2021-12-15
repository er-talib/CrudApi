package com.bidirectional.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="area_information")
public class Area {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int areaCode ;
	private String areaName ;
	private String areaPopulation ;
	
	@OneToOne(mappedBy = "area")
	@JsonBackReference
	private CityInformation cityInformation ;
	
	public CityInformation getCityInformation() {
		return cityInformation;
	}

	public void setCityInformation(CityInformation cityInformation) {
		this.cityInformation = cityInformation;
	}

	public Area(int areaCode, String areaName, String areaPopulation) {
		super();
		this.areaCode = areaCode;
		this.areaName = areaName;
		this.areaPopulation = areaPopulation;
	}

	public Area() {
		
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaPopulation() {
		return areaPopulation;
	}

	public void setAreaPopulation(String areaPopulation) {
		this.areaPopulation = areaPopulation;
	}

	@Override
	public String toString() {
		return "Area [areaCode=" + areaCode + ", areaName=" + areaName + ", areaPopulation=" + areaPopulation + "]";
	}
	
	
	
	

}
