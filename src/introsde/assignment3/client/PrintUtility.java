package introsde.assignment3.client;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import introsde.assignment3.soap.Activity;
import introsde.assignment3.soap.Person;

public class PrintUtility {
	
	PrintWriter output_file;
	
	public PrintUtility() throws FileNotFoundException {
		output_file = new PrintWriter("client-log.txt");
	}
	
	private static String printResponseStatus(String method_name, int method_number, String parameters) {
		String result = "\n";
		result += "=> Method name: " + method_name +"\n";
		result += "=> Method number: " + method_number +"\n";
		result += "=> Parameters: " + parameters +"\n";
		return result;
	}
	
	public void printFunctionLog(String method_name, int method_number, String parameters) {
		System.out.println(printResponseStatus(method_name, method_number, parameters));
		output_file.println(printResponseStatus(method_name, method_number, parameters));
	}
	
	public void printString(String output) {
		System.out.println(output);
		output_file.println(output);
	}
	
	public void printPerson(Person p) {
		String output = "";
		output += "\tPerson ID: " + p.getId() + "\n";
		output += "\t" + p.getFirstname() + " - " + p.getLastname() +"\n";
		System.out.println(output);
		output_file.println(output);
	}
	
	public void printActivity(Activity a) {
		String output = "";
		output += "\tActivity ID: " + a.getId() + "\n";
		output += "\t" + a.getName() + " - " + a.getDescription() + "\n";
		output += "\tType: " + a.getType().getId() + " - " + a.getPreference() + "/10\n";
		System.out.println(output);
		output_file.println(output);
	}

	public void endLog() {
		output_file.close();
	}
	
}
