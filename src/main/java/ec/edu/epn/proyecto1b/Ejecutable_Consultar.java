package ec.edu.epn.proyecto1b;

public class Ejecutable_Consultar {
    public static void  main (String[] arg){
        consultar c= new consultar();
    String nombre=c.especialista(" "), cedula=c.cedula("");
    System.out.println("Datos del especialista: \n"+nombre +"\n"+cedula);
    }
}
