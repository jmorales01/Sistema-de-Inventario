
package Modulo;

/**
 *
 * @author josel
 */
public class DetalleVentas {

    private int idOrden;
    private int idProducto;
    private int correlativo;
    private int cantidad;
    private double igv;
    private double importe;
    
    public DetalleVentas(){
        
    }

    public DetalleVentas(int idOrden, int idProducto, int correlativo, int cantidad, double igv, double importe) {
        this.idOrden = idOrden;
        this.idProducto = idProducto;
        this.correlativo = correlativo;
        this.cantidad = cantidad;
        this.igv = igv;
        this.importe = importe;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    

    
}
