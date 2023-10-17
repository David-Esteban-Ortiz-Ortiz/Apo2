import java.util.ArrayList;

public class ContenedoraSimple {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres
        ArrayList<String> listaNombres = new ArrayList<>();

        // Agregar nombres a la lista
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");

        // Recorrer la lista y mostrar los nombres
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }
}
