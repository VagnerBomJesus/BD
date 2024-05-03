/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.*;

/**
 *
 * @author vbj
 */
/*public class CreateDB {
    public static void main(String[] args) throws SQLException {
        Connection connection = connectionDB.getConnection();
        Statement state = connection.createStatement();
        
        String createQuery = "create database if not exists school_vagner";
        
        state.execute(createQuery);
        
        System.out.println("Database created successfully or allready exists");
    }
}*/
public class CreateDB {

public static void main(String[] args) {
    try {
        Connection connection = connectionDB.getConnection();
        Statement statement = connection.createStatement();
        // Verifica se a base de dados já existe
        ResultSet rs = statement.executeQuery("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'school_vagner'");

        if (rs.next()) {
            System.out.println("Database already exists");
        } else {
            // Cria a base de dados se ela não existir
            statement.execute("CREATE DATABASE school_vagner");
            System.out.println("Database created successfully");
        }

    } catch (SQLException e) {
        System.err.println("SQL error occurred: " + e.getMessage());
    } catch (Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
    }
}
}
