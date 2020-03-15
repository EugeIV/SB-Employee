import com.sun.jdi.Value;

import java.util.*;

public class Company {

    private int income;
    private int countEmployee;
    Map<String, Integer> employeeAndSalary = new HashMap<String, Integer>();

    public Company(int income) {
        this.income = income;
        countEmployee = 0;
    }

    public void hire(String employee) {
        if (employee.equalsIgnoreCase("topmanager")) {
            Employee topManager = new TopManager();
            countEmployee++;
            String tm = "topManager" + countEmployee;
            if (income > 10000000) {
                employeeAndSalary.put(tm, topManager.getMonthSalary() * 2 + topManager.getMonthSalary() / 2);
            }
            else
                employeeAndSalary.put(tm, topManager.getMonthSalary());
        }
        else if (employee.equalsIgnoreCase("manager")) {
            Employee manager = new Manager();
            countEmployee++;
            String m = "manager" + countEmployee;
            employeeAndSalary.put(m, manager.getMonthSalary() + income * 5 / 100);
        }
        else if (employee.equalsIgnoreCase("operator")) {
            Employee operator = new Operator();
            countEmployee++;
            String o = "operator" + countEmployee;
            employeeAndSalary.put(o, operator.getMonthSalary());
        }
        else
            System.out.println("Такого сотрудника нет в базе");
    }

    public void hireAll(int countTop, int countManager, int countOperator) {
        for (int i = 0; i < countTop; i++) {
            Employee topManager = new TopManager();
            countEmployee++;
            String tm = "topManager" + countEmployee;
            if (income > 10000000) {
                employeeAndSalary.put(tm, topManager.getMonthSalary() * 2 + topManager.getMonthSalary() / 2);
            }
            else
                employeeAndSalary.put(tm, topManager.getMonthSalary());
        }
        for (int j = 0; j < countManager; j++) {
            Employee manager = new Manager();
            countEmployee++;
            String m = "manager" + countEmployee;
            employeeAndSalary.put(m, manager.getMonthSalary() + income * 5 / 100);
        }
        for (int g = 0; g < countOperator; g++) {
            Employee operator = new Operator();
            countEmployee++;
            String o = "operator" + countEmployee;
            employeeAndSalary.put(o, operator.getMonthSalary());
        }
    }

    public void fire(int countForDismissal) {
        ArrayList<String> listEmployee = new ArrayList<>(employeeAndSalary.keySet());
        for (int i = 0; i < countForDismissal; i++) {
            employeeAndSalary.remove(listEmployee.get(i));
            countEmployee--;
        }
    }

    public int getIncome() {
        return income;
    }

    public int getCountEmployee() {
        return countEmployee;
    }

    public ArrayList<Integer> getTopSalaryStaff (int count) {
        ArrayList<Integer> listSalary = new ArrayList<Integer>(employeeAndSalary.values());
        Collections.sort(listSalary);
        Collections.reverse(listSalary);
        ArrayList<Integer> topSalary = new ArrayList<>(count);
        if (count > listSalary.size()) {
            for (int j = 0; j < listSalary.size(); j++) {
                topSalary.add(j, listSalary.get(j));
            }
        }
        else {
            for (int i = 0; i < count; i++) {
                topSalary.add(i, listSalary.get(i));
            }
        }
        return topSalary;
    }
    public ArrayList<Integer> getLowestSalaryStaff (int count) {
        ArrayList<Integer> listSalary = new ArrayList<Integer>(employeeAndSalary.values());
        Collections.sort(listSalary);
        ArrayList<Integer> lowestSalary = new ArrayList<>(count);
        if (count > listSalary.size()) {
            for (int j = 0; j < listSalary.size(); j++) {
                lowestSalary.add(j, listSalary.get(j));
            }
        }
        else {
            for (int i = 0; i < count; i++) {
                lowestSalary.add(i, listSalary.get(i));
            }
        }
        return lowestSalary;
    }
}
