package com.map.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HashMapDemo {
  
	Map <String,Integer> myHashMap;
	
  @AfterMethod (enabled=true)
  public void afterMethod() {
	  
//	  myHashMap.forEach((k,v) ->System.out.println("Key is : "+ k + " value is " +v));
//	  
//	  System.out.println("using map entry set");
//	  for(Map.Entry<String,Integer> map : myHashMap.entrySet()) {
//		  System.out.println(map.getKey());
//		  System.out.println("=============================");
//		  System.out.println(map.getValue());
//	  }
	  System.out.println("======================================");

	  System.out.println("======================================");
  }

  @BeforeClass
  public void beforeClass() {
   myHashMap = new HashMap<String, Integer>(); 
  }


  @Test
  public void addItems() {
	  myHashMap.put("Ram", 101);
	  myHashMap.put("jam", 102);
	  myHashMap.put("sam", 103);
	  myHashMap.put("kam", 105);
	  myHashMap.put("tam", 105);
	  myHashMap.put("vam", 105);
  }
  
  @Test (enabled=true)
  public void displayAll() {
	  
	 Map <String,List<String>> maps = new HashMap<String,List<String>>();
	 
	 List<String> myList = Arrays.asList("vamsi","jaisri","kicha","ballu");
	 List<String> myList3 = Arrays.asList("one","tsam","tetete","ceteteteteehuchu");
	 List<String> myList2 = Arrays.asList("ram","sam","mano","chuchu");
	 
	 maps.put("Family1", myList);
	 maps.put("Family3", myList3);
	 maps.put("Family2", myList2);
	 
//	 System.out.println("==========================================");
//	 maps.forEach((k,v) ->{
//		 System.out.println(k);
//		 System.out.println(v);
//	 });
	 System.out.println("Hashmpa");
	 for(Map.Entry<String, List<String>> me : maps.entrySet()){
		 System.out.println(" key" + me.getKey() + "has values");
		 for(String val : me.getValue()){
			 System.out.println(val);
		 }
	 }
  
  }
  @Test
  public void displayAllLinkedHash() {
	  
	 Map <String,List<String>> maps = new LinkedHashMap<String,List<String>>();
	 
	 List<String> myList = Arrays.asList("vamsi","jaisri","kicha","ballu");
	 List<String> myList3 = Arrays.asList("one","tsam","tetete","ceteteteteehuchu");
	 List<String> myList2 = Arrays.asList("ram","sam","mano","chuchu");
	 
	 maps.put("Family1", myList);
	 maps.put("Family3", myList3);
	 maps.put("Family2", myList2);
	 
	 
//	 System.out.println("==========================================");
//	 maps.forEach((k,v) ->{
//		 System.out.println(k);
//		 System.out.println(v);
//	 });
	 
	 for(Map.Entry<String, List<String>> me : maps.entrySet()){
		 System.out.println(" key" + me.getKey() + "has values");
		 for(String val : me.getValue()){
			 System.out.println(val);
		 }
	 }
  
  }

@Test
public void displayAllTree() {
	  
	 Map <String,List<String>> maps = new TreeMap<String,List<String>>();
	 
	 List<String> myList = Arrays.asList("vamsi","jaisri","kicha","ballu");
	 List<String> myList3 = Arrays.asList("one","tsam","tetete","ceteteteteehuchu");
	 List<String> myList2 = Arrays.asList("ram","sam","mano","chuchu");
	 
	 maps.put("Family1", myList);
	 maps.put("Family3", myList3);
	 maps.put("Family2", myList2);
	 
	 
//	 System.out.println("==========================================");
//	 maps.forEach((k,v) ->{
//		 System.out.println(k);
//		 System.out.println(v);
//	 });
	 
	 for(Map.Entry<String, List<String>> me : maps.entrySet()){
		 System.out.println(" key" + me.getKey() + "has values");
		 for(String val : me.getValue()){
			 System.out.println(val);
		 }
	 }

}
}
