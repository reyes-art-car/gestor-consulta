import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTurnosTest {

    // Prueba de añadir paciente

    @Test
    void testAñadirPaciente_casoNormal() {
        ArrayList<Paciente> lista = new ArrayList<>();
        GestorTurnos.añadirPaciente(lista, "Ana", "Dolor de cabeza", 2);

        assertEquals(1, lista.size());
        Paciente p = lista.get(0);
        assertEquals("Ana", p.getNombre());
        assertEquals("Dolor de cabeza", p.getMotivoDeConsulta());
        assertEquals(2, p.getPrioridad());
    }

    // Prueba de contar por prioridad

    @Test
    void contarPorPrioridad_casoNormal() {
        ArrayList<Paciente> lista = new ArrayList<>();
        lista.add(new Paciente("Ana", "Dolor", 1));
        lista.add(new Paciente("Luis", "Consulta", 2));
        lista.add(new Paciente("Elena", "Tos", 1));

        int total = GestorTurnos.contarPorPrioridad(lista, 1);
        assertEquals(2, total);
    }

    @Test
    void contarPorPrioridad_listaVacia() {
        ArrayList<Paciente> lista = new ArrayList<>();
        int total = GestorTurnos.contarPorPrioridad(lista, 1);
        assertEquals(0, total);
    }

    @Test
    void contarPorPrioridad_prioridadInexistente() {
        ArrayList<Paciente> lista = new ArrayList<>();
        lista.add(new Paciente("Ana", "Dolor", 1));
        int total = GestorTurnos.contarPorPrioridad(lista, 4); // prioridad inválida
        assertEquals(0, total);
    }

    // Prueba de cancelar turno

    @Test
    void cancelarTurno_nombreExiste() {
        ArrayList<Paciente> lista = new ArrayList<>();
        lista.add(new Paciente("Pedro", "Infarto", 1));
        boolean eliminado = GestorTurnos.cancelarTurnoPorNombre(lista, "Pedro");
        assertTrue(eliminado);
        assertEquals(0, lista.size());
    }

    @Test
    void cancelarTurno_nombreNoExiste() {
        ArrayList<Paciente> lista = new ArrayList<>();
        lista.add(new Paciente("Pedro", "Infarto", 1));
        boolean eliminado = GestorTurnos.cancelarTurnoPorNombre(lista, "Laura");
        assertFalse(eliminado);
        assertEquals(1, lista.size());
    }

    @Test
    void cancelarTurno_listaVacia() {
        ArrayList<Paciente> lista = new ArrayList<>();
        boolean eliminado = GestorTurnos.cancelarTurnoPorNombre(lista, "Carmen");
        assertFalse(eliminado);
    }

    // Prueba de obtener siguiente paciente

    @Test
    void obtenerSiguientePaciente_casoNormal() {
        ArrayList<Paciente> consulta = new ArrayList<>();
        consulta.add(new Paciente("Ana", "Dolor", 2));
        consulta.add(new Paciente("Luis", "Urgencia", 1));
        Paciente p = GestorTurnos.mostrarSiguientePaciente(consulta);
        assertNotNull(p);
        assertEquals("Luis", p.getNombre());
    }

    @Test
    void obtenerSiguientePaciente_listaVacia() {
        ArrayList<Paciente> consulta = new ArrayList<>();
        Paciente p = GestorTurnos.mostrarSiguientePaciente(consulta);
        assertNull(p);
    }

    @Test
    void obtenerSiguientePaciente_prioridadesAltas() {
        ArrayList<Paciente> consulta = new ArrayList<>();
        consulta.add(new Paciente("Carlos", "Chequeo", 3));
        consulta.add(new Paciente("Eva", "Dolor", 2));
        Paciente paciente = GestorTurnos.mostrarSiguientePaciente(consulta);
        assertNotNull(paciente);
        assertEquals("Eva", paciente.getNombre());
    }
}
