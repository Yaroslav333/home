/**
 * Created by Candy on 28.07.2016.
 */
public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }




    @Override
    public String toString() {
        return super.toString() +
                " salary=" + salary +
                ", subject=" + subject ;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

