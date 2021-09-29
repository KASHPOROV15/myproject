public class member extends soldier {
    private String name;
    private String date;
    private double salary;
    private double upk=1.2;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void member2(String name, String date, double salary, double upk) {
        this.date = date;
        this.name = name;
        this.salary = salary;
        this.upk = upk;
    }

    public double salary_up(double proc, double salary) {
        return this.salary = salary * proc * upk/100 + salary;
    }
}
