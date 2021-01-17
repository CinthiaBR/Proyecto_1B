package ec.edu.epn.proyecto1b;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class consultarTest {
    private consultar c;
    @Before
    public void  setconsultar() {

        c = new consultar();
    }

    @Test
    public void consultar_nombre(){

        assertEquals("Cinthia", c.especialista("Cinthia"));
    }



    @Test
    public void NumCedula() {
        assertEquals(c.cedula("1713446209"),"1713446209");

    }

    @Test
    public void testException(){
        String str ="1713446209";
        int i=0;
        try{

            for(i=0;i<10;i++){
                int x = Integer.parseInt(str);
            }


        }catch(Exception e){
            System.out.println("Error");
            assertEquals(c.cedula("1713446209"),str);
        }
    }

    @Test
    public void Arreglos(){
        String[] Actual={"Kari","Cinthia","Marco"};
        String[] Esperados={"","",""};
        assertArrayEquals("No coincide",
                c.especialistas_Neurologia(Esperados),Actual);
    }

    @Test
    public void ArreglosThat(){
        String[] Actual={"Kari","Cinthia","Marco"};
        String[] Esperados={"","",""};
        String[] array = c.especialistas_Neurologia(Esperados);
        assertThat("No coincide",Actual, is(array));
    }

    @Test
    public void Null() {
        String nombre=null;
        String esp="";
        List<String> nombres = new ArrayList<String>();
        nombres.add("");
        nombres.add(c.especialista(esp));
        nombres.add("Edison");

        for (String n: nombres) {
            if (n.equals("Paul")) {
                nombre = "Johan";//asinamos-->valor a la variable
                break; }}
        assertNull("No esta Nulo",nombre);
    }


}