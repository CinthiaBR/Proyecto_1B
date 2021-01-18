package ec.edu.epn.proyecto1b;
class Ejecutable_proyecto {
    public static void  main (String[] arg){
        consultar c= new consultar();
    String nombre=c.especialista(" "), cedula=c.cedula("");
    System.out.println("Datos del especialista: \n"+nombre +"\n"+cedula);

    int numero_especialidad = 2;
    System.out.println("Número de especialidad: \n"+numero_especialidad);
    }
}
