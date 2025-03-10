public class Employee extends Person {
    
    private String jobTitle;
    private double salary;
    
    public Employee(String name, String eyeColor, String hairColor, int age, double height, double weight, String jobTitle, double salary) {
        super(name, eyeColor, hairColor, age, height, weight);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
