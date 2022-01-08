package com.ptit.service;

import com.ptit.dto.CategoryDTO;

public interface CategoryService {

	CategoryDTO findOneByCode(String code);
}
