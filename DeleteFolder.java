/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletefolder;

import java.io.File;  
public class DeleteFolder { 
public static void main(String[] args) {  
File myObj = new File("C:\\Users\\rahaf\\OneDrive\\سطح المكتب\\مجلد جديد");  
if (myObj.delete()) {  
System.out.println("Deleted the folder: " +   
myObj.getName()); 
} else { 
System.out.println("Failed to delete the folder."); 
}  
}  
}