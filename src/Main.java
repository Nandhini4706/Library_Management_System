import java.util.*;
import Model.Book;
import maintance.LibrarianMenu;
import maintance.Library;
import Student.StudentMenu;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        System.out.println("-------------------Library Management System-----------------------");
        System.out.println("1.Librarian Login");
        System.out.println("2.Student login");
        System.out.println("3.Exit");
        System.out.println("Enter choice: ");
        int n=sc.nextInt();
        sc.nextLine();
        switch(n){
            case 1:
                System.out.println("---------------------------Welcome Librarian-------------------------");
                System.out.println();
                System.out.println("Enter name");
                String name=sc.nextLine();
                System.out.println("Enter password");
                String pass=sc.nextLine();
                System.out.println("         "+"-----------------------------      ");
                System.out.println("         "+"|           LOGIN           |");
                System.out.println("         "+"| USER NAME: " +name+"            |");
                System.out.println("         "+"| PASSWORD: " +pass+"             |");
                System.out.println("         "+"-----------------------------      ");
                if(pass.contains("lily")){
                    System.out.println("welcome");
                }

        }

    }
}