public class Main {
    public static void main(String[] args) {
        Company company = new Company(1000000);
        System.out.println(company.getIncome());
        company.hireAll(10, 80, 180);
//        company.hire("operator");
        System.out.println(company.getCountEmployee());
//        System.out.println(company.employeeAndSalary);
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(30));
        company.fire(135);
//        System.out.println(company.employeeAndSalary);
        System.out.println(company.getCountEmployee());
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(30));
    }
}
