package introsde.assignment3.client;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import introsde.assignment3.soap.Activity;
import introsde.assignment3.soap.ActivityType;
import introsde.assignment3.soap.Person;

public class DataUtility {
	private static XMLGregorianCalendar randomDateFromYear(int year) {
		//create instance of GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, year);
		gc.set(Calendar.MONTH, year % 12); //January = 0
		gc.set(Calendar.DAY_OF_MONTH, (year % 28 +1)); //28 -> suitable for February
		XMLGregorianCalendar xmlCalendar = null;
		try {
			//convert GregorianCalendar to XMLGregorianCalendar
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlCalendar;
	}
	
	public static Person createRandomPerson(int i) {
		Person p = new Person();
		p.setId(0);
		p.setFirstname("Jhon"+i);
		p.setLastname("Doe"+i);
		p.setBirthdate(randomDateFromYear(1993+i));
		return p;
	}
	
	public static Activity createRandomActivity(int i) {
		Activity a = new Activity();
		a.setName("Activity"+i);
		a.setPlace("Trento");
		a.setDescription("Description for client created activity");
		a.setPreference((i%10)+1);
		a.setStartdate(randomDateFromYear(2017));
		ActivityType at = new ActivityType();
		at.setId("Type"+i);
		a.setType(at);
		return a;
	}
}
