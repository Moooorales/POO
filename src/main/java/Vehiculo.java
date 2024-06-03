public class Vehiculo {
    private String marca;
    private String modelo;

    protected Vehiculo() {
   
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void detalles() {
        System.out.println("Marca:  " + marca);
        System.out.println("Modelo:  " + modelo);
    }
}