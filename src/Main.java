import OopsConcept.FullStackStudent;
import OopsConcept.Student;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FullStackStudent s1 = new FullStackStudent("kartik" , 5, 20, "Java" , 2);
        FullStackStudent s2 = new FullStackStudent("Rajan" , 6, 19, "Java" , 2);
        FullStackStudent s3 = new FullStackStudent("Ankush" , 7, 18, "Java" , 2);
        System.out.println(s1.getDetail());
        System.out.println(s2.getDetail());
        System.out.println(s3.getDetail());
        Student st1 = new Student("Gopal", 8,24);
        System.out.println(st1.getDetail());
        FullStackStudent s4 = new FullStackStudent("Gourave" ,18, 19, "Python" , 5);
        System.out.println(s4.getDetail());
        Student s5 = new Student("kartik", 13, 20);
        System.out.println(s5.getDetail());
        try{
            System.out.println(s3.getName());
        } catch (Exception e) {

            System.out.println("exception handel");
        }
        System.out.println("done my work");
    }
}