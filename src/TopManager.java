public class TopManager implements Employee {

    @Override
    public int getMonthSalary() {
        int min = 150000;
        int max = 300000;
        int fixSalary = (int)(Math.random()*(max - min)) + min;
        return fixSalary;
    }
}
