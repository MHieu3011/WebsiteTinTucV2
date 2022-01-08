package com.ptit.convert;

import com.ptit.dto.NewDTO;
import com.ptit.entity.NewEntity;

public class NewConvert {

	public static NewDTO toDTO(NewEntity entity) {
		NewDTO dto = new NewDTO();
		dto.setId(entity.getId());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setTitle(entity.getTitle());
		dto.setThumbnail(entity.getThumbnail());
		dto.setShortDescription(entity.getShortDescription());
		dto.setContent(entity.getContent());
		dto.setCategoryId(entity.getCategory().getId());
		dto.setCategoryCode(entity.getCategory().getCode());
		return dto;
	}
}
