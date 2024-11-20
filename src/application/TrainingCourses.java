package application;
import util.LinearNode;
import util.LinkedList;
import java.util.Scanner;
	
public class TrainingCourses {
		
	LinkedList<Employee>list;
			
public TrainingCourses() {
			list = new LinkedList<Employee>();
			inputEmployees();
		}

public void inputEmployees() { //1. Allow users to input 10 employees - ask how many employees they wish to enter first 
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			Employee emp;
			int employeeNumber;
			String employeeName;
			int yearsWorked;
			String courseName;
			
			
			int input;
			System.out.println("Please enter how many employees you would like to add : ");
			input = scan.nextInt(); scan.nextLine();
			
			
			while (input > 10 || input < 1) {
			    System.out.println("You have chosen too many employees to enter - please choose a smaller number:");
			    input = scan.nextInt();
			    scan.nextLine(); 
			}
				
			for (int count=1; count<=input; count++) 
			
				System.out.println("Please enter the employees number: ");
				employeeNumber = scan.nextInt(); 
				scan.nextLine();
			    System.out.print("\nEnter name for module " + count + " : ");
			    employeeName = scan.nextLine();
			    System.out.print("Enter code for module " + count + " : ");
			    yearsWorked  = scan.nextInt();
			    scan.nextLine();
			    System.out.print("Enter number of credits for module " + count + " : ");
			    courseName = scan.nextLine();

			  //Create an employee
			    emp = new Employee(employeeNumber, employeeName, yearsWorked, courseName);

			    //Add to LinkedList
			    list.add(emp);
				
				displayEmployees();
			}
			
		
	public void displayEmployees(){//2. Display all employee details
		if (list.isEmpty()) 
			System.out.println("No employees to display.");
		 else 
			System.out.println("Employee Details:");
			list.display(); 
			removeEmployee();
		
		}
	public void removeEmployee() {//3. Remove an employee from a course - using employee number 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the employee number to remove: ");
		int employeeNumber = scan.nextInt();
		
		LinearNode<Employee> current = list.getFirstNode();
		boolean found = false;
		while (current!=null) {
			if(current.getElement().getNum()== employeeNumber) {
				list.delete(current.getElement());
				System.out.println("Employee removed ");
				found = true;
				break;
			}
			current = current.getNext();
		}
		displayEmployeesInTraining();
		
	}
		
		
	public void displayEmployeesInTraining(){	//4. Display all details of employees in training 
		
		if(list.isEmpty()) {
			System.out.println("No emploees are enrolled in any course. ");
		} else {
			LinearNode<Employee> current =list.getFirstNode();
		
		while (current!=null) {
			Employee emp = current.getElement();
																																										if(!emp.getCourse().equals("ERROR")) 
				System.out.println(emp);
			
		}
		current = current.getNext();
		}
	}
		
		
	
		
		
		//5. Delete all employees from a specific course 
		
		//6. Display remaining employees 
		
		//7. Personal Function 
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

		}
