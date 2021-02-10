package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Shelf;

public interface ShelfRepository extends CrudRepository<Shelf, Long> {
	public Shelf findByName(String name);
}
