public class Employee extends Worker{
    private long employeeID;
    private String hireDate;

    private static int employeeNo = 1;
    public Employee(String birthDate, String endDate, String name, String hireDate) {
        super(birthDate, endDate, name);
        this.employeeID = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
