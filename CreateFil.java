/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createfil;


import java.io.File;
import java.io.IOException;

public class CreateFil {
    public static void main(String []args) {
        try {
            File myObj = new File("C:\\Users\\rahaf\\OneDrive\\سطح المكتب\\مجلد جديد\\OOP.txt"); 
            if (myObj.createNewFile()) {    
                System.out.println("File created: " + myObj.getName()); 
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();                 
        }
    }
}