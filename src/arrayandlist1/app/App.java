package arrayandlist1.app;

import arrayandlist1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++) {
            System.out.println("Employee #" + i);
            System.out.printf("Id: ");
            int id = sc.nextInt();
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);

            employeeList.add(employee);

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee empSalIncr = employeeList.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if (empSalIncr != null ){
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            empSalIncr.addSalary(percentage);
        }else{
            System.out.println("This id does not exist!");
        }

        System.out.println("List of Employees: ");
        for (Employee e:employeeList) {
            System.out.println(e);
        }

        sc.close();
    }
}
