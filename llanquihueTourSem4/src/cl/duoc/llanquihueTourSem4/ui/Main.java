import cl.duoc.llanquihueTourSem4.data.GestorDatos;
import cl.duoc.llanquihueTourSem4.model.Tour;
import resources.Archivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();


        ArrayList<Tour> tours = new ArrayList<>();

        //Datos para llenar el ArrayList
        tours.add(new Tour("Vuelo en Parapente", "Aventura", 31.990));
        tours.add(new Tour("Recorrido Centro Histrorico", "Cultural", 15.990));
        tours.add(new Tour("Senderismo Cerro El Carbón", "Aventura", 12.990));
        tours.add(new Tour("Recorrido Gastronomico", "Gastronomico", 14.990));
        tours.add(new Tour("Buceo con Tiburones", "Aventura", 13.990));


        // Guardar en el archivo txt
        Archivo.guardarLista(tours);

        // Leer desde archivo txt
        ArrayList<Tour> toursLeidos = Archivo.leerLista();

        // Mostrar en consola con Foreach
        for (Tour t : toursLeidos) {
            System.out.println(t.getNombre() + ";" + t.getTipo() + "; $" + t.getPrecio());
        }
        // Busqueda por cada datos del array usando todos los ejemplos
        String nombreBuscar = "Vuelo en Parapente";
        String tipoBuscar = "Cultural";
        double precioBuscar = 12.990;
        double precioBajo = 15.990;

        System.out.println("\n ~~~~~~~~~ Búsquedas ~~~~~~~~~");
        for (Tour tour : toursLeidos) {
            if (nombreBuscar.equals(tour.getNombre())) {
                System.out.println("Encontrado por nombre: " + tour);
            }
            if (tipoBuscar.equals(tour.getTipo())) {
                System.out.println("Encontrado por tipo: " + tour);
            }
            if (precioBuscar == tour.getPrecio()) {
                System.out.println("Encontrado por precio: " + tour);
            }
            if (tour.getPrecio() < precioBajo) {
                System.out.println("Encontrado por el más precio bajo: " + tour);
            }
        }
    }
}