package app.model;

import app.classModel.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import app.utilities.Encription;

public class UserModel extends Persistencia{
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean autenticateUser(String user, String pass){
        String sql = "select * from usuario where correo = ? and pass = ?"; 
        try {
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, Encription.getMD5(pass));
            
            rs = ps.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        finally{
           try{
               this.getConnection().close();
           }catch(Exception e){
                System.out.println(e.getMessage());
           }
        }
        return false;
    }
    
    public User getUserData(String user){
        User user_info = new User();
        
        String sql = "select * from usuarios where correo = ?"; 
        try {
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, user);
     
            rs = ps.executeQuery();
            
            user_info.setAccess(rs.getString("access"));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        finally{
           try{
               this.getConnection().close();
           }catch(Exception e){
                System.out.println(e.getMessage());
           }
        }
        
        return user_info;
    }
    
    public boolean signInUser(User user){
        String sql = "insert into usuario (correo,pass,nombre,ap_paterno,ap_materno,access,direccion,estado,admon,preferencias,active,edad,ciudad)" +
        "values(?,?,?,?,?,?,?,?,?,?,?,?)"; 
        try {
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, user.getCorreo()+"");
            ps.setString(2, Encription.getMD5(user.getPass())); 
            ps.setString(3, user.getNombres()+"");
            ps.setString(4, user.getAp_paterno());
            ps.setString(5, user.getAp_materno());
            ps.setString(6, user.getAccess());
            ps.setString(7, user.getDireccion());
            ps.setString(8, user.getEstado());
            ps.setBoolean(9, user.isAdmon());
            ps.setInt(10, user.getPreferencias());
            ps.setString(11, user.getActive());
            ps.setInt(12, user.getEdad());
            ps.setString(0, "0");
            ps.setString(0, "1");
            ps.setString(0, user.getCiudad()+"");
            
            if (  ps.executeUpdate() == 1 ) return true;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        finally{
           try{
               this.getConnection().close();
           }catch(Exception e){
                System.out.println(e.getMessage());
           }
        }
        return false;
    }
}
