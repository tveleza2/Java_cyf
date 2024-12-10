package JUnit_Intro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.io.*;

public class HelloWorldTest {
    // private final PrintStream standOut = System.out;
    private final ByteArrayOutputStream captor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(captor));
    }

    @Test
    void testMain() {
        JUnit_Intro.HelloWorld.main(new String[1]);
        String output = captor.toString();
        assertEquals(output,"Hello world");
    }
}
