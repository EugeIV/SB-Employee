public class TopManager implements Employee {

    private long fixSalary = 100000;
    private static final long BONUS_INCOME = 10000000;
    private static final int BONUS_PERCENT = 150;

    @Override
    public long getMonthSalary(Company company) {
        if (company.getIncome() >= BONUS_INCOME) {
            return fixSalary + fixSalary * BONUS_PERCENT / 100;
        }
        else
            return fixSalary;
    }
}
