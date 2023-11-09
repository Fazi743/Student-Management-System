package oopproject;
import java.util.Scanner;
import java.util.ArrayList;
public class teacher extends person implements privacy {
    Scanner scan = new Scanner(System.in);
    //Array use as a private
    private int[] marks = new int[5];
    ArrayList <teacher> teachers=new ArrayList <teacher>();
    public void login(){
        System.out.println("\t\t\t\t  ||Log in||");
        System.out.println("\t\t\t\t  ----------\n");
        System.out.print("User Name : ");
        name = scan.next();
        System.out.print("Enter your password : ");
        pasw = scan.next();
         // Use Sleep Function
        System.out.println("\t\tPlease Wait while loading....");
    try{ 
            Thread.sleep(3000);
        }
    catch(InterruptedException e){System.out.print(e);
        }
    }
    public void manu(){
        
        System.out.println("\t        *===============================================*");
        System.out.println("\t        *\t         TEACHERS PORTAL               *");
        System.out.println("\t        *   press A/a for open the registration form    *");
        System.out.println("\t        *                                               *");
        System.out.println("\t        *   press B/b for Add/edit/remove marks         *");
        System.out.println("\t        *   press Q for check list                      *");
        System.out.println("\t        *   press C/c for log out                       *");
        System.out.println("\t        *===============================================*");
        System.out.println(" Your Choics :");
        char choise=scan.next().charAt(0);
        switch(choise){
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
                if(gender != 'M' && gender != 'm' && gender!= 'F' && gender != 'f')
                {
                    System.out.println("you select wrong option reEnter");
                    System.out.println("Enter Your Gender M/F : ");
                    gender = scan.next().charAt(0);
                }
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
                System.out.println("Enter your city name :");
                city =scan.next();
                city = scan.nextLine();
                System.out.println("if you want back to the teachers  manu press B/b :");
                System.out.println("if you want to logOut press C/c\n");
                choise=scan.next().charAt(0);
                if(choise == 'B' || choise == 'b'){
                    this.manu();//for back teacher manu
                }
                if(choise=='c'||choise=='c')
                {
                    //for logOut
                    System.out.println("you loged_out successfully");
                    System.out.close();
                }
                break;
            case 'B':
            case 'b':
                System.out.println("\t\t\t\t  Marks Section");
                System.out.println("\t\t\t\t-----------------\n");
                System.out.println("\tEnter the students Marks");
                for(int i=0;i<5;i++)
                {   if(i<1){
                    System.out.println("Enter the subject marks :");
                    this. marks[i] = scan.nextInt();
                }
                else{
                    System.out.println("Enter the subject marks :");
                    this. marks[i] = scan.nextInt();
                }
                    System.out.println("For back to the Student manu press B/b :");
                    System.out.println("if you want to logOut press C/c");
                    System.out.println("if you add more numbers then press D/d ");
                    System.out.println("if view marks list press E/e \n");
                    choise=scan.next().charAt(0);
                    if(choise == 'B' || choise == 'b'){
                    this.manu();
                    }
                    if(choise=='C'||choise=='c')
                    {
                    //for logOut
                    System.out.println("you loged_out successfully");
                    System.out.close();
                    break;
                    }
                    if(choise == 'D' || choise == 'd'){
                        continue;
                    }
                    if(choise=='E' || choise == 'e'){
                        teacher t=new teacher();
                        t.marks();
                        System.exit(0);
                        break;
                    }
                    else{
                        System.out.println("\tYou select wrong option!");
                    }
                }
                break;
            case 'C':
            case 'c':
                //for logOut
                System.out.println("you loged_out successfully");
                System.exit(0);
                break;
            default:
                System.out.println("Oops: Sorry You selected wrong option!");
            }
        }
    public void marks(){
        System.out.println("Sr.no   Marks");
        System.out.println("--------------");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("| "+i+"   |   "+marks[i]+" |");
        }
        System.exit(0);
    }
    
}