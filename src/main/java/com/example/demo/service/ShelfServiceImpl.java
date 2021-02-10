package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Shelf;
import com.example.demo.repo.ShelfRepository;
import com.example.demo.vo.ShelfVO;

@Service
public class ShelfServiceImpl implements ShelfService {
	
	@Autowired
	ShelfRepository shelfRepo;
	
	public void addShelf(ShelfVO shelfVO) {
		Shelf shelf = new Shelf();
		shelf.setName(shelfVO.getName());
		shelfRepo.save(shelf);
	}
}
