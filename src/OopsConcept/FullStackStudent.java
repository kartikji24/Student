package OopsConcept;

public class FullStackStudent extends Student {
    private String language;
    private int Batch;
    public FullStackStudent(String name, int rollNo, int age, String language, int Batch) {
        super(name, rollNo, age);
        this.Batch = Batch;
        this.language = language;
    }

    public int getBatch(){
        return Batch;
    }

    public String getLanguage(){
        return language;
    }
    public String getDetail(){
        return getAge()+" "+ getRollNo()+" "+getName()+" "+ language+" "+ Batch;
    }

}
