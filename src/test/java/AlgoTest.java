package test.java;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	SortDemoData data = new SortDemoData();
	Item i1;
	Item i2;
	Item i3;
	Item i4;
	
	@Before
	public void initialiseValues() {
		i1 = new Item(12);
		i2 = new Item(10);
		i3 = new Item(9);
		  
	}
	
	
	/*
	 * Unsorted Item List
	 * 
	 * From the question 1C 
	 * The test case will cover the Node Coverage ( No 2 Node coverage) 
	 * and a Edge Coverage ( No 2 Edge coverage)
	 * and a true Condition Coverage ( No 1 Condition coverage) 
	 * 
	 * On running this case the test case was falling, so corrected bubble sort algorithm
	 */
	@Test
	public void testUnsortedList() {
		
		Item[] itemList = new Item[3];
		itemList[0] = i1;
		itemList[1] = i2;
		itemList[2] = i3;
		data.initializeArray("9 10 12");
		
		SortAlgos.bubbleSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
	}

	
	/* Null Item List
	 * 
	 * From the question 1C 
	 * The test case will cover the Node Coverage ( No 1 Node coverage) 
	 * and a Edge Coverage ( No 1 Edge coverage) 
	 */
	@Test(expected = NullPointerException.class)
	public void testNullList() {
		Item[] itemList = null;
		SortAlgos.bubbleSort(itemList);
	}
	
	/*
	 * Sorted Item List
	 * 
	 * From the question 1C 
	 * The below test case will cover the Edge Coverage ( No 3 Edge coverage) 
	 * and a Condition Coverage ( No 2 Condition coverage) 
	 */
	@Test
	public void testSortedList() {
		
		Item[] itemList = new Item[3];
		itemList[0] = i3;
		itemList[1] = i2;
		itemList[2] = i1;
		
		data.initializeArray("9 10 12");
		
		SortAlgos.bubbleSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
	}

	
}
