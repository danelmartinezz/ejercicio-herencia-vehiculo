package vehiculo;

public class Auto extends Vehiculo {
    private int numeroPuertas;
    private int numeroRuedas;
    private int capacidadCarga;

    public Auto(String marca, int numeroPuertas, int numeroRuedas, int capacidadCarga) {
        super(marca);
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.capacidadCarga = capacidadCarga;
    }

    public Auto(String marca, String modelo, int numeroPuertas, int numeroRuedas, int capacidadCarga) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.capacidadCarga = capacidadCarga;
    }

    public Auto(String marca, String modelo, String color, int numeroPuertas, int numeroRuedas, int capacidadCarga) {
        super(marca, modelo, color);
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.capacidadCarga = capacidadCarga;
    }

    public Auto(String marca, String modelo, String color, int velocidadMaxima, int numeroPuertas, int numeroRuedas,
            int capacidadCarga) {
        super(marca, modelo, color, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDato() {
        System.out.println("===========================");
        System.out.printf(
                "Marca: %s \nModelo: %s \nColor: %s \nVelocidad: %d KM/H \nNumero de Puertas: %d \nCantidad de Ruedas: %d \nCapacidad de Carga: %d litros \n",
                this.marca, this.modelo, this.color,
                this.velocidadMaxima, this.numeroPuertas, this.numeroRuedas, this.capacidadCarga);
        System.out.println("===========================");
    }

    public void encender() {
        System.out.println("Encendiendo " + getMarca() + "...");
    }

    public void apagar() {
        System.out.println("Apagando " + getMarca() + "...");
    }

    public void avanzar() {
        System.out.println("Avanzando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    public void retrodecer() {
        System.out.println("Retrocediendo...");
    }

}
