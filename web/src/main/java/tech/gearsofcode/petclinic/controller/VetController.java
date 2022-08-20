package tech.gearsofcode.petclinic.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gearsofcode.petclinic.*;

@RestController
public class VetController {

	@Autowired
	private VetService vetService;
	
    @GetMapping("/Vet")
    public List<Vet> findAll() {
        return vetService.findAll();
    }

}