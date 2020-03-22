package employee;

import company.Company;

public class Manager implements Employee {

    private long fixSalary = 50000;
    private static final int PERCENT_OF_INCOME = 5;

    @Override
    public long getMonthSalary(Company company) {
        return fixSalary + company.getIncome() * PERCENT_OF_INCOME / 100;
    }
}
