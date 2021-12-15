package com.bidirectional.dao;

import org.springframework.data.repository.CrudRepository;

import com.bidirectional.entities.CityInformation;

public interface CityReposetory extends CrudRepository<CityInformation, Integer>{

	public CityInformation findById(int id);
}
