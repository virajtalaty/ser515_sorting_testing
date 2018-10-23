package test.java;


import static org.junit.Assert.*;


import java.util.List;
import java.util.Objects;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class SortDemoTest{
	SortDemoData data = new SortDemoData();


	/**
	* testNewAccountsType checks for valid input types in the 1st parameter
	*/
	@Test
	public void testNumber() {
	   data.initializeArray("20");
	   assertTrue(data.myArray.length == 20);
	   
	   data.initializeArray("30");
	   assertTrue(data.myArray.length == 30);
	   
	   data.initializeArray("0");
	   assertTrue(data.myArray.length == 0);
	}


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NegativeArraySizeException.class)
	public void negativeArraySize() {
	    data.initializeArray("-3");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NonIntegerValue() {
	    data.initializeArray("5.5 7 9");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.util.NoSuchElementException.class)
	public void NoSuchElem() {
	    data.initializeArray("");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NoNumber() {
	    data.initializeArray("5 8 y 4");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void SameNumber() {
	    data.initializeArray("5 5 64 4 4");  
	    
	    SortDemoData data2 = new SortDemoData();
	    data2.initializeArray("5 64 4");
		assertTrue(data.myArray.length == 5);
		assertTrue(data.myArray[0].key == data2.myArray[0].key );
		assertTrue(data.myArray[2].key == data2.myArray[1].key );
		assertTrue(data.myArray[3].key == data2.myArray[2].key );
	}

	
	
	// TODO: Include your test cases below
	@Test
	public void sortSelectionSortUnsortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(15);
		itemList[3] = new Item(9);
		
		SortAlgos.selectionSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void nullSelectionSortList()
	{
		SortAlgos.selectionSort(null);
	}
	
	
	@Test
	public void sortInsertionSortUnsortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(15);
		itemList[3] = new Item(9);
		
		SortAlgos.insertionSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void nullInsertionSortList()
	{
		SortAlgos.insertionSort(null);
	}
	
	
	@Test
	public void sortMergeSortUnsortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(15);
		itemList[3] = new Item(9);
		
		SortAlgos.mergeSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void nullMergeSortList()
	{
		SortAlgos.mergeSort(null);
	}
	
	@Test
	public void sortQuickSortUnsortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(15);
		itemList[3] = new Item(9);
		
		SortAlgos.quickSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}
	
	@Test
	public void sortQuickSortSortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(9);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		itemList[3] = new Item(15);
		
		SortAlgos.quickSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}
	
	@Test
	public void sortQuickSortOddElementsList()
	{
		data.initializeArray("9 10 11 12 13");
		
		Item[] itemList = new Item[5];
		itemList[0] = new Item(10);
		itemList[1] = new Item(9);
		itemList[2] = new Item(13);
		itemList[3] = new Item(11);
		itemList[4] = new Item(12);
		
		SortAlgos.quickSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
		assertTrue("Values is correct", data.myArray[4].key == itemList[4].key);
		
	}
	
	
	@Test (expected=java.lang.NullPointerException.class)
	public void nullQuickSortList()
	{
		SortAlgos.quickSort(null);
	}
	
	
	@Test
	public void sortHeapSortUnsortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(15);
		itemList[3] = new Item(9);
		
		SortAlgos.heapSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}

	@Test
	public void sortHeapSortSortedList()
	{
		data.initializeArray("9 10 12 15");
		
		Item[] itemList = new Item[4];
		itemList[0] = new Item(9);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		itemList[3] = new Item(15);
		
		SortAlgos.heapSort(itemList);
		
		assertTrue("Values is correct", data.myArray[0].key == itemList[0].key);
		assertTrue("Values is correct", data.myArray[1].key == itemList[1].key);
		assertTrue("Values is correct", data.myArray[2].key == itemList[2].key);
		assertTrue("Values is correct", data.myArray[3].key == itemList[3].key);
	}

	
	
	@Test (expected=java.lang.NullPointerException.class)
	public void nullHeapSortList()
	{
		SortAlgos.heapSort(null);
	}
}