/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENT;

import bd.connectionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vbj
 */
public class ConsultStudent1 {

public static void main(String[] args) throws SQLException {

    Scanner insert = new Scanner(System.in);

    System.out.println("Insert enter the name to search: ");
    String name_search = insert.nextLine();

    String consult1 = "select * from student where firtname like ? and age < 18";

    Connection connection1 = connectionDB.getConnection();
    PreparedStatement preparedStatement = connection1.prepareStatement(consult1);

    preparedStatement.setString(1, "%" + name_search + "%");

    ResultSet resultSet = preparedStatement.executeQuery();

    ArrayList<Student> studenArrayList = new ArrayList<>();

    if (resultSet.next()) {
       
        resultSet.beforeFirst();
        while (resultSet.next()) {

            String fertNameString = resultSet.getString("firtname");
            String lastNameString = resultSet.getString("lastname");
            int age = resultSet.getInt("age");
            int contact = resultSet.getInt("contact");
            Student student = new Student(fertNameString, lastNameString, age, contact);
            studenArrayList.add(student);

        }

        for (Student student : studenArrayList) {
            System.out.println( student.toString());
        }

    } else {
         System.out.println("Data not found");
        
        
    }

    preparedStatement.close();
    connection1.close();
//Statement statement = connection.createStatement();
    /* ResultSet resultSet = statement.executeQuery(consult);

        ArrayList<Student> studenArrayList = new ArrayList<>();

        while (resultSet.next()) {    
            
            String fertNameString = resultSet.getString("firtname");
            String lastNameString = resultSet.getString("lastname");
            int age = resultSet.getInt("age");
            int contact = resultSet.getInt("contact");
            Student student =  new Student(fertNameString, lastNameString, age, contact);
            studenArrayList.add(student);
            

        }*/
 /* int count = 0;
        for (; resultSet.next(); count++) {
            String fertNameString = resultSet.getString("firtname");
            String lastNameString = resultSet.getString("lastname");
            int age = resultSet.getInt("age");
            int contact = resultSet.getInt("contact");
            Student student =  new Student(fertNameString, lastNameString, age, contact);
            studenArrayList.add(student);
        }
        for(Student student: studenArrayList){
            
            System.out.println(student.toString());
 
        }
        statement.close();
        connection.close();
          //ArrayList<Student> studentDB = ArrayList<>();*/
}

}
