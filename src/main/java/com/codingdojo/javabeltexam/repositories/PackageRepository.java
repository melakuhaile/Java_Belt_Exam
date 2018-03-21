package com.codingdojo.javabeltexam.repositories;


import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.javabeltexam.models.Pack;

@Repository
public interface PackageRepository extends CrudRepository<Pack, Long>{
	List<Pack> findAll();

//	Pack updateStatus(String pack);
}