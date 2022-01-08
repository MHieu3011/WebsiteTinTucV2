package com.ptit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.convert.CategoryConvert;
import com.ptit.dto.CategoryDTO;
import com.ptit.entity.CategoryEntity;
import com.ptit.repository.CategoryRepopsitory;
import com.ptit.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepopsitory categoryRepopsitory;

	@Override
	public CategoryDTO findOneByCode(String code) {
		CategoryEntity result = categoryRepopsitory.findOneByCode(code);
		if (result != null) {
			return CategoryConvert.toDTO(result);
		}
		return null;
	}

}
