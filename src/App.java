import tipos.TiposBicicletas;
import vehiculo.*;

public class App {
    public static void main(String[] args) throws Exception {

        Auto toyota = new Auto("Toyota", "Corolla", "Gris", 180, 4, 4, 500);
        toyota.mostrarDato();
        toyota.encender();
        toyota.avanzar();
        toyota.frenar();
        toyota.apagar();

        Bicicleta cannondale = new Bicicleta("Cannondale", "Quick", "Azul", 50, 2, TiposBicicletas.BICICLETA_HIBRIDA);
        cannondale.mostrarDato();
        cannondale.avanzar();
    }
}
