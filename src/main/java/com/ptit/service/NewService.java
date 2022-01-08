package com.ptit.service;

import java.util.List;

import com.ptit.dto.NewDTO;

public interface NewService {

	List<NewDTO> findAll();

	NewDTO findById(Long id);
}
