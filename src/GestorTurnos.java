import java.util.ArrayList;
import java.util.Iterator;

public class GestorTurnos {
    public static void main(String[] args) {
        ArrayList<Paciente> Consulta = new ArrayList<>();

        // Añadir pacientes
        public void añadirPacientes() {
            Consulta.add(P1);
            Consulta.add(P2);
            Consulta.add(P3);
        }
        // Mostrar siguiente paciente (el de mayor prioridad)
        public static void mostrarSiguientePaciente(ArrayList<Paciente> lista) {
            for (int prioridad = 1; prioridad <= 3; prioridad++) {
                for (Paciente p : lista) {
                    if (p.getPrioridad() == prioridad) {
                        System.out.println("Siguiente: " + p.getNombre());
                        return;
                    }
                }
            }
            System.out.println("No hay pacientes en espera.");
        }


        // Contar pacientes de prioridad 1
        public static int contarPorPrioridad(ArrayList<Paciente> lista, int prioridad) {
            int contador = 0;
            for (Paciente p : lista) {
                if (p.getPrioridad() == prioridad) {
                    contador++;
                }
            }
            return contador;
        }


        // Eliminar paciente por nombre
        public static boolean cancelarTurnoPorNombre(ArrayList<Paciente> lista, String nombreBuscado) {
            Iterator<Paciente> iterator = lista.iterator();
            while (iterator.hasNext()) {
                Paciente p = iterator.next();
                if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                    iterator.remove();
                    return true;
                }
            }
            return false;
        }
    }
