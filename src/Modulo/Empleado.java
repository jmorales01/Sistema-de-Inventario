package Modulo;

/**
 *
 * @author josel
 */
public class Empleado {

    private int id;
    private String dni;
    private String nombre;
    private int telefono;
    public String direccion;
    public int edad;
    public String sexo;
    public String fechaContrado;
    private String estado;
    private String users;
    
    
    public Empleado() {
        
    }

    public Empleado(int id, String dni, String nombre, int telefono, String direccion, int edad, String sexo, String fechaContrado, String estado, String users) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaContrado = fechaContrado;
        this.estado = estado;
        this.users = users;
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
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaContrado() {
        return fechaContrado;
    }

    public void setFechaContrado(String fechaContrado) {
        this.fechaContrado = fechaContrado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    
    
}
