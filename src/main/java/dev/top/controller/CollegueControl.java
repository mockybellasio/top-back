package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Action;
import dev.top.entities.Action.Avis;
import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@RestController
@RequestMapping("/collegues")
public class CollegueControl {

	@Autowired
	private CollegueRepo collegueRepo;
	


	@GetMapping
	public List<Collegue> findAll() {

		return this.collegueRepo.findAll();

	}
	
	
	@RequestMapping(method = RequestMethod.PATCH, path = "/{pseudo}")

	public Collegue collegueScore(@PathVariable String pseudo,@RequestBody Action action) {
		
        Collegue col =this.collegueRepo.findByPseudo(pseudo);
		
	  if(action.getAction().equals(Avis.AIMER)){
	    	
	    	col.setScore(col.getScore() + 10);
	    	
	    	return this.collegueRepo.findByPseudo(pseudo);
	    	
	    }

	    else if (action.getAction().equals(Avis.DETESTER)) {

	    	col.setScore(col.getScore() - 5);

	    	return this.collegueRepo.findByPseudo(pseudo);

	    }
	return col;	
}
 
	}
	

