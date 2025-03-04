package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}
	
	
}

public class HashSets {
	public static void main(String[] args) {
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(50);
		s2.add(40);
		s2.add(10);
		//produces response randomly
		System.out.println(s2);
		Set<String> h1=new HashSet<String>();
		h1.add("Sravs");
		h1.add("Neels");
		h1.add("Bujji");
		h1.add("Sravs");
		System.out.println(h1);
		h1.remove("Sravs");	
		System.out.println(h1);
		Set<Student> s1=new HashSet<Student>();
		s1.add(new Student(1,"Sravs"));
		s1.add(new Student(1,"Sravs"));
		s1.add(new Student(2,"Sravs"));
		s1.add(new Student(3,"Neels"));
		s1.add(new Student(1,"Neels"));
		System.out.println(s1);	
	}
	/*output:
	 * [50, 20, 40, 10]
	 [Sravs, Bujji, Neels]
[Bujji, Neels]
[Student [rollNo=1, name=Sravs], Student [rollNo=2, name=Sravs], Student [rollNo=3, name=Neels]]
	 */

}

