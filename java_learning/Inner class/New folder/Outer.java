class Outer 
{
    public void display()
    {
        class Inner 
        {
            public void show()
            {
                System.out.println("Inner class method");
            }
        }
        // Inner i = new Inner()  ; 
        new Inner().show()  ; 
        
    }
}