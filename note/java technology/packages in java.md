## what is packages in java ? 
packages in java is a way to orgnize related classes . Think of it  as a folder  in a file directory . We use package to avoid the name conflicts .
there are two group of packages : 
- first is the used define package 
- second is your own package 
## built in package 
The library contain different components for managing input output , database programming , and much more 
the library package in java contain two different thing one is the classes the other the packages  .  
### import a class 
```
import java.util.Scanner ; 
```
in the example above the java.util is a package  , while the Scanner is a class of the java.util 

to be able to used the scanner class we first initialize the object then use the method specify in the documentation 
```
import java.util.Scanner ; 
class MyClass 
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in )  ;
		System.out.println("Enter username ") ; 
		String userName  =  myObj.nextLine()  ; 
		System.out.println("Username is: " +userName ) ; 
	}
}
```
code explain : 
1. we create a new scanner object  
2. we used the nextLine() method in the scanner object 
3. then we printout the user name 