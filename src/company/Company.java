package company;

import employee.Employee;

import java.util.*;

public class Company {

    private long income;
    private List<Employee> employees = new ArrayList<>();
    Comparator<Employee> comparator = Comparator.comparing(employee -> employee.getMonthSalary(this));

    public List<Employee> getEmployees() {
        return employees;
    }

    public Company(int income) {
        this.income = income;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> list) {
        employees.addAll(list);
    }

    public void fire(int countForDismissal) {
        for (int i = 0; i < countForDismissal; i++) {
            employees.remove(i);
        }
    }

    public long getIncome() {
        return income;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> lowestSalary = new ArrayList<>();
        Collections.sort(employees, comparator);
        if (employees.size() < count) {
            lowestSalary.addAll(employees);
        } else {
            for (int i = 0; i < count; i++) {
                lowestSalary.add(employees.get(i));
            }
        }
        return lowestSalary;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> topSalary = new ArrayList<>();
        Collections.sort(employees, comparator.reversed());
        if (employees.size() < count) {
            topSalary.addAll(employees);
        } else {
            for (int i = 0; i < count; i++) {
                topSalary.add(employees.get(i));
            }
        }
        return topSalary;
    }
}