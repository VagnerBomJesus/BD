/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENT;

import bd.connectionDB;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author vbj
 */
public class ConsultStudent {

    public static void main(String[] args) throws SQLException {
        
        String consult = "select * from student";

        Connection connection = connectionDB.getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(consult);

        ArrayList<Student> studenArrayList = new ArrayList<>();

        while (resultSet.next()) {    
            
            String fertNameString = resultSet.getString("firtname");
            String lastNameString = resultSet.getString("lastname");
            int age = resultSet.getInt("age");
            int contact = resultSet.getInt("contact");
            Student student =  new Student(fertNameString, lastNameString, age, contact);
            studenArrayList.add(student);
            

        }
       /* int count = 0;
        for (; resultSet.next(); count++) {
            String fertNameString = resultSet.getString("firtname");
            String lastNameString = resultSet.getString("lastname");
            int age = resultSet.getInt("age");
            int contact = resultSet.getInt("contact");
            Student student =  new Student(fertNameString, lastNameString, age, contact);
            studenArrayList.add(student);
        }*/
        for(Student student: studenArrayList){
            
            System.out.println(student.toString());
 
        }
        statement.close();
        connection.close();
          //ArrayList<Student> studentDB = ArrayList<>();

    
    }
    
}
