import java.util.ArrayList;

import org.junit.Test;


public class PromptTest {

    public ArrayList<City> makeTestList() {
        // List with unique out-of-order elements to test sorting methods
        ArrayList<City> testList = new ArrayList<City>();
        testList.add(new City("Name1", "333", "22", "Coun1", "N3", "E2", "1"));
        testList.add(new City("Name2", "111", "33", "Coun2", "N1", "E3", "2"));
        testList.add(new City("Name3", "222", "11", "Coun3", "N2", "E1", "3"));
        return testList;
    }

    /*
    @Test
    public void testMultiple() {
        // Make sure user input works
        String[] testFiles = Prompt.getFiles();
        for (int i = 0; i < testFiles.length; i++)
        {
            System.out.println(testFiles[i]);            
        }
        
        String testData = Prompt.getDataType();
        System.out.println(testData);

        String testSort = Prompt.getSortMethod(testData);
        System.out.println(testSort);
        
        boolean testExit = Prompt.getContinue();
        System.out.println(testExit);
        
    }
    */
    
    @Test
    public void testGetFiles() {
        // Make sure user input works
        Prompt.getFiles();
    }
    

    
    @Test
    public void testGetDataType() {
        // No asserts; dependent on user input
        System.out.println(Prompt.getDataType());
    }
    
    
    
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
        ArrayList<? extends Region> list = new ArrayList<City>();
        // Make sure user input works
        Prompt.getOutputPreference();
    }
    */

    
    @Test
    public void testGetContinue() {
        // Make sure user input works and reflects intent; display the result
        boolean testExit = Prompt.getContinue();
        System.out.println(testExit);
    }
    
    

}
