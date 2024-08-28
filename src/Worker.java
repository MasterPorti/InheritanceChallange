public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String birthDate, String endDate, String name) {
        this.birthDate = birthDate;
        this.endDate = endDate;
        this.name = name;
    }

    public int getAge(){
        int year = 24;
        int yearBirth = Integer.parseInt(birthDate.substring(6,8));  //  dd/mm/yy
        if(yearBirth > 24){
            return (100 - yearBirth) + 24;
        }
        return 24 - yearBirth;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
