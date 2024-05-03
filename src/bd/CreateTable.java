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
/*public class CreateTable {

    public static void main(String[] args) throws SQLException {
       
        String queryString = "create table if not exists student ("
                + "id int auto_increment primary key,"
                + "firtName varchar(20) not null,"
                + "lastName varchar(20),"
                + "age int,"
                + "contact int"
                + ")";
        
        
        Connection connectionTable = connectionDB.getConnection();
        Statement state = connectionTable.createStatement();


        state.execute(queryString);

        System.out.println("Tabela in created successfully or allready exists");
        connectionTable.close();
            

    }
    
}*/

public class CreateTable {

    public static void main(String[] args) {
        // Usando try-with-resources para garantir que os recursos sejam fechados adequadamente
        try (Connection connection = connectionDB.getConnection();
             Statement statement = connection.createStatement()) {
            
            // Verificar se a tabela já existe
            ResultSet rs = statement.executeQuery("SHOW TABLES LIKE 'student'");
            if (rs.next()) {
                System.out.println("Table 'student' already exists");
            } else {
                // Cria a tabela se ela não existir
                String queryString = "CREATE TABLE IF NOT EXISTS student ("
                        + "id INT AUTO_INCREMENT PRIMARY KEY, "
                        + "firstName VARCHAR(20) NOT NULL, "
                        + "lastName VARCHAR(20), "
                        + "age INT, "
                        + "contact INT)";
                statement.execute(queryString);
                System.out.println("Table 'student' created successfully");
                connection.close();
            }

        } catch (SQLException e) {
            System.err.println("SQL error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    
}

