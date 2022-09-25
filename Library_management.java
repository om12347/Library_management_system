/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_management;
import java.util.Scanner;

public class Library_management extends Student {
    int a;
    static String e ;
    
    public static void main(String[] args) {
        do{
        // TODO code application logic here
        System.out.println("Press 1 for adding new user ");
        System.out.println("Press 2 for adding new book ");
        System.out.println("Press 3 for book issue ");
        System.out.println("Press 4 for book return ");
        System.out.println("Press 5 to exit ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
                Student s1 = new Student();
                s1.get();
                break;
                
            case 2:
                Books b1 = new Books();
                b1.add();
                break;
                
            case 3:
                Borrow b2 = new Borrow();
                b2.issue();
                break;
            case 4:
                Borrow b3 = new Borrow();
                b3.returnn();
                break;
            case 5:
                System.out.println(".....Program end.....");
                System.exit(0);
                break;
            
            default:
                System.out.println("Invalid input ");
              
             }
        
             Scanner sc1 = new Scanner(System.in);
             System.out.println(" You want to select next opyion y/n");
             String e = sc1.nextLine();
             if(e=="n" || e=="N"){
                System.exit(0);
            }
                    
        }while(true);
        }        
}
    

