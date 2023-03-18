package vehiculo;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String color;
    protected int velocidadMaxima;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Vehiculo(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDato() {
        System.out.println("===========================");
        System.out.printf("Marca: %s \nModelo: %s \nColor: %s \nVelocidad: %d \n", this.marca, this.modelo, this.color,
                this.velocidadMaxima);
        System.out.println("===========================");
    }

}
