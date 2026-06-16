package cl.duoc.llanquihueTourSem4.data;

import cl.duoc.llanquihueTourSem4.model.Tour;
import resources.Archivo;
import java.util.ArrayList;

public class GestorDatos {
    private ArrayList<Tour> tours;

    public GestorDatos() {
        //Se crea una lista vacia
        tours = new ArrayList<>();
    }

    public void agregarTour(Tour tour) {
        tours.add(tour);
    }

    public void guardarTours() {
        Archivo.guardarLista(tours);
    }

    public void cargarTours() {
        tours = Archivo.leerLista();
    }

    public void mostrarTours() {
        for (Tour t : tours) {
            System.out.println(t.getNombre() + " ; " + t.getTipo() + " ; $" + t.getPrecio());
        }
    }
}