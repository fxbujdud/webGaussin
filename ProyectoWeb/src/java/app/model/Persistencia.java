package app.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Francisco
 */
public class Persistencia {

    
    private final String user, password, host, port, db, classname, url;
    private Connection con;
    
    public Persistencia() {
    
      this.user =  "root";
      this.password = "";
      this.host = "localhost";
      this.port = "3306";
      this.db = "citas";
      this.classname = "com.mysql.jdbc.Driver";
      this.url = "jdbc:mysql://"+host+":"+port+"/"+db;
     
      try {
        Class.forName(classname);
        this.con = DriverManager.getConnection(url,user,password);
      } catch(Throwable t) {
          System.out.println(t.getMessage());
      }
    }
    
    public Connection getConnection() {
        return this.con;
    }
}