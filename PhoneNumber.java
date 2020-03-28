package SwiftAcad_Homework_16_Vasil_Stefanov;

import java.io.Serializable;


public class PhoneNumber implements Serializable {

	private String type;
	private String number;

	PhoneNumber() {
	}

	public PhoneNumber(String type, String number) {
		super();
		if (type == "") {
			type = "null";
		}
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumber [type=" + type + ", number=" + number + "]";
	}

	
}
