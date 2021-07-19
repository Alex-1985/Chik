package org.chik;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListTest<pubic> {

    public static final int INITIAL_CAPACITY = 5;
    private List<String> list;

    @Before
    public void setUp() throws Exception {
//      list = new ArrayList(INITIAL_CAPACITY);
        list = new ArrayList<String>(INITIAL_CAPACITY);
//      list = new MyArrayList<String>(INITIAL_CAPACITY);
    }

    @Test
    public void testClear() {
        list.add("elem1");
        list.add("elem2");
        assertEquals("Incorrect size of the list ", 2, list.size());
//      assertEquals(list.size(), 2);
        list.clear();
        assertEquals("Incorrect size of the list ", 0, list.size());
    }
    @Test
    public void testAdd1() {        //are tests always 'void'?
        list.add("elem1");
        list.add("elem2");
        list.add(0,"elem0");
//        assertTrue("Incorrect sequence","elem0",list.get(0));    //dont work, return later
        assertTrue("There is no such element",list.contains("elem0"));
        assertTrue("There is no such element",list.contains("elem10"));
        assertFalse("The element is present",list.contains("elem101"));
        assertFalse("The element is present",list.contains("elem1"));
    }
}