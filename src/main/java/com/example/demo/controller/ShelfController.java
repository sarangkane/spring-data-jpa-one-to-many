package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ShelfService;
import com.example.demo.vo.ShelfVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/shelf")
@Tag(name = "ShelfController", description = "The Shelf Controller")
public class ShelfController {
	
	@Autowired
	ShelfService shelfService;
	
	@PostMapping
	@Operation(summary = "Method to add an empty shelf")
	@ApiResponse(responseCode = "200", description = "OK")
	public void addShelf(@RequestBody ShelfVO shelfVO) {
		shelfService.addShelf(shelfVO);
	}
	
}
