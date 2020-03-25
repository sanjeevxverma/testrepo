package com.bindu.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bindu.testobjects.Animal;
import com.bindu.testobjects.Bakri;
import com.bindu.testobjects.Sheru;
import com.bindu.testobjects.Tommy;

public class TestCollections {

	public static void main(String[] args) {
		TestCollections obj1 = new TestCollections();
		obj1.testHashMap();
		obj1.testForLoop(obj1.testArrayList());
		int[] numbers = {0,0,2,4,3,3,100,4,5,6,6,7,7,7,9,100,12,12,16,14,59,58,58};
		obj1.testDupIdentification(numbers);
	}

	public void testForLoop(List list) {
		Iterator itr = list.iterator();
		for (;;) {
			if (itr.hasNext()) {
				Animal animal = (Animal) itr.next();
				animal.eatFood();
			} else {
				break;
			}
		}
	}

	public void testDupIdentification(int[] nums) {
		//we want to find which number occurred how many times in this array
		//to do this, we will use a hashmap, and store the number as the key as they appear in the array, and occurrence as the number of times that number appears in the array.
		//we will iterate over each element in the array, and for each element, we will check if that number already exists in the Map. if it does, we will increment its "value" by one
		//if it is not already existing in the map, we will add it to the map, will a occurrence value of 1.
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for(int index = 0; index < nums.length; index++) {
			int number = nums[index];
			if(numMap.containsKey(number)) {
				int occurrence = numMap.get(number);
				numMap.put(number, ++occurrence);
			} else {
				numMap.put(number,1);
			}
		}
		Set<Integer> keys = numMap.keySet();
		for (int numberKey : keys) {
			System.out.println("Number:" + numberKey);
			System.out.println("Occurence:" + numMap.get(numberKey));
		}
	}
	
	
	
	public List testArrayList() {
		List list1 = new ArrayList();
		list1.add(new Sheru());
		list1.add(new Bakri());
		list1.add(new Tommy());
		return list1;
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
