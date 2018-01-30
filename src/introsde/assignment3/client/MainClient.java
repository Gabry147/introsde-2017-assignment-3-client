package introsde.assignment3.client;

import java.io.FileNotFoundException;
import java.util.List;

import introsde.assignment3.soap.Activity;
import introsde.assignment3.soap.Person;
import introsde.assignment3.soap.PersonImplService;
import introsde.assignment3.soap.PersonService;

public class MainClient {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Start client");
		//get service
		PersonImplService serverService = new PersonImplService();
		//get interface
        PersonService serverInterface = serverService.getPersonImplPort();
        System.out.println(serverInterface);
        //get class for printing
        PrintUtility pu = new PrintUtility();
        
        // Request #1
        List<Person> init = serverInterface.readPersonList();
        pu.printFunctionLog("readPersonList()", 1, "-");
        pu.printString("\tPerson in DB before client: "+init.size());
        
        // Request #4
        Person p1 = serverInterface.createPerson(DataUtility.createRandomPerson(1));
        pu.printFunctionLog("createPerson()", 4, "random generated person");
        pu.printPerson(p1);
        Person p2 = serverInterface.createPerson(DataUtility.createRandomPerson(2));
        pu.printFunctionLog("createPerson()", 4, "random generated person");
        pu.printPerson(p1);
        
        // Request #1
        List<Person> people = serverInterface.readPersonList();
        pu.printFunctionLog("readPersonList()", 1, "-");
        pu.printString("\tPerson in DB: "+people.size());
        
        // Request #2
        p1 = serverInterface.readPerson(p1.getId());
        pu.printFunctionLog("readPerson()", 2, "the ID of the first person");
        pu.printPerson(p1);
        
        // Request #3
        p1.setLastname("ModifiedLastname");
        p1 = serverInterface.updatePerson(p1);
        pu.printFunctionLog("updatePerson()", 3, "the first person");
        pu.printPerson(p1);
        
        // Request #9
        serverInterface.savePersonPreference(p1.getId(), DataUtility.createRandomActivity(9));
        pu.printFunctionLog("savePersonPreference()", 9, "person1 ID; a random generated activity");
        serverInterface.savePersonPreference(p1.getId(), DataUtility.createRandomActivity(10));
        pu.printFunctionLog("savePersonPreference()", 9, "person1 ID; a random generated activity");
        serverInterface.savePersonPreference(p2.getId(), DataUtility.createRandomActivity(9));
        pu.printFunctionLog("savePersonPreference()", 9, "person2 ID; a random generated activity");

        // Request #7
        List<Activity> allActivities = serverInterface.readPreferences();
        pu.printFunctionLog("readPreferences()", 7, "-");
        for(Activity a : allActivities) {
        	pu.printActivity(a);
        }
        
        // Request #6
        List<Activity> activities = serverInterface.readPersonPreferences(p1.getId(), "Type9");
        pu.printFunctionLog("readPersonPreferences()", 6, "person1 ID; type 'Type9'");
        for(Activity a : activities) {
        	pu.printActivity(a);
        }
        
        // Request #8
        p1 = serverInterface.readPerson(p1.getId()); //get the updated instance of the person
        Activity a1 = serverInterface.readPersonPreference(p1.getId(), p1.getActivitypreference().get(1).getId());
        pu.printFunctionLog("readPersonPreference()", 8, "person1 ID; ID of the first activity");
        pu.printActivity(a1);
        
        // Request #10
        a1.setDescription("Activity modified by client");
        Activity aa = serverInterface.updatePersonPreference(p1.getId(), a1);
        pu.printFunctionLog("updatePersonPreference()", 10, "person1 ID; the first activity modified");
        pu.printActivity(aa);       
        
        // Request #11
        a1 = serverInterface.evaluatePersonPreference(p1.getId(), a1, 5);
        pu.printFunctionLog("evaluatePersonPreference()", 11, "person1 ID; ID of the first activity; preference value 5");
        pu.printActivity(a1);
        
        // Request #12
        List<Activity> bestActivities = serverInterface.getBestPersonPreferences(p1.getId());
        pu.printFunctionLog("getBestPersonPreferences()", 12, "person1 ID");
        for(Activity a : bestActivities) {
        	pu.printActivity(a);
        }
        
        // Request #5
        serverInterface.deletePerson(p1);
        pu.printFunctionLog("deletePerson()", 5, "person1 ID");
        serverInterface.deletePerson(p2);
        pu.printFunctionLog("deletePerson()", 5, "person2 ID");
        
        // Request #1
        List<Person> zero = serverInterface.readPersonList();
        pu.printFunctionLog("readPersonList()", 1, "-");
        pu.printString("\tPerson in DB after client: " + zero.size());
        
        pu.endLog();
	}

}
