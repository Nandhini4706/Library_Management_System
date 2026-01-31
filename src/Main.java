import java.util.*;
import Model.Book;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        System.out.println("-------------------Library Management System-----------------------");
        System.out.println("1.Librarian Login");
        System.out.println("2.Student login");
        System.out.println("3.Exit");
        System.out.println("Enter choice: ");
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("---------------------------Welcome Librarian-------------------------");
                System.out.println();
                System.out.println("-----------------------------");
                System.out.println("|            LOGIN          |");

                System.out.print("| USER NAME:                |");
                String name=sc.nextLine();

                System.out.println("| PASSWORD:                 |");
                String pass=sc.nextLine();
                System.out.println("-----------------------------");
                if(pass.contains("lily")){
                    System.out.println("welcome");
                }

        }

    }
}