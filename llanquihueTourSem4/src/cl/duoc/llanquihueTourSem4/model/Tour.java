package cl.duoc.llanquihueTourSem4.model;

public class Tour {
    private String nombre;
    private String tipo;
    private double precio;

    public Tour(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String toString() {
        return nombre + "," + tipo + "," + precio;
    }
    //Pasa el toString a objeto nuevamente y corta el string con cada coma y crea un arreglo
    public static Tour fromString(String linea) {
        String[] partes = linea.split(",");
        String nombre = partes[0];
        String tipo = partes[1];
        double precio = Double.parseDouble(partes[2]); //convierte nuevamente a double el valor que se habia guardado como string
        return new Tour(nombre, tipo, precio);
    }
}
