/** 
 *  File : MySQLPersonDAO.java 31/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Implementasi PersonDAO untuk MySQL
**/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        // Membuat Koneksi, Nama DB, User, Password Menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/PBO", "root", "");

        // Kerjakan MySQL Query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup Koneksi Database
        con.close();

    }

}
