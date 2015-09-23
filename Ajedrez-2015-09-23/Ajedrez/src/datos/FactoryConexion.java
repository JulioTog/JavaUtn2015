package datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConexion {
        //Datos de la BD
        private String dbDriver="com.mysql.jdbc.Driver";
	private String host="localhost";
	private String port="3306";
	private String user="Julian";
	private String pass="1234";
	private String db="Ajedrez";
	//Instancia de coneccion
	private Connection conn;
	private int cantCon;
	
	//Constructor de la clase
        private FactoryConexion(){
		try {
			Class.forName(dbDriver);
			conn=null;
			cantCon=0;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static FactoryConexion instancia;
	
	public static FactoryConexion getInstancia(){
		if (instancia==null){
			instancia = new FactoryConexion();
		}
		return instancia;
	}
	
	public Connection getConn(){
		try {
			if(conn==null || conn.isClosed()){
				conn = (Connection) DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?user="+user+"&password="+pass);
				cantCon++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
		
	public void releaseConn(){
		try {
			cantCon--;
			if(cantCon==0){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
