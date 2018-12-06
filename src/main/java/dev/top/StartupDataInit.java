package dev.top;

import dev.top.entities.Collegue;
import dev.top.entities.Version;
import dev.top.repos.CollegueRepo;
import dev.top.repos.VersionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupDataInit {

	@Autowired
private	VersionRepo versionRepo;

	@Autowired
private	CollegueRepo collegueRepo;

	@EventListener(ContextRefreshedEvent.class)
    public void init() {

        if(this.versionRepo.count() <= 0) {
            this.versionRepo.save(new Version("v1"));
            this.versionRepo.save(new Version("v2"));
            this.versionRepo.save(new Version("v3"));
            this.versionRepo.save(new Version("v4"));
        }

        
        
       if (this.collegueRepo.count() <= 0) {

			this.collegueRepo.save(new Collegue(600, "rob","https://media.istockphoto.com/photos/nothing-can-break-our-team-picture-id805019062",
					"robert", "dujardin", "robert@hotmail.fr", "7 rue de la grare Montpellier"));

			this.collegueRepo.save(new Collegue(800, "alice ","https://images.pexels.com/photos/265036/pexels-photo-265036.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb",
					"alicia", "delavega", "alicia@hotmail.fr","12 rue de la mossonMontpellier "));
       }
	
	}
}    
