import java.util.*;

public class Company {

    private long income;
    private List<Employee> employees = new ArrayList<>();

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

    public List<Long> getTopSalaryStaff (int count) {
        List<Long> listSalary = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            listSalary.add(employees.get(i).getMonthSalary(this));
        }
        Collections.sort(listSalary);
        Collections.reverse(listSalary);
        List<Long> topSalary = new ArrayList<>(count);
        if (count > listSalary.size()) {
            topSalary.addAll(listSalary);
        }
        else {
            for (int j = 0; j < count; j++) {
                topSalary.add(listSalary.get(j));
            }
        }
        return topSalary;
    }
    public List<Long> getLowestSalaryStaff (int count) {
        List<Long> listSalary = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            listSalary.add(employees.get(i).getMonthSalary(this));
        }
        Collections.sort(listSalary);
        List<Long> lowestSalary = new ArrayList<>(count);
        if (count > listSalary.size()) {
            lowestSalary.addAll(listSalary);
        }
        else {
            for (int j = 0; j < count; j++) {
                lowestSalary.add(listSalary.get(j));
            }
        }
        return lowestSalary;
    }
}
