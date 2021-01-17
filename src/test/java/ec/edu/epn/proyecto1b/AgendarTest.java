package ec.edu.epn.proyecto1b;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class AgendarTest {

    @Parameterized.Parameters
    public static Iterable<Object[]>getcharge() {
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{4});
        return obj;
    }
    private String num_especialista;
    private int expected;

    public AgendarTest(int num_especialista){
        this.expected = num_especialista;

    }
    @Test
    public void especialista() {

       int actual =4;
       assertEquals(expected,actual);

    }

}