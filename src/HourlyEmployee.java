public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String birthDate, String endDate, String name, String hireDate, double hourlyPayRate) {
        super(birthDate, endDate, name, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

}
