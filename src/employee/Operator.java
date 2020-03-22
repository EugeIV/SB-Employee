package employee;

import company.Company;

public class Operator implements Employee {

    private long fixSalary = 30000;

    @Override
    public long getMonthSalary(Company company) {
        return fixSalary;
    }
}
