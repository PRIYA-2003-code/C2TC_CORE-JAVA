package com.tnsc.ifet.activity.employee_details;
import java.util.Scanner;
public class EmployeeDetailsCollector {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee type (P for Permanent, C for Contract):");
        char employeeType = scanner.next().charAt(0);

        Employee employee = null;

        try {
            if (employeeType == 'P' || employeeType == 'p') {
                System.out.println("Enter permanent employee details:");
                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                System.out.println("Enter name:");
                String name = scanner.next();
                System.out.println("Enter department:");
                String department = scanner.next();
                System.out.println("Enter basic salary:");
                double basicSalary = scanner.nextDouble();
                System.out.println("Enter allowance:");
                double allowance = scanner.nextDouble();

                employee = new PermanentEmployee(id, name, department, basicSalary, allowance);
            } else if (employeeType == 'C' || employeeType == 'c') {
                System.out.println("Enter contract employee details:");
                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                System.out.println("Enter name:");
                String name = scanner.next();
                System.out.println("Enter department:");
                String department = scanner.next();
                System.out.println("Enter hourly rate:");
                double hourlyRate = scanner.nextDouble();
                System.out.println("Enter working hours:");
                int workingHours = scanner.nextInt();

                employee = new ContractEmployee(id, name, department, hourlyRate, workingHours);
            } else {
                throw new InvalidEmployeeTypeException("Invalid employee type");
            }

            System.out.println("Employee details:");
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.calculateSalary());
        } catch (InvalidEmployeeTypeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

	
		
		
	                       
	                      
	       

		
		
	        	
	        	


