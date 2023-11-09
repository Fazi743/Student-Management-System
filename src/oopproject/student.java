package oopproject;
import java.util.*;
public class student extends person{
    Scanner scan = new Scanner(System.in);
    public void login(){
        System.out.println("\t\t||Log in||");
        System.out.println("\t\t----------\n");
        System.out.println("User Name : ");
        name = scan.next();
        System.out.println("Enter your password : ");
        pasw = scan.next();
        // Use Sleep Function
        System.out.print("\tPlease Wait while loading....");
    }
    public void manu(){
        for(int i=1;i<5;i++){  
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.print(e);}}  
        System.out.println("\t\t*==============================================*");
        System.out.println("\t\t*              STUDENT PORTAL                  *");
        System.out.println("\t\t*                                              *");
        System.out.println("\t\t*   press A/a for open the registration form   *");
        System.out.println("\t\t*                                              *");
        System.out.println("\t\t*   press B/b for marks the marks check        *");
        System.out.println("\t\t*                                              *");
        System.out.println("\t\t*   press C/c for log out                      *");
        System.out.println("\t\t*                                              *");
        System.out.println("\t\t*==============================================*");
        char choise=scan.next().charAt(0);
        switch(choise)
        {
            //use to case for user enter either capital or small latter
            case 'A':
            case 'a':
                System.out.println("\t\t  Registration Form");
                System.out.println("\t\t----------------------\n");
                System.out.println("Please Enter your Name : ");
                name = scan.next();
                name = scan.nextLine();
                System.out.println("Enter Your Gender M/F : ");
                gender = scan.next().charAt(0);
                System.out.println("Enter your Religion : ");
                religion = scan.next();
                System.out.println("Enter your date of birth : ");
                dob = scan.next();
                System.out.println("Enter your contact number : ");
                contact = scan.nextInt();
                System.out.println("Enter you Email Id :");
                email = scan.next();
                System.out.println("Enter your country name : ");
                country = scan.next();
                System.out.print("enter your city name :");
                city =scan.next();
                city = scan.nextLine();
                System.out.println("if you want to logOut press C/c\n");
                break;
            case 'C':
            case 'c':
                //for logOut
                System.out.println("you loged_out successfully");
                break;
            default:
                System.out.println("Oops: Sorry You selected wrong option!");
        }    
    }     
}            
 