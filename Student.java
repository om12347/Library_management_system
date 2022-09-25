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
public class Student {
    Student(){
        
    }
    public static String []name = new String[20];
    public static int i;
    String dept;
  
    void get(){
        System.out.println("************Student info*************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sutdent id and name");
        i = sc.nextInt();
        sc.nextLine();
        name[i] = sc.nextLine();
        System.out.println("Enter your department");
        dept = sc.nextLine();
    }
    
    void display(){
        System.out.println("Student name is "+name[i]);
        System.out.println("roll no. :: " + i);
       
    }
}
