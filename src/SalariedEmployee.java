public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String birthDate, String endDate, String name, String hireDate, double annualSalary, boolean isRetired) {
        super(birthDate, endDate, name, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        terminate("12/12/25");
        isRetired = true;
    }

    @Override
    public double collectPay(){
        return (double) (int) annualSalary / 26;
    }

}
