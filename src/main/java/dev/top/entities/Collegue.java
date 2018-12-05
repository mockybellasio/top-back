package dev.top.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int score;
	@Column (name="pseudo")
	private String pseudo;
	@Column (name="photo")
	private String photo;

	
	public Collegue () {
		
	}
	
	public Collegue(String pseudo,String photo,int score) {
		super();
		this.pseudo = pseudo;
		this.photo = photo;
		this.score = score;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	
}
