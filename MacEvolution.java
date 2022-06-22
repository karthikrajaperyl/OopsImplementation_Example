import java.util.*;

interface Laptop {
	void setReleaseName();

	void showReleaseName();

	void showReleaseDate();

	void showVersion();
}

interface LaptopFeatures extends Laptop {
	// void showRamSpeed();
	void showMemory();

	void showFeatures();
}

abstract class MacVersion implements Laptop, LaptopFeatures {
	private String name;

	MacVersion() {
		setBrandName();
	}

	public void setBrandName() {
		this.name = "M1 chip";
	}

	public void showBrandName() {
		System.out.println(name);
	}

	public void showFeatures() {
		System.out.println(
				"It is designed to accelerate machine learning tasks across the Mac for things like video analysis, voice recognition, image processing, and more.");
	}

	abstract public void showStorage();
}

class Ventura implements Laptop {
	private String name;
	private String featurePreview;

	Ventura() {
		this.setReleaseName();
	}

	Ventura(String name, String featurePreview) {
		this.name = name;
		this.featurePreview = featurePreview;
	}

	public void setReleaseName() {
		this.name = this.getClass().getName();
	}

	public void showReleaseName() {
		System.out.println(name);
	}

	public void showReleaseDate() {
		System.out.println("Will Anounced Soon");
	}

	public void showVersion() {
		System.out.println("MacOs 13");
	}

	public String getFeaturePreview() {
		return this.featurePreview;
	}

	@Override
	public String toString() {
		return "Name-" + this.name + "Feature-Preview-" + this.featurePreview;
	}
}

class MacEvolution {
	public static void main(String[] args) {
		List<Laptop> laptopList = new ArrayList<>();
		laptopList.add(new Montery());
		laptopList.add(new Ventura());
		for (Laptop iterList : laptopList) {
			System.out.print("Release-Name:");
			iterList.showReleaseName();
			System.out.print("Version-Name:");
			iterList.showVersion();
			System.out.print("Release-Date:");
			iterList.showReleaseDate();
		}
		Ventura venturaObj = new Ventura("ventura", "Zoho Projects");
		System.out.println(venturaObj.toString());
		MonteryPro monteryObj=new MonteryPro();
		monteryObj.setReleaseName("MonteryPro",new Date());
		System.out.println(monteryObj.toString());
	}
}
