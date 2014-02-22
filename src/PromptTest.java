import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PromptTest {

    /*
    @Test
    public void testGetFiles() {
        // Make sure user input works
        Prompt.getFiles();
    }
    */

    /*
    @Test
    public void testGetDataType() {
        // No asserts; dependent on user input
        System.out.println(Prompt.getDataType());
    }
    */
    
    @Test
    public void testGetSortMethod() {
        // No asserts; dependent on user input
        // Tests for actual sorting methods are in SortTest.java
        String data = Prompt.getDataType();
        System.out.println(Prompt.getSortMethod(data));
    }

    /*
    @Test
    public void testGetOutputPreference() {
        // Make sure user input works
        Prompt.getOutputPreference();
    }

    @Test
    public void testGetContinue() {
        // Make sure user input works and reflects intent; display the result
        boolean testExit = Prompt.getContinue();
        System.out.println(testExit);
    }
    
    */

}
