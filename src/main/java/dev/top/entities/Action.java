package dev.top.entities;

public class Action {
	
	public enum Avis {
		AIMER, DETESTER
	}

	private Avis action;



	public Action() {
		
		// TODO Auto-generated constructor stub
	}



	private Action(Avis action) {

		this.action = action;

	}



	public  Avis getAction() {
		return action;
	}



	public void setAction(Avis action) {
		this.action = action;
	}

}


