package tech.gearsofcode.petclinic.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gearsofcode.petclinic.*;

@RestController
public class VisitController {

	@Autowired
	private VisitService visitService;
	
    @GetMapping("/Visit")
    public List<Visit> findAll() {
        return visitService.findAll();
    }

}