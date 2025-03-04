package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("IN","India");
		//Does not allow duplicate keys
		map.put("IN", "India");
		map.put("US","United States");
		System.out.println(map);//{IN=India, US=United States}
		//existed key but different value updates the values
		map.put("IN","Indiana");
		System.out.println(map);//{IN=Indiana, US=United States}
		map.put("UK", "United Kingdom");
		map.put("es", "Spain");
		System.out.println(map);//{IN=Indiana, UK=United Kingdom, US=United States, es=Spain}
		map.remove("UK");
		System.out.println(map);//{IN=Indiana, US=United States, es=Spain}
		System.out.println(map.get("US"));//United States
		System.out.println(map.getOrDefault("US","Others"));//United States
		System.out.println(map.getOrDefault("UA","Others"));//Others
		map.putIfAbsent("IN","India");
		System.out.println(map);//{IN=Indiana, US=United States, es=Spain}
		map.putIfAbsent("LA", "Los Angeles");
		System.out.println(map);//{IN=Indiana, LA=Los Angeles, US=United States, es=Spain}
		System.out.println(map.containsKey("US"));//true
		System.out.println(map.containsKey("AU"));//false
		System.out.println(map.containsValue("United States"));//true
		System.out.println(map.containsValue("united s"));//false
		map.remove("IN","Indiana");
		System.out.println(map);//{LA=Los Angeles, US=United States, es=Spain}
		map.put("IN", "India");
		System.out.println(map);//{LA=Los Angeles, IN=India, US=United States, es=Spain}
		System.out.println(map.keySet());//[LA, IN, US, es]
		//Storing the key set 
		//As keys are unique , we use Set
		Set<String> set=map.keySet();
		System.out.println(set);//[LA, IN, US, es]
		System.out.println(map.values());//[Los Angeles, India, United States, Spain]
		// It is not accepting set because values can be duplicate . So we use collection or ArrayList or anything that allows duplicates
		Collection<String> collection=map.values();
		System.out.println(collection);//[Los Angeles, India, United States, Spain]
		//In order to tranverse and get key-values response use entrySet method and Entry class
		Set<Map.Entry<String, String>> entries=map.entrySet();
		for(Map.Entry<String, String> entry:entries) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		/* output:
		 * LA,Los Angeles
           IN,India
		   US,United States
		   es,Spain
		 */
		Map<String,String> map2= new HashMap<>();
		map2.put("NY", "NewYork");
		map2.put("HYD", "Hyderabad");
		System.out.println(map2);//{HYD=Hyderabad, NY=NewYork}
		map.putAll(map2);
		System.out.println(map);//{HYD=Hyderabad, LA=Los Angeles, IN=India, NY=NewYork, US=United States, es=Spain}
		map2.clear();
		System.out.println(map2);//{}
	}

}
