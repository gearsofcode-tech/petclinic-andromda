package tech.gearsofcode.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gearsofcode.petclinic.*;
import tech.gearsofcode.petclinic.service.*;

@RestController
public class BaseEntityController {

	@Autowired
	private BaseEntityService baseEntityService;
	
    @GetMapping("/BaseEntity")
    public Iterable<BaseEntity> findAll() {
        return baseEntityService.findAll();
    }

}