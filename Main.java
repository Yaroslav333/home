/**
 * Created by Candy on 28.07.2016.
 */
public class Main {
    public static void main (String args []){

        Person person = new Person("Coach Bob", 27, "M");
        Student student = new Student("Lynne Brooke", 16, " F",  "HS95129", 3.5);
        Teacher teacher = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        CollegeStudent collegeStudent = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");

       System.out.println(person.getAge());

        //Person [] p = {person, student, teacher, collegeStudent};
        Person []p = new Person[4];
        p [0] = person ;
        p [1] = student ;
        p [2] = teacher ;
        p [3] = collegeStudent ;


        for (Person c:p) {
            System.out.println(c.toString());

        }





    }

}
