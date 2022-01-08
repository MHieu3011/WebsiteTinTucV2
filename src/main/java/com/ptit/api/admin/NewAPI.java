package com.ptit.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ptit.dto.NewDTO;
import com.ptit.service.NewService;

@RestController
public class NewAPI {

	@Autowired
	private NewService newService;

	@GetMapping(value = "/api-new")
	public List<NewDTO> findAll() {
		return newService.findAll();
	}

	@GetMapping(value = "/api-new/{id}")
	public NewDTO findById(@PathVariable Long id) {
		return newService.findById(id);
	}
}
