package SwiftAcad_Homework_16_Vasil_Stefanov;

import java.io.Serializable;

public class Address implements Serializable {

	private String streetAddress;
	private String city;
	private String state;
	private String postalCode;

	public Address() {
	}

	public Address(String streetAddress, String city, String state, String postalCode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", postalCode="
				+ postalCode + "]";
	}

}
