package ex3;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
       
        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);


        StudentUtils.sortByName(list);
        StudentUtils.print(list);

        
        StudentUtils.sortByAvg(list);
        StudentUtils.print(list);

     

        StudentUtils.sortByAgeDescending(list);
        StudentUtils.print(list);

        double avg_point  =  StudentUtils.avg(list);
        System.out.println(avg_point)   ; 
    
        // 
        List<String> good_student= StudentUtils.goodStudentName(list);
        for (String string : good_student) {
            System.out.println(string);
        }
    }
}
