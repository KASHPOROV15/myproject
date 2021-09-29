public class soldier {
    private String name;
    private String date;
    private double salary;
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

    public double salary_up(double proc, double salary) {
        return this.salary = salary * proc/100 + salary;
    }
}
