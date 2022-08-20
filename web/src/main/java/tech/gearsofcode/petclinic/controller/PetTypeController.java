package tech.gearsofcode.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gearsofcode.petclinic.*;
import tech.gearsofcode.petclinic.service.*;

@RestController
public class PetTypeController {

	@Autowired
	private PetTypeService petTypeService;
	
    @GetMapping("/PetType")
    public Iterable<PetType> findAll() {
        return petTypeService.findAll();
    }

}