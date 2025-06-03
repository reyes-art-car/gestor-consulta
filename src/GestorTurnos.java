import java.util.ArrayList;
import java.util.Iterator;

public class GestorTurnos {
    public static void main(String[] args) {
        ArrayList<Paciente> a = new ArrayList<>();

        // Añadir pacientes
        Paciente x = new Paciente("Fernando", "Esguince", 2);
        Paciente y = new Paciente("Emilia", "Resfriado", 3);
        Paciente z = new Paciente("Pedro", "Infarto", 1);
        a.add(x);
        a.add(y);
        a.add(z);

        // Mostrar siguiente paciente (el de mayor prioridad)
        for (int p = 1; p <= 3; p++) {
            for (Paciente q : a) {
                if (q.getPrioridad() == p) {
                    System.out.println("Siguiente: " + q.getNombre());
                    p = 4;
                    break;
                }
            }
        }

        // Contar pacientes de prioridad 1
        int b = 1;
        int c = 0;
        for (Paciente d : a) {
            if (d.getPrioridad() == b) {
                c++;
            }
        }
        System.out.println("Total de " + b + ": " + c);

        // Eliminar paciente por nombre
        String e = "Pedro";
        boolean f = false;
        Iterator<Paciente> g = a.iterator();
        while (g.hasNext()) {
            Paciente h = g.next();
            if (h.getNombre().equalsIgnoreCase(e)) {
                g.remove();
                f = true;
                break;
            }
        }

        if (f) {
            System.out.println("Eliminado: " + e);
        } else {
            System.out.println("No encontrado: " + e);
        }
    }
}
