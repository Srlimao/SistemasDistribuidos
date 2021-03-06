import java.io.Serializable;
import java.util.List;

public class ServerModel implements Serializable {

	String name;
	String location;
	List<SectorModel> sectors;
	boolean active;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<SectorModel> getSectors() {
		return sectors;
	}
	public void setSectors(List<SectorModel> sectors) {
		this.sectors = sectors;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
