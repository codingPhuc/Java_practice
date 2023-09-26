exception is an unwanted even that interrupt the normal flow of your program 
```
class exceptionHandling {
public static void main(String [] args)
{
	try {
		int myInt = Integer.parseInt("pants") ; 
	}
	catch(NumberFormatExeception nfe)
	{}
}
}
```
what this code do : 
1. pass a string into the integer parse int 
2. it will output an error 
3. the expection will catch the error preventing the program from error outputting 
### exception hierarchy 
- exception are organize like tree view where one expection is bellow the other 
- there are exception that can catch other exception as long as it is above the other exception 
```
class exceptionHandling {
public static void main(String [] args)
{
	try {
		int myInt = Integer.parseInt("pants") ; 
	}
	catch(Exeception nfe)
	{}
}
}
```

what the code do : 
- the hierarchy tree now can catch other expection with numberformat exception 
### the finnaly block 
- the finnaly block will execute even if a exception is catch or not 
```
class exceptionHandling {
public static void main(String [] args)
{
	try {
		int myInt = Integer.parseInt("pants") ; 
	}
	catch(Exeception nfe)
	{}
	finnaly 
	{
		System.out.println("in the finally block")  ; 
	}
}
}
```
what the code will do : 
1. the catch block will catch the exception 
2. the finally code will execute no matter what meaning that it can also execute even with a return statement in the catch block 
3. you should not used a return statement for the finnally block 
the finnally block can be used with file connection 99% of the time the finally block is not needed 

