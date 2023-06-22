package listAssignmentTest;

import listImplementation.MyListImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class listimplementationtest {
    MyListImplementation myListImplementation = new MyListImplementation(8);

    @BeforeEach
    public void startWith() {

    }

    @Test
    public void listImplementationIsCreatedTest() {
        MyListImplementation myListImplementation = new MyListImplementation(4);
        assertNotNull(myListImplementation);
    }

    @Test
    public void listIsEmptyTest() {
        myListImplementation.myListIsEmpty();
        assertTrue(myListImplementation.myListIsEmpty());
    }

    @Test
    public void addElementsToList_ListShouldNotBeEmptyTest() {
        myListImplementation.add(2);
        assertFalse(myListImplementation.myListIsEmpty());
        System.out.println(myListImplementation.myListIsEmpty());
    }
    @Test public void addTwoElementsToList_ListShouldNotBeEmptyTest(){
        myListImplementation. add(2);
        myListImplementation.add(1);
        assertFalse(myListImplementation.myListIsEmpty());
    }
    @Test public void removeOneElementFromList_ListShouldNotBeEmptyTest(){
        myListImplementation.add(1);
        myListImplementation.add(4);
        assertFalse(myListImplementation.myListIsEmpty());
        int actual = myListImplementation.removeElements();
        assertEquals(4,actual);

    }@Test public void removeAllElements(){
        myListImplementation.add(1);
        myListImplementation.add(0);
        myListImplementation.add(7);
        myListImplementation.add(8);

        myListImplementation.removeElements();
        myListImplementation.removeElements();
        myListImplementation.removeElements();
        myListImplementation.removeElements();
        assertTrue(myListImplementation.myListIsEmpty());
    }



}