package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eliminar {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/baseDatos";
		String ELIMINAR = "delete from empleados where id>=?";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(ELIMINAR) ;
				){
					
					pr.setInt( 1,5 );
					int filas = pr.executeUpdate();
					
					System.out.println("Filas eliminadas " + filas);
					//Devuelve el numero de filas modificadas
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}	
		
	}
	
}
