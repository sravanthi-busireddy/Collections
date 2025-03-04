package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
	public static void main(String[] args) {
		
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(50);
		s1.add(40);
		s1.add(10);
		//produces response in order of entry
		System.out.println(s1);
		s1.remove(10);
		System.out.println(s1);
	}
/* output:
 * [10, 20, 50, 40]
[20, 50, 40]
 */
}
