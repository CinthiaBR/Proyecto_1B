package ec.edu.epn.proyecto1b;

public class cita {
    private int id_cita;
    private int id_especialista;
    private int id_especialidad;
    private String fecha_cita;
    private String hora_cita;
    private int id_paciente;

    public cita(int id_especialista, int id_especialidad,int id_paciente, String fecha_cita,String hora) {
        this.id_especialista= id_especialista;
        this.id_especialidad = id_especialidad;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora;
        this.id_paciente = id_paciente;
    }

    public int getId_cita() {

        return id_cita;
    }

    public void setId_cita(int id_cita) {

        this.id_cita = id_cita;
    }

    public int getId_especialista() {

        return id_especialista;
    }

    public void setId_especialista(int id_especialista) {

        this.id_especialista = id_especialista;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {

        this.id_especialidad = id_especialidad;
    }

    public String getFecha_cita()
    {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {

        this.fecha_cita = fecha_cita;
    }

    public String getHora_cita() {

        return hora_cita;
    }

    public void setHora_cita(String hora) {

        this.hora_cita = hora;
    }

    public int getId_paciente() {

        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }


}
