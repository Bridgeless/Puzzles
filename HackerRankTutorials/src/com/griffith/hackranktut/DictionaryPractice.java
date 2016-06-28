package com.griffith.hackranktut;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> englSpanDictionary = new HashMap<String, String>();
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		englSpanDictionary.put("Saturday", "Sabado");
		englSpanDictionary.put("Sunday", "Domingo");

		
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));		
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));
		//Print all of the keys
		System.out.println(englSpanDictionary.keySet());
		//Pring all of the values
		System.out.println(englSpanDictionary.values());
		//Pring the size
		System.out.println(englSpanDictionary.size());

		
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		//Retrieve items
		System.out.println(shoppingList.get("Sugar"));		
		System.out.println(shoppingList.get("Ham"));
		//Key-value pair printout
		System.out.println(shoppingList.toString());
		//Remove things
		shoppingList.remove("Eggs");
		//Replace values for certain key
		shoppingList.replace("Bread", Boolean.FALSE);
		//Is Empty
		System.out.println(shoppingList.isEmpty());
		//Clear out the dictionary
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		//Is Empty
		System.out.println(shoppingList.isEmpty());

		

	}

}
