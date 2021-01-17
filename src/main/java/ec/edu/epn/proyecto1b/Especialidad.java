package ec.edu.epn.proyecto1b;

public class Especialidad {
    public static final int CONSULTA_EXTERNA = 1;
    public static final int ESPECIALIDAD = 20;

    private String nombre_especialidad;
    private int id_especialidad;
    private int Categoria;

    public Especialidad (int id, String nombre_especialidad, int precio) {
        this.id_especialidad = id;
        this.nombre_especialidad = nombre_especialidad;
        this.Categoria = precio;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public int getCategoria(){
        return Categoria;
    }
    public void setCategoria(int categoria){
        this.Categoria = categoria;
    }
}
