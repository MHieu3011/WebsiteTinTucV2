package com.ptit.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ptit.dto.NewDTO;
import com.ptit.service.NewService;

@RestController
@RequestMapping(value = "/api-new")
public class NewAPI {

	@Autowired
	private NewService newService;

	@GetMapping
	public List<NewDTO> findAll() {
		return newService.findAll();
	}

	@GetMapping(value = "/{id}")
	public NewDTO getById(@PathVariable Long id) {
		return newService.getById(id);
	}

	@PostMapping
	public NewDTO insert(@RequestBody NewDTO newDTO) {
		return newService.save(newDTO);
	}

	@PutMapping
	public NewDTO update(@RequestBody NewDTO newDTO) {
		return newService.save(newDTO);
	}

	@DeleteMapping
	public void delete(@RequestBody long[] ids) {
		newService.delete(ids);
	}
}
