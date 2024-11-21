/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletfile;

import java.io.File; 
public class DeletFile  {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\rahaf\\OneDrive\\سطح المكتب");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}