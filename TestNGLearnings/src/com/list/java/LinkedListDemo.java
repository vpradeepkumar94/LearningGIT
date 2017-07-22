package com.list.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LinkedListDemo {
	
	List<Integer> integerList;
	
    @BeforeClass
	public void initialiseLinkedList() {
		integerList = new LinkedList<Integer>();
		System.out.println("hello");
	}
    
    @AfterClass
    public void removeAllItemsFromList() {
    	integerList.removeAll(integerList);
    }
	
    @Test
    public void addItemsToList() {
    	integerList.add(1);
    	integerList.add(2);
    	integerList.add(3);
    	integerList.add(3,4);
    }
    
    @Test
    public void  addItemsToSpecifiedIndex() {
    	integerList.add(4, 5);
    	integerList.add(5, 6);
    	integerList.add(6, 7);
    }
	
    @Test
    public void removedItemFromList() {
    	integerList.remove(1);
    	integerList.remove(4);
    }
    
    @Test
    public void removedItemFromListByIndex() {
    	integerList.remove(3);
    	integerList.remove(2);
    }
    
    @AfterMethod
    public void displayListContents(){
    	System.out.println("List Contents");
    	System.out.println("==================");
    	integerList.forEach(v -> System.out.println(v));
    }
    @Test (dependsOnMethods="removedItemFromListByIndex")
    public void displayAll() {
    	
	  	Iterator<Integer> il   =	integerList.iterator();
	  	System.out.println("Using Iterator");
	  	System.out.println("=====================");
	  	while(il.hasNext()) {
	  		System.out.println(il.next());
	  	}
    }
    
    @Test
    public void iterateInDescendingOrder() {
    	
    	 //Iterator il = integerList.desc
        Iterator<Integer> it = ((LinkedList<Integer>) integerList).descendingIterator();
        System.out.println("descending orger");
        while(it.hasNext()) {
        	System.out.println(it.next());
        }

    }

}
