public class Manager implements Employee {

    @Override
    public int getMonthSalary() {
        int min = 100000;
        int max = 150000;
        int fixSalary = (int)(Math.random()*(max - min)) + min;
        return fixSalary;
    }
}
