
public class Catalina extends MacVersion{
private String name;
Catalina() {
	this.setReleaseName();
}

public void setReleaseName() {
	this.name = this.getClass().getName();
}

public void showReleaseName() {
	System.out.println(name);
}

public void showReleaseDate() {
	System.out.println("October 7, 2019");
}

public void showVersion() {
	System.out.println("macOS 10.15");
}

public void showMemory() {
	System.out.println("64GB");
}

public void showStorage()
{
	System.out.println("512GB, 1TB, 2TB, 4TB");
}
}
