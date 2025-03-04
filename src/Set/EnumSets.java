package Set;

import java.util.EnumSet;

public class EnumSets {
	enum Color{
		RED,GREEN,YELLOW
	}
	public static void main(String[] args) {
		System.out.println(Color.GREEN);
		EnumSet<Color> e1=EnumSet.allOf(Color.class);
		EnumSet<Color> e2=EnumSet.of(Color.RED);
		System.out.println(e1);
		System.out.println(e2);
	}
/*output:
 * GREEN
[RED, GREEN, YELLOW]
[RED]
 */
}
