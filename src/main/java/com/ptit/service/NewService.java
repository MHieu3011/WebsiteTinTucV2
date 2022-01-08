package com.ptit.service;

import java.util.List;

import com.ptit.dto.NewDTO;

public interface NewService {

	List<NewDTO> findAll();

	NewDTO getById(Long id);

//	NewDTO insert(NewDTO newDTO);
//
//	NewDTO update(NewDTO newDTO);

	NewDTO save(NewDTO newDTO);

	void delete(long[] ids);
}
