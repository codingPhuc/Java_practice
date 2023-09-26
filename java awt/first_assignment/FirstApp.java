package first_assignment;

import java.awt.*; 
public class  FirstApp 
{
    public static void main(String[] args) 
    {   

        Label  l =  new Label("Name")  ; 
        TextField   tf = new TextField(20)  ; 
        Frame f = new Frame("First App");
        
        f.setLayout(new FlowLayout() );
        f.setSize(300, 300);
        f.setVisible(true);  

        Button  b=  new Button("OK");
        f.add(l) ;  
        f.add(tf) ; 
        f.add(b); 
        
        

    }
}