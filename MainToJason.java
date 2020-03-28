package SwiftAcad_Homework_16_Vasil_Stefanov;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import MavenDemo.Dog;

public class MainToJason {
	  public static void main( String[] args ) throws SQLException
	    {
	       

	        writeToJSON("json_person.json");
	        readFromJson("json_person.json");

	    }
	  
	  public static void writeToJSON(String file) {
	    	try(FileOutputStream fos = new FileOutputStream(file)) {
	    		Address address = new Address("21 2nd Street","New York","NY","10021");
	    		PhoneNumber phoneNumber = new PhoneNumber("home", "212 555-1234");
	    		PhoneNumber phoneNumber2 = new PhoneNumber("", "646 555-4567");
	    		Person person  = new Person ("John Smith",25,address,
	    				Arrays.asList(phoneNumber,phoneNumber2));
	    		Gson gson = new Gson();
	    		String jsonFormat = gson.toJson(person);
	    		System.out.println(jsonFormat);
	    		fos.write(jsonFormat.getBytes());
	    		
	    		
	    	} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	  
	  public static void readFromJson(String file) {
	    	try(BufferedReader br = new BufferedReader(new FileReader(file))){
	    		String jsonObject = br.readLine();
	    		
	    		Gson gson = new Gson();
	    		
	    		Person person = gson.fromJson(jsonObject, Person.class);
	    		System.out.println(person);
	    	} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	 
}
