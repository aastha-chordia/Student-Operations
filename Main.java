//Main.java

import java.util.*;
class Main{
		public static void main(String args[]){
				Scanner scan = new Scanner(System.in);
				int choice = 1;
				StudentOperations operations = new StudentOperations();
				
				do{
				System.out.println("Enter Name:");
				String name = scan.nextLine();
				System.out.println("Enter PRN:");
				int prn = scan.nextInt();
				System.out.println("Enter Branch:");
				String branch = scan.next();
				System.out.println("Enter Batch:");
				String batch = scan.next();
				System.out.println("Enter CGPA:");
				double cgpa = Double.parseDouble(scan.next());
				
				StudentOperations operations = new StudentOperations();
				Student student = new Student(name,prn,branch,batch,cgpa);
				operations.addStudent(student);
				operations.displayStudents();
				}while (choice != 2);
		}
}