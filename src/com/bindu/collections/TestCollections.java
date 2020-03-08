package com.bindu.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.bindu.testobjects.Bakri;
import com.bindu.testobjects.Sheru;
import com.bindu.testobjects.Tommy;

public class TestCollections {

	public static void main(String[] args) {
		TestCollections obj1 = new TestCollections();
		obj1.testHashMap();
	}

	public void testArrayList() {
		ArrayList list1 = new ArrayList();
		list1.add(new Sheru());
		list1.add(new Bakri());
		list1.add(new Tommy());
	}

	public void testGenericArrayList() {
		ArrayList<Sheru> list1 = new ArrayList<Sheru>();
		list1.add(new Sheru());
	}

	public void testHashMap() {
		HashMap<String, String> map1 = new HashMap<String, String>();

		map1.put("sanjeev", "manager");
		map1.put("bindu", "developer");
		map1.put("yash", "student");

		for (Map.Entry<String, String> ent : map1.entrySet()) {
			System.out.println("Key:" + ent.getKey());
			System.out.println("Value:" + ent.getValue());

		}

	}
}
