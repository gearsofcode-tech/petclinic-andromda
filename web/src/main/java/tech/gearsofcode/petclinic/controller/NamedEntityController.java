package tech.gearsofcode.petclinic.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gearsofcode.petclinic.*;

@RestController
public class NamedEntityController {

	@Autowired
	private NamedEntityService namedEntityService;
	
    @GetMapping("/NamedEntity")
    public List<NamedEntity> findAll() {
        return namedEntityService.findAll();
    }

}