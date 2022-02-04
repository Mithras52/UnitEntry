import java.util.ArrayList;
import java.util.Scanner;

public class HomeEnter {
	static Scanner scnr = new Scanner(System.in);

public static void main(String[] args) {
	final int Max_List = 20;
	final char exIt = 'x';
	final String List_Action = "Add, Delete, List, Exit (a,d,l,x) : ";
	char userEnter;
	ArrayList<Integer> livingSpace = new ArrayList<Integer>(Max_List);
	ArrayList<String> fullAddress = new ArrayList<String>(Max_List);		
	ArrayList<String> homeCity = new ArrayList<String>(Max_List);	
	ArrayList<String> homeState = new ArrayList<String>(Max_List);	
	ArrayList<Integer> fullZip = new ArrayList<Integer>(Max_List);	
	ArrayList<String> collEction = new ArrayList<String>(Max_List);	
	ArrayList<String> publicStatus = new ArrayList<String>(Max_List);	
	
	userEnter = getList(List_Action);
	
		
		while (userEnter != exIt) {
	         if(userEnter == 'A') {
	            addHome(livingSpace, fullAddress, homeCity, homeState, fullZip, collEction, publicStatus);
	         }
	         else if(userEnter == 'D') {
	            deleteHome(livingSpace, fullAddress, homeCity, homeState, fullZip, collEction, publicStatus);
	         }
	         else if(userEnter == 'L') {
	            listHomes(livingSpace, fullAddress, homeCity, homeState, fullZip, collEction, publicStatus);
	         }

	         userEnter = getList(List_Action);
	      } 
	   } 
		

		public static void addHome(ArrayList<Integer> livingSpace,
	ArrayList<String> fullAddress,		
	ArrayList<String> homeCity,	
	ArrayList<String> homeState,
	ArrayList<Integer> fullZip,	
	ArrayList<String> collEction,	
	ArrayList<String> publicStatus) {
			 int sqft;
			 String addRess;
			 String city;
			 String stAte;
			 int zipCode;
			 String modelName;
			 String saleStat;
	
	System.out.println("Enter the square footage: ");
	sqft = scnr.nextInt();
	System.out.println("Enter the address: ");
	addRess = scnr.next();
	System.out.println("What city is it in: ");
	city = scnr.nextLine();
	System.out.println("What state: ");
	stAte = scnr.nextLine();
	System.out.println("What is the zip code: ");
	zipCode = scnr.nextInt();
	System.out.println("What is the model: ");
	modelName = scnr.nextLine();
	System.out.println("What is the status: ");
	saleStat = scnr.nextLine();
	
	livingSpace.add(sqft);
	fullAddress.add(addRess);
	homeCity.add(city);
	homeState.add(stAte);
	fullZip.add(zipCode);
	collEction.add(modelName);
	publicStatus.add(saleStat);
	
	System.out.print(addRess + "has been entered into system.");
	
		}
		
	public static void deleteHome(ArrayList<Integer> livingSpace,
	ArrayList<String> fullAddress,		
	ArrayList<String> homeCity,	
	ArrayList<String> homeState,
	ArrayList<Integer> fullZip,	
	ArrayList<String> collEction,	
	ArrayList<String> publicStatus) {	
	
		int nElements;
		int element;
		
		nElements = livingSpace.size();
		 if (nElements > 0) {
	         System.out.print("Enter entry # to delete (0-" + 
	                          (nElements - 1) + ", or -1 to skip deletion: ");
	         element = scnr.nextInt();
	         if (element >= 0) {
	            livingSpace.remove(element);
	            fullAddress.remove(element);
	            homeCity.remove(element);
	            homeState.remove(element);
	            fullZip.remove(element);
	            collEction.remove(element);
	            publicStatus.remove(element);
	
	            System.out.println("Entry #" + element + " deleted.");
	            scnr.nextLine();
	         }
	      } 
	      else {
	         System.out.println("\nThere are no entries to delete.");
	      }
	}
	
	public static void listHomes(ArrayList<Integer> livingSpace,
	ArrayList<String> fullAddress,		
	ArrayList<String> homeCity,	
	ArrayList<String> homeState,
	ArrayList<Integer> fullZip,	
	ArrayList<String> collEction,	
	ArrayList<String> publicStatus) {
		
		int nElements;
		int i;
		
		nElements = livingSpace.size();
		if (nElements > 0) {
	         System.out.println();
	         for (i = 0; i < nElements; ++i) {
	            System.out.println(i + ") SQFT: "   + livingSpace.get(i) +
	                               ",\tAddress: " + fullAddress.get(i) +
	                               ",\tCity: " + homeCity.get(i) +
	                               ",\tState: " + homeState.get(i) +
	                               ",\tZip Code: " + collEction.get(i) +
	                               ",\tModel: " + collEction.get(i) +
	                               ",\tStatus: " + publicStatus.get(i));
	         } 
	      }
	      else {
	         System.out.println("\nThere are no homes to list.");
	      }
		
		
	}
	

	public static char getList(String prompt) {
		String answer;
		char firstChar;
		
		System.out.println();
	      System.out.println(prompt);
	      answer = scnr.nextLine().toUpperCase() + " ";  
	      firstChar = answer.charAt(0);

	      return firstChar;
		
		
			
			
			
			
}

}
