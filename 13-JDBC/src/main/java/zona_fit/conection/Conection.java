package zona_fit.conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conection {
    public static Connection getConection(){
        Connection connectionDB = null;
        var db = "zona_fit_db";
        var url = "jdbc:mysql://localhost:3306/"+db;
        var user = "Mexz";
        var password = "@Mexz123@";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connectionDB = DriverManager.getConnection(url,user,password);
        }
        catch(Exception e){
            System.out.println("Error to connect to the database: " + e.getMessage());
        }
        return connectionDB;
    }

    public static void main(String[] args) {
        var connection = Conection.getConection();
        if(connection != null){
            System.out.println("Conexion exitosa: "+ connection);
        }
        else{
            System.out.println("Error al conectar con la base de datos");
        }
    }
}
