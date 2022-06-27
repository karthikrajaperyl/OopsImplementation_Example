package Abstraction;

import java.util.*;

interface Action {
	void setMovement();

	String getMovement();
}

interface Backbone {
	boolean hasBackbone();

	void setPostion(String position);

	void setVitalParts();

	boolean hasVitalParts();

	String getPosition();
}

abstract public class Animalia implements Action, Backbone {
	private String name;
	static int a=10;
	static {
		
	}
	Animalia(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	final public boolean hasBackbone() {
		return true;
	}

	public void showAction(Action actionObj) {
		System.out.println(a);
		System.out.println(actionObj.getMovement());
	}

	abstract public void setMovement();

	abstract public String getMovement();

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		Action vertebrateActionObj = new Vertebrate("Homo Spaiens");
		vertebrateActionObj.setMovement();
		Animalia animalObj1 = (Animalia) vertebrateActionObj;
		animalObj1.showAction(vertebrateActionObj);
		Backbone backboneObj = new Aves("Parrot");
		backboneObj.setPostion("Straight");
		Animalia animalObj2 = (Animalia) backboneObj;
		if (animalObj2.hasBackbone()) {
			System.out.println(animalObj2.getPosition());
		}
	}
}

class Vertebrate extends Animalia {
	private String behaviour;
	private boolean vitalOrgans;
	private String position;

	Vertebrate(String name) {
		super(name);
	}

	public void setMovement() {
		this.behaviour = "It will walk";
	}

	public String getMovement() {
		return behaviour;
	}

	public void setVitalParts() {
		this.vitalOrgans = true;
	}

	public boolean hasVitalParts() {
		return this.vitalOrgans;
	}

	public void setPostion(String name) {
		this.position = name;
	}

	public String getPosition() {
		return position;
	}

}

class Aves extends Animalia {
	private String behaviour;
	private boolean vitalOrgans;
	private String position;

	Aves(String name) {
		super(name);
	}

	public void setMovement() {
		this.behaviour = "It will Fly";
	}

	public String getMovement() {
		return behaviour;
	}

	public void setVitalParts() {
		this.vitalOrgans = true;
	}

	public boolean hasVitalParts() {
		return this.vitalOrgans;
	}

	public void setPostion(String name) {
		this.position = name;
	}

	public String getPosition() {
		return position;
	}
}