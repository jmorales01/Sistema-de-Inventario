
package Modulo;


public class Compras {

    private int id;
    private String provvedor;
    private String direccion;
    private String fechaCompra;
    private String fechaEntrega;
    private String usuarioCompra;
    private String estado;

    public Compras() {
    }

    public Compras(int id, String provvedor, String direccion, String fechaCompra, String fechaEntrega, String usuarioCompra, String estado) {
        this.id = id;
        this.provvedor = provvedor;
        this.direccion = direccion;
        this.fechaCompra = fechaCompra;
        this.fechaEntrega = fechaEntrega;
        this.usuarioCompra = usuarioCompra;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvvedor() {
        return provvedor;
    }

    public void setProvvedor(String provvedor) {
        this.provvedor = provvedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getUsuarioCompra() {
        return usuarioCompra;
    }

    public void setUsuarioCompra(String usuarioCompra) {
        this.usuarioCompra = usuarioCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
