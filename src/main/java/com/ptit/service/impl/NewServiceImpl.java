package com.ptit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.convert.NewConvert;
import com.ptit.dto.NewDTO;
import com.ptit.entity.NewEntity;
import com.ptit.repository.NewRepository;
import com.ptit.service.NewService;

@Service
public class NewServiceImpl implements NewService {

	@Autowired
	private NewRepository newRepository;

	@Override
	public List<NewDTO> findAll() {
		List<NewDTO> results = new ArrayList<>();
		List<NewEntity> news = newRepository.findAll();
		for (NewEntity entity : news) {
			results.add(NewConvert.toDTO(entity));
		}
		return results;
	}

	@Override
	public NewDTO findById(Long id) {
		return NewConvert.toDTO(newRepository.findById(id).get());
	}

}
