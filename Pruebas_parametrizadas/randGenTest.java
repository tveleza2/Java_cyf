package Pruebas_parametrizadas;

import org.junit.jupiter.api.Assertions;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class randGenTest {
    private InputStream standIn = System.in;
    private final ByteArrayOutputStream captor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(captor));
    }

    @AfterEach 
    public void tearDown(){
        System.setIn(standIn);
    }
    @Test
    void testNumeroAleatorio() {
        randGen.numeroAleatorio();
        String resultS = captor.toString();
        int result = Integer.valueOf(resultS.trim());
        Assertions.assertTrue(result>=0&&result<=355);
    }
}
