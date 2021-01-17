package ec.edu.epn.proyecto1b;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Paciente extends Persona{
    private String tipo;
    private Vector _agendar = new Vector();

    // public Paciente() {
    //   this.tipo ="P";
    //}

    public Paciente (String cedula, String nombres, String apellidos, String email, String direccion, String estado_civl, String celular, String password) {
        super(cedula, nombres, apellidos, email, direccion, estado_civl, celular, password);
        this.setFecha_nacimiento(new java.sql.Date(new Date().getTime()));
        this.setTipo_sangre("");
        this.setDiscapacidad("");
        this.setTalla(0.0);
        this.setPeso(0.0);
        this.setTipo("P");
    }

    public Paciente(String cedula, String nombres, String apellidos, String email, String direccion, String estado_civl, String celular, Date fecha_nacimiento, int edad, double peso, String tipo_sangre, String discapacidad, double Talla,String password) {
        super(cedula, nombres, apellidos, email, direccion, estado_civl, celular, fecha_nacimiento, edad, peso, tipo_sangre, discapacidad, Talla, password);
        this.tipo = "P";
    }

    public void addAgendar(Agendar arg){
        _agendar.add(arg);
    }

    public String statement(){
        double total;
        //int frequentAgendarPointer = 0;
        Enumeration agendar = _agendar.elements();
        String result = "Nombre del paciente:   "+getNombres() + "\n"
                +"Cédula:    "+getCedula()+"\n"
                +"Tipo de sangre: "+getTipo_sangre()+"\n"
                +"Número de celular:  "+getCelular()+"\n";
        Amount enumerar = new Amount(0, agendar, result).invoke();
        total = enumerar.getTotal();
        result = enumerar.getResult();
        result += "Total a pagar:   " + String.valueOf(total)+"\n";
        return result;
    }

    public String htmlstatement(){
        double total = 0;
        Enumeration agendar = _agendar.elements();
        String result;
        Amount enumerar = new Amount(total, agendar, "<H1>Nombre del paciente:  <EM> "+getNombres() + "</EM><H1><p>\n"
                +"<H1>Cédula:    <EM>"+getCedula()+"</EM><H1><p>\n"
                +"<H1>Tipo de sangre: <EM>"+getTipo_sangre()+"</EM><H1><p>\n"
                +"<H1>Número de celular:  <EM>"+getCelular()+"</EM><H1><p>\n").invoke();
        total = enumerar.getTotal();
        result = enumerar.getResult();
        result += "Total a pagar:   <EM>" + String.valueOf(total)+"</EM><p>\n";
        return result;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    private class Amount {
        private double total;
        private Enumeration agendar;
        private String result;

        public Amount(double total, Enumeration agendar, String result) {
            this.total = total;
            this.agendar = agendar;
            this.result = result;
        }

        public double getTotal() {
            return total;
        }

        public String getResult() {
            return result;
        }

        public Amount invoke() {
            while (agendar.hasMoreElements()){
                double thisAmount;
                Agendar each = (Agendar) agendar.nextElement();

                thisAmount = each.getcharge((double) 0);

                result += "\t" + each.getEspecialidad().getNombre_especialidad()+"\t"
                        +String.valueOf(thisAmount)+"\n";
                total += thisAmount;
            }
            return this;
        }
    }
}
