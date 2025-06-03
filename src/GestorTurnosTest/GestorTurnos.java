
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorTurnos {
    public static void main(String[] args) {





    }

    public static void añadirPaciente (List<Paciente> consulta, String nombre, String motivoDeConsulta, int prioridad) {
        Paciente nuevo = new Paciente(nombre, motivoDeConsulta, prioridad);
        consulta.add(nuevo);
    }
        // Mostrar siguiente paciente (el de mayor prioridad)
        public static Paciente mostrarSiguientePaciente(ArrayList<Paciente> Consulta) {
            for (int prioridad = 1; prioridad <= 3; prioridad++) {
                for (Paciente paciente : Consulta) {
                    if (paciente.getPrioridad() == prioridad) {
                        System.out.println("Siguiente: " + paciente.getNombre());
                        return paciente;
                    }
                }
            }
            System.out.println("No hay pacientes en espera.");
            return null;
        }


        // Contar pacientes de prioridad 1
        public static int contarPorPrioridad(ArrayList<Paciente> Consulta, int prioridad) {
            int contador = 0;
            for (Paciente paciente : Consulta) {
                if (paciente.getPrioridad() == prioridad) {
                    contador++;
                }
            }
            return contador;
        }


        // Eliminar paciente por nombre
        public static boolean cancelarTurnoPorNombre(ArrayList<Paciente> Consulta, String nombreBuscado) {
            Iterator<Paciente> iterator = Consulta.iterator();
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
