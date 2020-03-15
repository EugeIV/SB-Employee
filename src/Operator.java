public class Operator implements Employee {

    @Override
    public int getMonthSalary() {
        int min = 10000;
        int max = 30000;
        int fixSalary = (int)(Math.random()*(max - min)) + min;
        return fixSalary;
    }
}
