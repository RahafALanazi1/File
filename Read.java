/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package read;

import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Read{
public static void main(String[] args) {
try {
File myObj = new File("C:\\Users\\rahaf\\OneDrive\\سطح المكتب\\مجلد جديد\\OOP.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);
}
myReader.close();
} catch (FileNotFoundException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}