package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		Set<Integer> s1=new TreeSet<Integer>();
		s1.add(40);
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(20);
		System.out.println(s1);
		s1.remove(10);
		System.out.println(s1);
	}
	/*output
	 * [10, 20, 30, 40]
[20, 30, 40]
	 */

}
