import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class sortTest {
    
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
    public void testSortByArea() {
        ArrayList<City> list = makeTestList();
        sort.sortByArea(list);
        assertEquals(list.get(0).getArea(), "11");
    }

    @Test
    public void testSortByPopulation() {
        ArrayList<City> list = makeTestList();
        sort.sortByPopulation(list);
        assertEquals(list.get(0).getPop(), "111");
    }

    @Test
    public void testSortByLat() {
        ArrayList<City> list = makeTestList();
        sort.sortByLat(list);
        assertEquals(list.get(0).getLat(), "N1");
    }

    @Test
    public void testSortByLon() {
        ArrayList<City> list = makeTestList();
        sort.sortByLon(list);
        assertEquals(list.get(0).getLon(), "E1");
    }

    @Test
    public void testSortByElev() {
        ArrayList<City> list = makeTestList();
        sort.sortByArea(list);
        assertEquals(list.get(0).getElev(), "1");
    }

    @Test
    public void testSortLexi() {
        ArrayList<City> list = makeTestList();
        sort.sortLexi(list);
        assertEquals(list.get(0).getName(), "Name1");
    }

    @Test
    public void testSortRandomly() {
        // Nothing to assert for a random sort, so run and print the results to
        // ensure the method works
        ArrayList<City> list = makeTestList();
        for (int i = 0; i < 3; i++) {
            sort.sortRandomly(list);
            for (City iter: list) {
                System.out.println(iter.getName());
            }            
        }
    }
    
    */

}
