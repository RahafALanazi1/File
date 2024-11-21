/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writer;

import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\rahaf\\OneDrive\\سطح المكتب\\مجلد جديد\\OOP.txt");
            myWriter.write("JAVA is fun");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}