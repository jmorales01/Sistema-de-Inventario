
package Modulo;


public class Ventas {

    private int id;
    private int idCliente;
    private int idEmpleado;
    private int comanda;
    private double monto;
    private int itms;
    private String fechaCreacion;
    
    
    
    public Ventas(){
        
    }

    public Ventas(int id, int idCliente, int idEmpleado, int comanda, double monto, int itms, String fechaCreacion) {
        this.id = id;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.comanda = comanda;
        this.monto = monto;
        this.itms = itms;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getItms() {
        return itms;
    }

    public void setItms(int itms) {
        this.itms = itms;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    

    
    
}
