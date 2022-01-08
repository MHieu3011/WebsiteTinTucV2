package com.ptit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ptit.convert.NewConvert;
import com.ptit.dto.NewDTO;
import com.ptit.entity.CategoryEntity;
import com.ptit.entity.NewEntity;
import com.ptit.repository.CategoryRepopsitory;
import com.ptit.repository.NewRepository;
import com.ptit.service.NewService;

@Service
public class NewServiceImpl implements NewService {

	@Autowired
	private NewRepository newRepository;

	@Autowired
	private CategoryRepopsitory categoryRepopsitory;

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
	public NewDTO getById(Long id) {
		NewEntity result = newRepository.getById(id);
		if (result != null) {
			return NewConvert.toDTO(result);
		}
		return null;
	}

//	@Override
//	@Transactional
//	public NewDTO insert(NewDTO newDTO) {
//		NewEntity newEntity = NewConvert.toEntity(newDTO);
//		CategoryEntity category = categoryRepopsitory.findOneByCode(newDTO.getCategoryCode());
//		newEntity.setCategory(category);
//		return NewConvert.toDTO(newRepository.save(newEntity));
//	}
//
//	@Override
//	@Transactional
//	public NewDTO update(NewDTO newDTO) {
//		NewEntity newEntity = newRepository.getById(newDTO.getId());
//		newEntity = NewConvert.toEntity(newDTO, newEntity);
//		CategoryEntity category = categoryRepopsitory.findOneByCode(newDTO.getCategoryCode());
//		newEntity.setCategory(category);
//		return NewConvert.toDTO(newRepository.save(newEntity));
//	}

	@Override
	@Transactional
	public NewDTO save(NewDTO newDTO) {
		NewEntity newEntity = null;
		if (newDTO.getId() != null) {
			newEntity = newRepository.getById(newDTO.getId());
			newEntity = NewConvert.toEntity(newDTO, newEntity);
		} else {
			newEntity = NewConvert.toEntity(newDTO);
		}
		CategoryEntity category = categoryRepopsitory.findOneByCode(newDTO.getCategoryCode());
		newEntity.setCategory(category);
		return NewConvert.toDTO(newRepository.save(newEntity));
	}

	@Override
	@Transactional
	public void delete(long[] ids) {
		for (long id : ids) {
			newRepository.deleteById(id);
		}
	}
}
