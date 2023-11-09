package oopproject;
import java.util.Scanner;
public class course implements privacy{
    private String name;
    private String pasw;
    Scanner scan = new Scanner(System.in);
    
    public void login(){
        System.out.println("\t\t\t\t  ||Log in||");
        System.out.println("\t\t\t\t  ----------\n");
        System.out.println("User Name : ");
        name = scan.next();
        System.out.println("Enter your password : ");
        pasw = scan.next();
        // Use Sleep Function
        System.out.print("\t  Please Wait while loading....");
    }
    public void Cmanu(){
        try{
               Thread.sleep(3000);
           }
        catch(InterruptedException e){System.out.print(e);
        }
        System.out.println("\t  *=========================================================*");
        System.out.println("\t  * Press A/a for available Courses & course registration   *");
        System.out.println("\t  *                                                         *");
        System.out.println("\t  * Press B/b for course teachers and timing                *");
        System.out.println("\t  *                                                         *");
        System.out.println("\t  * Press C/c to logout                                     *");
        System.out.println("\t  *=========================================================*");
        System.out.println("Your Choice : ");
        char choise=scan.next().charAt(0);
        switch(choise){
            //use to case for user enter either capital or small latter
            case 'A':
            case 'a':
                System.out.println("       Course_Name\t\t Course_code");
                System.out.println("     ---------------\t\t-------------");
            int i=0;
            //use while loop for choosing more then one subjects
            while(i<5){
            System.out.println("1.Programming Fundamentals  \t    PF101 ");
            System.out.println("2.Report Writing Skills   \t    RW142 ");
            System.out.println("3.Object Oriented Programming  \t    OOP132");
            System.out.println("4.Multiveriable Calculus\t    MC021");
            System.out.println("5.Bioinformitics  \t\t    BI112");
            System.out.println("6.Islamic Studies \t\t    IS092");
            System.out.println("7.Pakistan Studies\t\t    Pk042");
            System.out.println("Select from any given options to register course ");
            System.out.println("Press any key to Close :");
            int sb=scan.nextInt();
            if(sb == 1)
            {
                System.out.println("\nYou selected PF-101\n");
            }
            if(sb == 2)
            {
                System.out.println("\nYou selected RWS-142\n");
            }
            if(sb == 3)
            {
                System.out.println("\nYou selected OOP-132\n");
            }
            if(sb == 4)
            {
                System.out.println("\nYou selected MC-021\n");
            }
            if(sb == 5)
            {
                System.out.println("\nYou selected BI-11\n");
            }
            if(sb == 6)
            {
                System.out.println("\nYou selected IS092\n");
            }
            if(sb == 7)
            {
                System.out.println("\nYou selected Pk042\n");
            }
            i++;
            System.out.println("if you want to logOut press C/c\n");
            choise=scan.next().charAt(0);
            if(choise=='c'||choise=='c')
            {
                //for logOut
                System.out.println("you loged_out successfully");
                System.out.close();
               }
            }
            break;
            case 'B':
            case 'b':
                System.out.println("       Name             Code            Timing             Day");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("MR. Jamal Visiting   |  PF101   |    08:30-10:00am     |   Monday");
                System.out.println("MR. Umair            |  RW142   |    11:30-01:00pm     |   Tuesday");
                System.out.println("MR. Umer Zia         |  OOP132  |    10:00-11-30am     |   Thursday ");
                System.out.println("MR. Ali Imran        |  MVC021  |    03:00-04:30pm     |   Wednesday ");
                System.out.println("MR. Umer Zia         |  OOP132  |    01:00-03:00pm     |   Friday ");
                System.out.println("MR. Sardaraz         |  BI112   |    04:30-06:00pm     |   Tuesday");
                System.out.println("\nIf you want to logOut press C/c\n");
                choise=scan.next().charAt(0);
                if(choise=='c'||choise=='c')
                {
                    //for logOut
                    System.out.println("you loged_out successfully");
                    System.out.close();
                }
            case 'C':
            case 'c':
                    //for logOut
                System.out.println("you loged_out successfully");
                System.out.close();
                break;
            default:
                System.out.println("Oops: Sorry You selected wrong option!");
            }
        }
}