package capgeminiAssignments;

public class Address {
	private String street,city,state,country;
	private int zipcode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public String toString() {
		return "\n   Street: "+this.getStreet()+"\n   City: "+this.getCity()+"\n   State: "+this.getState()+"\n   Zipcode: "+this.getZipcode()+"\n   Country: "+this.getCountry();
	}
    
	
}
