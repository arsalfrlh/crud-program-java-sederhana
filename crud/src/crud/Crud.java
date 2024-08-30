package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//kelas koneksi
public class Crud {
    private static Connection conn;
    public static Connection configDB()throws SQLException{
        try{
            String host = "jdbc:mysql://localhost:3306/db_mahasiswa";
            String usr = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(host,usr,pass);
        }catch (Exception e){
            System.err.println("Koneksi Gagal"+e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
