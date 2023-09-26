## local inner class  implementation  
trait of a local inner class : 
- local inner class do not belong to any enclosing class that they are define in they are only accessible to the method that created them 
- local inner can only be mark with the final or abstract method 

the implementation of the local inner class is as follow 
```
class Outer 
{
	void Display()
	{
		class Inner 
		{
			void innerDisplay() ; 
			sop("hello") ;  
		}
		Inner i  = new Inner()  ;
		i.innerDisplay()  ;
	}
	
}
```
- the class is only accessible in the Display method so it won't be able to be seen by a other class outside of the method 
- when the Display method is call in the outher class is the the only time when the Inner class will be initialize hence the name **local Inner**


