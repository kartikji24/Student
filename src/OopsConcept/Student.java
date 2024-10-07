package OopsConcept;

public class Student {
    private  int rollNo;
    private String Name;
    private int age;

    public Student(String name, int rollNo, int age){
        this.Name = name;
        this.age = age;
        this.rollNo = rollNo;
        System.out.println("OopsConcept.Student add SuccessFull");
    }

    public void setName(String Name){
        this.Name = Name;
       // System.out.println("OopsConcept.Student name add SuccessFull");
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
       // System.out.println("OopsConcept.Student rollNo add SuccessFull");
    }

    public void setAge(int age){
        this.age = age;
       // System.out.println("OopsConcept.Student age add SuccessFull");
    }

    public String getName(){
        return Name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public int getAge(){
        return age;
    }

    public String getDetail(){
        return getAge()+" "+ getRollNo()+" "+getName();
    }

}