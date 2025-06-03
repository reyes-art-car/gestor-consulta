public class Paciente
{
    //Atributos
    private String nombre;
    private String motivoDeConsulta;
    private int prioridad;

    //Constructor
    public Paciente (String nombre, String motivoDeConsulta, int prioridad){
        this.nombre = nombre;
        this.motivoDeConsulta = motivoDeConsulta;
        this.prioridad = prioridad;
    }

    public Paciente() {
    }



    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivoDeConsulta() {
        return motivoDeConsulta;
    }

    public void setMotivoDeConsulta(String motivoDeConsulta) {
        this.motivoDeConsulta = motivoDeConsulta;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
//ToString

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", motivoDeConsulta='" + motivoDeConsulta + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}
