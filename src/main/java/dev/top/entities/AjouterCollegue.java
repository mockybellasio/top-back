package dev.top.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AjouterCollegue {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String matricule;
	@Column (name="pseudo")
	private String pseudo;
	@Column (name="urlImage")
	private String urlImage;
	
	


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getUrlImage() {
		return urlImage;
	}


	public void setUrlImages(String urlImage) {
		this.urlImage = urlImage;
	}


	public AjouterCollegue( String matricule, String pseudo, String urlImage) {
		super();
		
		this.matricule = matricule;
		this.pseudo = pseudo;
		this.urlImage = urlImage;
		
	}
	
	
}
