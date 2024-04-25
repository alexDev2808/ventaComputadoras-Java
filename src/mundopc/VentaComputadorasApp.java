package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VentaComputadorasApp {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
//        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
//        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
//        System.out.println(monitorLenovo);

        Computadora computadoraLenovo = new Computadora("Legion Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
//        System.out.println(computadoraLenovo);

        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell = new Computadora("AlienWare", monitorDell, tecladoDell, ratonDell);

        // Crear orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraDell);
        orden2.mostrarOrden();
    }

}