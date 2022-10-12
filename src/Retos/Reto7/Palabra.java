package Retos.Reto7;

public class Palabra {

    private String palabra;
    private Integer cantidad;

    public Palabra(String palabra, Integer cantidad) {
        this.palabra = palabra;
        this.cantidad = cantidad;
    }

    public String getPalabra() {
        return palabra;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void sumarCantidad(){
        this.cantidad++;
    }
}
