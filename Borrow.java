/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management;
import java.util.Scanner;
/**
 *
 * @author OM
 */
public class Borrow extends Student {
    
    Borrow(){
      
    }
    public static int bookid;
    static String stuid;
    static String iss[][] = new String[20][1];
    String iss_date;
    String ret_date;
     
    
  
    void issue(){
        System.out.println("**************Issue Book**************");
        System.out.println("Enter book id want to issue ");
        Scanner sc = new Scanner(System.in);
        bookid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student id");
        stuid = sc.nextLine();
        System.out.println("Enter issue date ");
        iss_date = sc.nextLine();
        System.out.println("Enter due date");
        ret_date = sc.nextLine();
        if(iss[bookid][0] == null){
            iss[bookid][0] = stuid;
                System.out.println("Your book is issued successfully");
        }
        else{
            Student s1 = new Student();
            System.out.println("Book already issued by "+s1.name[s1.i]);
        }
    }
    
    void returnn(){
        System.out.println("**************Retuen Book**************");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter book id want to return");
        int iid = sc1.nextInt();
        iss[iid] = null;
        System.out.println("Book is returned Successfully");
    }
}
