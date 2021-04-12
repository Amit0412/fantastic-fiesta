import java.awt.*;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Graphics;
public class Pan
{
    Pan()
    {
        Frame obj=new Frame("AWT TEST");
        TextField obj1=new TextField();
        Label obj2=new Label("Label1");
        Button obj3=new Button("Submit");
        MenuBar mb=new MenuBar();  
        Menu menu=new Menu("Menu");  
        Menu submenu=new Menu("Sub Menu");  
        MenuItem i1=new MenuItem("Item 1");  
        MenuItem i2=new MenuItem("Item 2");  
        MenuItem i3=new MenuItem("Item 3");  
        MenuItem i4=new MenuItem("Item 4");  
        MenuItem i5=new MenuItem("Item 5");
        Choice c=new Choice();  
        c.setBounds(100,100, 75,75);  
        c.add("Item 1");  
        c.add("Item 2");  
        c.add("Item 3");  
        c.add("Item 4");  
        c.add("Item 5");
        c.select("Item 1");
        obj.add(c);  
        menu.add(i1);  
        menu.add(i2);  
        menu.add(i3);  
        submenu.add(i4);  
        submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu);  
        obj.setMenuBar(mb);  
        obj3.setBounds(100, 60, 100, 50);
        obj2.setBounds(40,40,40,40);
        obj1.setBounds(50, 50, 50, 50);
        obj1.setBackground(Color.red);
        obj.add(obj3);
        obj.add(obj1);
        obj.add(obj2);
        obj.setSize(500, 500);
        obj.setLayout(null);
        obj.setVisible(true);
    }
   
    public static void main(String args[])
    {
        Pan r=new Pan();
    }
}
