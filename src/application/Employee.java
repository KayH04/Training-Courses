package application;

	public class Employee {
		
		private int employeeNumber;
		private String employeeName;
		private int yearsWorked;
		private String courseName;
		
		public Employee() {
			this.employeeNumber = 0;
			this.employeeName = "";
			this.yearsWorked = 0;
			this.courseName ="";
		}
		
		public Employee (int num, String name, int years, String course) {
			this.employeeNumber = num;
			this.employeeName = name;
			this.yearsWorked = years;
			this.courseName = course;
			
			if (yearsWorked > 5) 
		        this.yearsWorked = years;
		    else
		        System.out.println("Employee must have more than 5 years of experience.");
		
			
		    // Validate course name
		    if (courseName.startsWith("FOOD")) 
		        this.courseName = course;
			 else 
		    
		        System.out.println("Course name invalid. Setting to ERROR.");
		        this.courseName = "ERROR"; 
		}
		
		public int getNum() {
			return this.employeeNumber;
		}
		
		public String getName() {
			return this.employeeName;
		}
		public int getYears() {
			return this.yearsWorked;
		}
		public String getCourse() {
			return this.courseName;
		}
		

		public void setNum(int num) {
			this.employeeNumber = num;
		}
		public void setName(String name) {
			this.employeeName = name;
		}
		public void setYears(int years) {
			this.yearsWorked = years;
		}
		public void setCourse(String course) {
			this.courseName = course;
		}
		

		public String toString() {
			return "Employees number " + this.employeeNumber + "\n"
					+ "Employee name " + this.employeeName + "\n"
					+ "Years worked by employee " + this.yearsWorked + "\n";
		}
	}
