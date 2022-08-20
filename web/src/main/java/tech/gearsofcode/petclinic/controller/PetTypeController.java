package tech.gearsofcode.petclinic.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gearsofcode.petclinic.*;

@RestController
public class PetTypeController {

	@Autowired
	private PetTypeService petTypeService;
	
    @GetMapping("/PetType")
    public List<PetType> findAll() {
        return petTypeService.findAll();
    }

}