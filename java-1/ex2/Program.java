import vn.edu.tdtu.ArrayOutput  ; 
import vn.edu.tdtu.ArrayHandler ; 
public class Program {
    public static void main(String [] args ) 
    {
        int []  a =  {1,2,14,5,89,4}  ; 
        int []  b  = {3,4,52,4,2,1}  ; 
        // print the array to the console 
        ArrayOutput.print(a)   ;
        ArrayOutput.print(b)   ;
        // merge the two array 
        int  [] c = ArrayHandler.merge(a,b)   ; 
        // sort the array in c 
        ArrayHandler.sort(c)  ;
        ArrayOutput.print(c) ; 
        // write the array to file 
        ArrayOutput.write(c, "array.txt") ; 

    }
}
