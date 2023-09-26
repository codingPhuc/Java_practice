import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class  MyFrame  extends Frame   implements ItemListener ,   ActionListener
{
    List  l ; 
    Choice  c ; 
    TextArea  ta ;  

    MyFrame ()
    {
        super("ListBox Demo")  ; 

        l= new List(4, true )  ; 
        c = new Choice() ;
        ta =  new TextArea(20,30);

        l.add("Monday")  ; 
        l.add("Tuesday")  ;
        l.add("Wednesday")  ;
        l.add("Thursday")  ;
        l.add("Friday")  ;
        l.add("Saturday")  ;
        l.add("Sunday")  ;

        c.add("January")  ;
        c.add("February")  ;
        c.add("March")  ;
        c.add("April")  ;
        c.add("May")  ;
        setLayout(new FlowLayout());

        add(l)  ;
        add(c)  ;
        add(ta)  ; 
        

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == l)
        {
            ta.setText(l.getSelectedItem());
        }  
        else if(e.getSource() == c)
        {
            ta.setText(c.getSelectedItem());
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String list[] = l.getSelectedItems(); 
        String txt  = " "  ; 

        for(String  x: list)
            txt += x +"\n"  ; 
        ta.setText(txt)  ; 
        // l.addItem(txt) ;
    }



}
public class ListBoxDemo {
    public static void main(String  [] args)
    {
        MyFrame  f  = new MyFrame() ; 
        f.setSize(500,500) ; 
        f.setVisible(true);
    }

}
