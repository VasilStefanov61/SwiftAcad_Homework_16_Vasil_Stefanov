package SwiftAcad_Homework_16_Vasil_Stefanov;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




public class Person implements Serializable {
	
	
	private String name;
	private int age;
	private Address address;
	private List<PhoneNumber> phoneNumber;
	
	public Person() {
	
	}

	
	public Person(String name, int age, Address address, List<PhoneNumber> phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber =  (List<PhoneNumber>) phoneNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
	
		return "Person [name=" + name + ", age=" + age + ", address=" + address + 
				", phones=" + phoneNumber + "]";
	}


}
