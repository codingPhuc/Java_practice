import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class MyFrame extends  Frame  
{
    Menu file , sub  ;
    MenuItem   open , save  , close , closeall  ;
    CheckboxMenuItem auto  ; 

    TextField tf  ;
    MyFrame()
    {
        super("Emnu Demo") ; 
        open  =new MenuItem("Open") ; 
        save  =new MenuItem("Save") ;
        close  =new MenuItem("Close") ;
        closeall  =new MenuItem("Close All") ;

        auto = new CheckboxMenuItem("Auto Save")  ;

        file = new Menu("File") ; 
        sub = new Menu("Close") ; 

        file.add(open)  ; 
        file.add(save)  ; 
        file.add(sub)  ; 
        file.add(auto)  ; 

        sub.add(close);
        sub.add(closeall) ; 

        MenuBar mb = new MenuBar() ; 
        mb.add(file)  ; 
        setMenuBar(mb)  ;


        tf = new TextField(20) ; 
        setLayout(new FlowLayout());
        add(tf) ;  

        open.addActionListener((ActionEvent ae)->tf.setText("Open"));
        save.addActionListener((ActionEvent ae)->tf.setText("Open"));
        close.addActionListener((ActionEvent ae)->tf.setText("Open"));
        closeall.addActionListener((ActionEvent ae)->tf.setText("Open"));

        auto.addItemListener((ItemEvent ie)->
        {
            if(auto.getState())
                tf.setText("Auto Save On");
            else
                tf.setText("Auto Save Off");
        });
    }
}
public class MenuDemo {
    public static void main(String [] args)
    {
        MyFrame f = new MyFrame()  ; 
        f.setSize(500,500)  ; 
        f.setVisible(true)  ;
    }
    
}
