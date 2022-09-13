
package Modulo;

public class DetalleCompra {

    private int id;
    private int idProducto;
    private String producto;
    private int cantidad;

    public DetalleCompra() {
    }

    public DetalleCompra(int id, int idProducto, String producto, int cantidad) {
        this.id = id;
        this.idProducto = idProducto;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
