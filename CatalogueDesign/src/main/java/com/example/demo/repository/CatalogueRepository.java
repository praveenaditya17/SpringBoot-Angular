package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.CatalogueDesign;

public interface CatalogueRepository extends CrudRepository<CatalogueDesign,Integer> {

}
