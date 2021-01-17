package ec.edu.epn.proyecto1b;

public class Agendar {
    private Doctor _doctor;
    private Especialidad _especialidad;
    private cita _cita;

    private int num_especialidades;

    public Agendar(Doctor _especialista, Especialidad _especialidad, cita _cita, int num_especialidad){
        this._doctor = _especialista;
        this._especialidad = _especialidad;
        this._cita = _cita;
        this.num_especialidades = num_especialidad;
    }
    public int getNum_especialidades(){
        return num_especialidades;
    }
    public void setNum_especialidades(int num_especialidades)
    {
        this.num_especialidades = num_especialidades;
    }


    public Especialidad getEspecialidad() {
        return _especialidad;
    }

    public Doctor getEspecialista() {
        return _doctor;
    }

    public cita get_cita() {
        return _cita;
    }

    double getcharge(Double thisAmount) {
        switch (getEspecialidad().getCategoria()){
            case Especialidad.CONSULTA_EXTERNA:
                thisAmount +=2;
                if (getNum_especialidades()>1)
                    thisAmount += (getNum_especialidades())*1.5;
                break;
            case Especialidad.ESPECIALIDAD:
                thisAmount += getNum_especialidades()*3;
                break;
        }
        return thisAmount;
    }
}
