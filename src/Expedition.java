import java.util.NavigableMap;
import java.util.TreeMap;

public class Expedition {

	public Expedition() {
		this.path=new TreeMap<String,Planet>();
	}

	public enum Direction {
		LAUNCH,
		LAND
	}

	private NavigableMap<String,Planet> path;

	private String name;
	private int mass;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public NavigableMap<String, Planet> getPath() {
		return path;
	}
	public void setPath(NavigableMap<String, Planet> path) {
		this.path = path;
	}



}
