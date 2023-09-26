```
1. class Outer 

{
	int x = 10 , 
2.	class Inner 
	{
		int y= 20  ; 
		void inner DisplaY()
		{
			sop(x) ; 
			sop(y);		
		}
		
	}
	3. void outerDisplay()
	{
		Inner i = new Inner()  ;
		i.innerDisplay()  ;
		 sop(i*y)
	}
}
```
- the inner class can access the member of the outclass  as seen in 2. as the method inner access the x varible 
- 3. you can create a object of inner class in the out there class 
- you cannot access the inner value directly but you can access it thought an object  
## main class to call the outher class 

```
class Test 
{
	p-s-v main()
	{
		Outer o = new Outer()  ; 
		o.OuterDisplay ; 
		Inner  i  = new Outer().Inner() ;
	}
}
```
## compiling a nested 
when you compiler a nested class you will have two different compiler file because java will compiler every class 


