package part1.employees.test;

import part1.employees.model.CommercialEmployee;
import part1.employees.model.DeliveryEmployee;
import part1.employees.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ManagementEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        //Employee
        Employee employee = new Employee("Steven",21,200.00);
        System.out.println(employee.verifyName());
        System.out.println(employee.plus(400));
        //Commercial Employee
        Employee employee1 = new CommercialEmployee("Luis", 23, 400.00);
        System.out.println(employee1.verifyName());
        System.out.println(employee1.plus(100));
        //Delivery Employee
        Employee employee2 = new DeliveryEmployee("Ricardo", 50, 900.00,"Poblenou");
        System.out.println(employee2.verifyName());
        System.out.println(employee2.plus(100));

        //Repeat Employee
        Employee employeeRepeat = new CommercialEmployee("Steven",21,200.00);


        //Employee empty
        Employee emptyEmployee = new Employee("   ", 21, 200);
        System.out.print("This empty: ");
        System.out.println(emptyEmployee.verifyName());

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.forEach(System.out::println);

        //getClass
        System.out.println("==============Get class===============");
        System.out.println(employee.getClass());
        System.out.println(employee1.getClass());
        System.out.println(employee2.getClass());

        //instanceOf
        System.out.println("=============Instance of==============");
        System.out.println(employee instanceof DeliveryEmployee);
        System.out.println(employee instanceof CommercialEmployee);
        System.out.println(employee1 instanceof DeliveryEmployee);
        System.out.println(employee1 instanceof CommercialEmployee);
        System.out.println(employee2 instanceof DeliveryEmployee);
        System.out.println(employee2 instanceof CommercialEmployee);

        //equalsTo
        System.out.println("===============equals To=================");
        System.out.println(employee.equals(employee1));
        System.out.println(employee.equals(employee2));
        System.out.println(employee.equals(employeeRepeat));



    }
}
