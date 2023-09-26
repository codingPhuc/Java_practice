## what is a anonymous interface class 
```
interface My 
{
	void display()  ; 
}
class Outer 
{
	public void meth( )
	{
	my m = new My()
	{
		public void display()
		{
			sop("hello") ; 
		}
	} 
	} ; 
	m.display() ; 
}
```
- a anonymous interface class is a class that is used to implement a interface method that have a low range of usage 
- this help with the process of not having to create a class to implement the interface 
- if you have to implement a interface but it do not have a lot of implementation you  can used the anonymous inner class to specify where
## anonymous inner class compare to regular class 
- A normal class can implement any number of interface but the anonymous inner class can implement only one interface at a time 
- A regular class can extend one interface and implement any number of  interface but a anonynmous class can only extend a class or implement a interface one  
- 



