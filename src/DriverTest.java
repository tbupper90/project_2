import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;


public class DriverTest {

    @Test
    public void testMain() throws NoSuchMethodException, IllegalAccessException,
                           IllegalArgumentException, InvocationTargetException {
        // Reflect private methods from Driver
        Driver driver = new Driver();
        Method read = driver.getClass().getDeclaredMethod("readFile", String.class);
        Method parse = driver.getClass().getDeclaredMethod("parseLine", String.class);
        Method assign = driver.getClass().getDeclaredMethod("assignVariables");
        
        // Call each method to ensure they work without issues
        read.invoke(driver, "Test.csv");
        parse.invoke(driver, "Test,Comma,Delimited,Line");
        assign.invoke(driver);
    }

}
