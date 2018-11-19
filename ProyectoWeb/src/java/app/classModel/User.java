package app.classModel;

public class User {
    
    private int id;
    private String correo;
    private String pass;
    private String nombres;
    private String ap_materno; 
    private String ap_paterno;
    private String access;
    private String direccion;
    private String ciudad;
    private String estado;
    private boolean admon;
    private int preferencias;
    private String active;
    private int edad;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isAdmon() {
        return admon;
    }

    public void setAdmon(boolean admon) {
        this.admon = admon;
    }

    public int getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(int preferencias) {
        this.preferencias = preferencias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    private int paisId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
   

   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
            
    
}
