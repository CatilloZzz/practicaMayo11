package ni.edu.uam.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conection {
    public static Connection conectar() {
        Connection con = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=tienda; encrypt=true; trustServerCertificate=true";
            String user = "sa";
            String pw = "123";

            con = DriverManager.getConnection(url, user, pw);

            System.out.println("Conectado a la base de datos");

        } catch (java.sql.SQLException e) {
            System.out.printf("SQLSTATE (%s): %s\n", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }

        return con;
    }
}