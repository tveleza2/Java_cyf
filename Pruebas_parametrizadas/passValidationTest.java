package Pruebas_parametrizadas;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class passValidationTest {
    private String clear = "\033\143";
    private InputStream thrower = System.in;
    private final ByteArrayOutputStream captor = new ByteArrayOutputStream();
    @BeforeEach
    void setUp(){
        System.setOut(new PrintStream(captor));
    }
    @AfterEach
    public void tearDown() {
        System.setIn(thrower);
    }

    @ParameterizedTest
    @CsvSource({"123456Ab*,La contraseña es segura","1234,La contraseña debe tener al menos 8 caracteres"})
    void testMain(String pass,String message) {
        ByteArrayInputStream in = new ByteArrayInputStream(pass.getBytes());
        System.setIn(in);
        passValidation.main(new String[1]);
        String result = captor.toString().trim().split(clear)[1];
        Assertions.assertEquals(message,result);
    }

    @ParameterizedTest
    @CsvSource({"123456Ab*,true","1234,false"})
    void testEsSegura(String pass, boolean expected) {
        boolean result = passValidation.esSegura(pass);
        Assertions.assertEquals(result,expected);
    }
}
