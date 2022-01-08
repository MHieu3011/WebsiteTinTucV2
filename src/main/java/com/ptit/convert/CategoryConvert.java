package com.ptit.convert;

import com.ptit.dto.CategoryDTO;
import com.ptit.entity.CategoryEntity;

public class CategoryConvert {

	public static CategoryDTO toDTO(CategoryEntity entity) {
		CategoryDTO dto = new CategoryDTO();
		dto.setId(entity.getId());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setName(entity.getName());
		dto.setCode(entity.getCode());
		return dto;
	}
}
