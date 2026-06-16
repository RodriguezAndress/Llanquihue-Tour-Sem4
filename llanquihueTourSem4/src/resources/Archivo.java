package resources;

import java.io.*;
import cl.duoc.llanquihueTourSem4.model.Tour;
import java.util.ArrayList;

public class Archivo {
    private static final String DIRECTORIO = "resources";
    private static final String ARCHIVO = DIRECTORIO + "/recorridos.txt";

    public static void guardarLista(ArrayList<Tour> lista) {
        File dir = new File(DIRECTORIO);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Tour t : lista) {
                bw.write(t.toString()); // usa el toString del Tour
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Tour> leerLista() {
        ArrayList<Tour> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Tour.fromString(linea)); // reconstruye el objeto
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
