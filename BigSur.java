public class BigSur extends MacVersion{
	private String name;

	BigSur() {
		this.setReleaseName();
	}

	public void setReleaseName() {
		this.name = this.getClass().getName();
	}

	public void showReleaseName() {
		System.out.println(name);
	}

	public void showReleaseDate() {
		System.out.println("November 12, 2020");
	}

	public void showVersion() {
		System.out.println("MacOs 11");
	}

	public void showMemory() {
		System.out.println("64GB");
	}
	
	public void showStorage()
	{
		System.out.println("512GB, 1TB, 2TB, 4TB");
	}
	
}
