import company.Company;
import employee.Employee;
import employee.Manager;
import employee.Operator;
import employee.TopManager;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company = new Company(10000000);
        System.out.println(company.getIncome());
        company.hire(new Manager());
        company.hire(new Manager());
        company.hire(new TopManager());
        company.hire(new Operator());
        System.out.println(company.getEmployees());
        System.out.println(company.getEmployees().size());
        List<Employee> listEmployee = Arrays.asList(new Manager(), new TopManager(), new Operator());
        company.hireAll(listEmployee);
        System.out.println(company.getEmployees());
        System.out.println(company.getEmployees().size());
        company.fire(2);
        System.out.println(company.getEmployees());
        System.out.println(company.getEmployees().size());
        System.out.println(company.getEmployees().get(1).getMonthSalary(company));
        System.out.println(company.getEmployees().get(0).getMonthSalary(company));
        System.out.println(company.getEmployees().get(3).getMonthSalary(company));
        System.out.println(company.getTopSalaryStaff(3));
        for (int i = 0; i < company.getTopSalaryStaff(3).size(); i++) {
            System.out.println(company.getTopSalaryStaff(3).get(i).getMonthSalary(company));
        }
        System.out.println(company.getLowestSalaryStaff(4));
        for (int i = 0; i < company.getLowestSalaryStaff(4).size(); i++) {
            System.out.println(company.getLowestSalaryStaff(4).get(i).getMonthSalary(company));
        }
    }
}
