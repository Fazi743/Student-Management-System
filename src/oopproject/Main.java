package oopproject;
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.*;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("Students Management System");
        f.setSize(700,600);
        f.setLocation(500,500);
        f.setVisible(true);
        f.setBackground(Color.blue);
        int swi;
        Scanner scan=new Scanner(System.in);
        System.out.println("\t\t*----------------------------------------------*");
        System.out.println("\t\t|     Welcome to Student Management System     |");
        System.out.println("\t\t|                                              |");
        System.out.println("\t\t|        Press 1 for TEACHER PORTAL :          |");
        System.out.println("\t\t|                                              |");
        System.out.println("\t\t|        Press 2 for STUDENT PORTAL :          |");
        System.out.println("\t\t|                                              |");
        System.out.println("\t\t|        Press 3 for COURSE DETAILS :          |");
        System.out.println("\t\t*----------------------------------------------*\n");
        Label lbl=new Label();
        lbl.setText(" Your Choice :");
        lbl.setBounds(100,80,150,50);
        f.add(lbl);
        TextField tf=new TextField();
        tf.setBounds(150, 80, 150, 50);
        f.add(tf);
        Button b=new Button("Enter");
        b.setBounds(300, 80, 150, 50);
        b.addActionListener(l);
        f.add(b);
        
        //System.out.println(" Your Choice :");
        swi = scan.nextInt();
        switch(swi)
        {
            case 1:
               ArrayList<teacher> T=new ArrayList<teacher>();//Arraylist use
               teacher t=new teacher();
               t.login();
               t.manu();
               t.marks();
               T.add(t);
               //can add further as u want also create objects for further addition
               break;
            case 2:
               ArrayList <student> S=new ArrayList<student>();//Arraylist use
               student s=new student();
               s.login();
               s.manu();
               S.add(s); 
               //can add further as u want also create objects for further addition
               break;
            case 3:
                /*ArrayList <course> C=new ArrayList<course>();//Arraylist use
                course c=new course();
                c.login();
                c.manu();
                C.add(c);*/
                //can add further as u want also create objects for further addition
                break;
            default:
                System.out.println("Oop's: Sorry you press wrong number");
        }
    }
}
