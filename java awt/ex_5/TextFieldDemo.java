import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame  extends Frame
{
    Label  l1, l2  ;
    TextField  tf ;  
    MyFrame ()
    {
        super("TextFiled Demo ") ;  
        l1 = new Label("No Text is Entered Yet")  ; 
        l2 = new Label("Enter key is not yet hit")  ; 
        tf = new TextField(20)   ;
        tf.setEchoChar('*');

        Handle  h = new Handle()  ; 
        tf.addTextListener(h);
        tf.addActionListener(h);
        
        setLayout(new FlowLayout());
        add(l1);
        add(l2); 
        add(tf);
    }

    
   
    class Handle  implements  TextListener  , ActionListener  
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText()) ; 
        }
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText()); 

        } 
    }
    
}

public class TextFieldDemo {
    public static void main(String [] args)
    {
        MyFrame  f = new MyFrame()  ; 
        f.setSize(400,400) ; 
        f.setVisible(true)  ; 
    }
    
}
