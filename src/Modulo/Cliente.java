
package Modulo;


public class Cliente {

    private int id;
    private String dni;
    private String nombre;
    private String apllido;
    private String direccion;
    private int celular;
    private String sexo;
    private int edad;
    private String fechaCreacion;
    private String correo;
    private String estado;

    public Cliente(){
        
    }

    public Cliente(int id, String dni, String nombre, String apllido, String direccion, int celular, String sexo, int edad, String fechaCreacion, String correo, String estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apllido = apllido;
        this.direccion = direccion;
        this.celular = celular;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaCreacion = fechaCreacion;
        this.correo = correo;
        this.estado = estado;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
