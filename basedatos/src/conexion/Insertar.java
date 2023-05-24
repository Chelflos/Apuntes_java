package conexion;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Insertar {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/baseDatos";
		String INSERTAR = "INSERT INTO EMPLEADOS (NOMBRE,SALARIO,FECHA) VALUES (? , ?,?)";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(INSERTAR) ;
				){
					pr.setString(1,"Ana");
					pr.setDouble( 2,5500 );
					pr.setTimestamp(3,Timestamp.valueOf(LocalDateTime.now())	);
					int filas = pr.executeUpdate();					
					System.out.println("Filas insertadas " + filas);
					
					pr.setString(1,"Carlos");
					pr.setDouble( 2,4555 );
					pr.setTimestamp(3,Timestamp.valueOf(LocalDateTime.now())	);
				    filas = pr.executeUpdate();					
					System.out.println("Filas insertadas " + filas);
					
					pr.setString(1,"Chema");
					pr.setDouble( 2,6504 );
					pr.setTimestamp(3,Timestamp.valueOf(LocalDateTime.now())	);
					filas = pr.executeUpdate();					
					System.out.println("Filas insertadas " + filas);
					
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
		
		
	}

}
