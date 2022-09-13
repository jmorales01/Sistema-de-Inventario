
package Modulo;


public class Kardex {

    private int id;
    private int documento;
    private String motivo;
    private int producto;
    private String descripcion;
    private int cantidad;
    private String umv;
    private String usuario;
    private String fecha;

    public Kardex() {
    }

    public Kardex(int id, int documento, String motivo, int producto, String descripcion, int cantidad, String umv, String usuario, String fecha) {
        this.id = id;
        this.documento = documento;
        this.motivo = motivo;
        this.producto = producto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.umv = umv;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUmv() {
        return umv;
    }

    public void setUmv(String umv) {
        this.umv = umv;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
