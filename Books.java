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
public class Books {
    public static String []title = new String[20];
    int bi;
    String publisher[] = new String[20];
    int price[] = new int[20];
    
    
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id, title and publisher name ");
        bi = sc.nextInt();
        title[bi] = sc.nextLine();
        sc.nextLine();
        publisher[bi] = sc.nextLine();
        System.out.println("Enter book price");
        price[bi] = sc.nextInt();
    }
    
    void update(){
         Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter book id you want to update");
        bi = sc2.nextInt();
        
        System.out.println("Enter new price of book ");
        price[bi] = sc2.nextInt();
    }
}
