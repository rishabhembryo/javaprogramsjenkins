import java.util.Date;

public class Main{
    
    public static void main(String[] args){

        System.out.println("This is java program");
        System.out.println("output from java program");
        System.out.println(new Date());
        System.out.println("End of java program");
        System.out.println("Added one more sout");
        Student student = new Student();
        student.say();
        student.run();
        Student student2 = new Student();
        student2.run();
        

    }
}