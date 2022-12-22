package testingprograms;

import java.util.HashMap;

public class Hasmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> capitalcity = new HashMap<String,String>();
		
		capitalcity.put("tamilnadu", "chennai");
		capitalcity.put("pondichery", "pondichery");
		capitalcity.put("andhra","tirupati");
		capitalcity.put("telugana", "musiri");
		
//		System.out.println(capitalcity);
//		
//		System.out.println(capitalcity.get("telugana"));
//		
//		System.out.println(capitalcity.size());
//		System.out.println(capitalcity.containsKey("andhra"));
//		System.out.println(capitalcity.clone());
//		System.out.println(capitalcity.containsValue("chennai"));
//		
//		System.out.println(capitalcity.remove("andhra"));
//		System.out.println(capitalcity);
//		
//		
//		for (String i:capitalcity.values()) {
//			
//			System.out.println(i);
			
//		}
		System.out.println("checking..........");
		for (String i:capitalcity.keySet()) {
			//System.out.println(i);
			System.out.println(capitalcity.get(i));
		}

	}

}
