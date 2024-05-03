/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENT;

import bd.connectionDB;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author vbj
 */
public class CreateStudent {

    public static void main(String[] args) throws SQLException {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insert first name: ");
        String firtName = scanner.nextLine();
        
        System.out.println("Insert last name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("Insert your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Insert your contact: ");
        int contact = scanner.nextInt();
        
        
        
        Student student = new Student(firtName, lastName, age, contact);
        
        System.out.println("Create data for student " + firtName );
        System.out.println(student.toString());
        
        
        
        String queryInsertStudent = "insert into student (firtname, lastname, age, contact ) values (?, ?, ?, ?)";
        
        
        Connection connection = connectionDB.getConnection();
        
        PreparedStatement preparedStatement = connection.prepareStatement(queryInsertStudent);
        preparedStatement.setString(1, firtName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setInt(3, age);
        preparedStatement.setInt(4, contact);
        
        preparedStatement.execute();
        scanner.close();

    }
    
}
