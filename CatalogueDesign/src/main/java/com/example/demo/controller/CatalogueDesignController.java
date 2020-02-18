package com.example.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.CatalogueDesign;
import com.example.demo.service.CatalogueService;

@CrossOrigin
@RestController
@RequestMapping(value="/catalogue")
public class CatalogueDesignController {
	
	@Autowired
	CatalogueService catalogueRepository;

	@RequestMapping("/add")
	public CatalogueDesign  addCatalogue(@RequestBody CatalogueDesign catalogueDesign) {
		return  catalogueRepository.createCatalogue(catalogueDesign);
	}
	
	@PostMapping("/upload")
	public MultipartFile uploadImage(@RequestParam("myFile")MultipartFile file)throws IOException {
		return catalogueRepository.uploadImage(file);
	}
	@GetMapping("/get")
	public Iterable<CatalogueDesign> getCatalogueDetails() {
		return catalogueRepository.getCatalogue();
	}
	
	@Autowired ServletContext context;
	@GetMapping("/getImage")
	@ResponseBody
	public ResponseEntity<Map<String,String>> getImage(){
		
		return catalogueRepository.getAllImage();
		
	}	
}
