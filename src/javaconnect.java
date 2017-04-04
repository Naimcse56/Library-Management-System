
import java.sql.Connection;
import java.sql.DriverManager;


public class javaconnect {
    Connection conn;

public static Connection ConnecrDb(){
  try{
     
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library management", "root", "");
     return conn;
  } catch(Exception e){
      
  }
        return null;
}
}
