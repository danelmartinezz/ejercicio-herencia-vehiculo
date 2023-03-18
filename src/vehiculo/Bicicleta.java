package vehiculo;

import tipos.TiposBicicletas;

public class Bicicleta extends Vehiculo {
    private int numeroRuedas;
    private TiposBicicletas tiposBicicletas;

    public Bicicleta(String marca, int numeroRuedas, TiposBicicletas tiposBicicletas) {
        super(marca);
        this.numeroRuedas = numeroRuedas;
        this.tiposBicicletas = tiposBicicletas;
    }

    public Bicicleta(String marca, String modelo, int numeroRuedas, TiposBicicletas tiposBicicletas) {
        super(marca, modelo);
        this.numeroRuedas = numeroRuedas;
        this.tiposBicicletas = tiposBicicletas;
    }

    public Bicicleta(String marca, String modelo, String color, int numeroRuedas, TiposBicicletas tiposBicicletas) {
        super(marca, modelo, color);
        this.numeroRuedas = numeroRuedas;
        this.tiposBicicletas = tiposBicicletas;
    }

    public Bicicleta(String marca, String modelo, String color, int velocidadMaxima, int numeroRuedas,
            TiposBicicletas tiposBicicletas) {
        super(marca, modelo, color, velocidadMaxima);
        this.numeroRuedas = numeroRuedas;
        this.tiposBicicletas = tiposBicicletas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public TiposBicicletas getTiposBicicletas() {
        return tiposBicicletas;
    }

    public void setTiposBicicletas(TiposBicicletas tiposBicicletas) {
        this.tiposBicicletas = tiposBicicletas;
    }

    @Override
    public void mostrarDato() {
        System.out.println("===========================");
        switch (tiposBicicletas) {
            case BICICLETA_MONTANA:
                System.out.println("Tipo: Montaña");
                break;
            case BICICLETA_URBANA:
                System.out.println("Tipo: Urbana");
                break;
            case BICICLETA_RUTA:
                System.out.println("Tipo: Ruta");
                break;
            case BICICLETA_PLEGABLES:
                System.out.println("Tipo: Plegables");
                break;
            case BICICLETA_BMX:
                System.out.println("Tipo: Bmx");
                break;
            case BICICLETA_HIBRIDA:
                System.out.println("Tipo: Hibrida");
                break;
            case BICICLETA_ELECTRICAS:
                System.out.println("Tipo: Electrica");
                break;
            default:
                return;
        }
        System.out.printf("Marca: %s \nModelo: %s \nColor: %s \nVelocidad: %d KM/H \nCantidad de Ruedas: %d \n",
                this.marca,
                this.modelo, this.color,
                this.velocidadMaxima, this.numeroRuedas);
        System.out.println("===========================");
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
