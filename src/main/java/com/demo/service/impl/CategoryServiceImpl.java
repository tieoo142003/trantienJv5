package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.DanhMuc;
import com.demo.repository.CategoryRepo;
import com.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public List<DanhMuc> findAll() {
		return categoryRepo.findAll();
	}

}
