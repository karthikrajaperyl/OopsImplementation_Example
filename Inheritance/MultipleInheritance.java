package Inheritance;

import java.util.*;

interface LivingPlace {
	void showLivingPlaces();

	void showBloodConditions();
}

interface AquaticHabitats {
	default void showAquaticHabitats() {
		System.out.println("Aquatic habitat is a body of water in which certain organisms live naturally. \"\n"
				+ "				+ \"In other words, aquatic habitat are habitats or places that relates to lives in water.");
	}
}

interface TerrestrialHabitats {
	default void showTerrestrialHabitats() {

		System.out.println("Terrestrial ecosystems are ecosystems which are found on land. "
				+ "Examples include tundra, taiga, temperate deciduous forest, tropical rain forest, grassland, deserts");

	}
}

class Frog implements LivingPlace, AquaticHabitats, TerrestrialHabitats {
	public String name;

	Frog() {
		this.name = this.getClass().getName();
	}

	public void showLivingPlaces() {
		System.out.println("It lives in Water");
	}

	public void showBloodConditions() {
		System.out.println("It has both warm and cold blooded animals");
	}
	
}

class Fish implements LivingPlace, AquaticHabitats {
	public String name;

	Fish() {
		this.name = this.getClass().getName();
	}

	public void showLivingPlaces() {
		System.out.println("It lives in Water");
	}

	public void showBloodConditions() {
		System.out.println("It has both warm and cold blooded animals");
	}

}

class HomoSapiens implements LivingPlace, TerrestrialHabitats {
	public String name;

	HomoSapiens() {
		this.name = this.getClass().getName();
	}

	public void showLivingPlaces() {
		System.out.println("It lives in Land");
	}

	public void showBloodConditions() {
		System.out.println("Its warm blood animal");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		List<LivingPlace> listObj = new ArrayList<>();
		listObj.add(new Frog());
		listObj.add(new Fish());
		listObj.add(new HomoSapiens());
		for (LivingPlace iterObj : listObj) {
			iterObj.showLivingPlaces();
			iterObj.showBloodConditions();
		}
	}
}
