package application;
import util.LinkedList;
import java.util.Scanner;
public class TrainingCourses {
	
		LinkedList<Employee>list;
		
	public TrainingCourses() {
		list = new LinkedList<Employee>();
		inputEmployees();
	}

	private void inputEmployees() { //1. Allow users to input 10 employees - ask how many employees they wish to enter first 
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		employee e;
		int employeeNumber;
		String employeeName;
		int yearsWorked;
		String courseName;
		int count;
		
		int input;
		System.out.println("Please enter how many employees you would like to add : ");
		input = scan.nextInt(); scan.nextLine();
		
		
		while (input<= 10) 
			
			System.out.println("Please enter the employees datails ");
			
		for (int count=1; count <=10; count++)
		
			System.out.println("Please enter the employees number: ");
			employeeNumber = scan.nextInt(); scan.nextLine();
		    System.out.print("\nEnter name for module " + count + " : ");
		    employeeName = scan.nextLine();
		    System.out.print("Enter code for module " + count + " : ");
		    yearsWorked  = scan.nextInt();scan.nextLine();
		    System.out.print("Enter number of credits for module " + count + " : ");
		    courseName = scan.nextLine();

		  //Create an employee
		    e = new Employee(employeeNumber, employeeName, yearsWorked, courseName);

		    //Add to LinkedList
		    list.add(e);
			
		
		
		
		if(input >10) 
			System.out.println("You have chosen too many employees to enter - please choose a smaller number :");
			input = scan.nextInt(); scan.nextLine(); 
		
			displayEmployees();
		}
		
	
	private void displayEmployees(){//2. Display all employee details
		
		
	
	}
	//3. Remove an employee from a course - using employee number 
	
	//4. Display all details of employees in training 
	
	//5. Delete all employees from a specific course 
	
	//6. Display remaining employees 
	
	//7. Personal Function 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}
