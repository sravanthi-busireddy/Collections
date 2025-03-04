package ComparableAndcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomizedComparable implements Comparator<Animal>{
	@Override
	public int compare(Animal o1, Animal o2) {
		return Integer.compare(o1.getWeight(),o2.getWeight());
	}
	
}

public class ComparableAndcomparator {
	public static void main(String[] args) {
		Animal a1=new Animal(1,"Leo",4);
		Animal a2=new Animal(5,"Johny",7);
		Animal a3=new Animal(2,"Rinkle",3);
		Animal a4=new Animal(7,"Twinkle",2);
		Animal a5=new Animal(1,"Boss",3);
		List<Animal> dogs=new ArrayList<>();
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);
		dogs.add(a5);
		System.out.println(dogs);
		/*
		 * [Animal [age=1, name=Leo, weight=4]
, Animal [age=5, name=Johny, weight=7]
, Animal [age=2, name=Rinkle, weight=3]
, Animal [age=7, name=Twinkle, weight=2]
, Animal [age=1, name=Boss, weight=3]
]
		 */
		Collections.sort(dogs);
		System.out.println(dogs);
		/*
		 * [Animal [age=1, name=Boss, weight=3]
, Animal [age=1, name=Leo, weight=4]
, Animal [age=2, name=Rinkle, weight=3]
, Animal [age=5, name=Johny, weight=7]
, Animal [age=7, name=Twinkle, weight=2]
]

		 */
		//using comparator
		Collections.sort(dogs, new CustomizedComparable());
		System.out.println(dogs);
		/*
		 * [Animal [age=7, name=Twinkle, weight=2]
, Animal [age=1, name=Boss, weight=3]
, Animal [age=2, name=Rinkle, weight=3]
, Animal [age=1, name=Leo, weight=4]
, Animal [age=5, name=Johny, weight=7]
]
		 */
		Collections.sort(dogs, (o1,o2)-> o1.getAge()-o2.getAge());
		System.out.println(dogs);
		/*
		 * [Animal [age=1, name=Boss, weight=3]
, Animal [age=1, name=Leo, weight=4]
, Animal [age=2, name=Rinkle, weight=3]
, Animal [age=5, name=Johny, weight=7]
, Animal [age=7, name=Twinkle, weight=2]
]
		 */
		Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));
		System.out.println(dogs);
		/*
		 * [Animal [age=1, name=Boss, weight=3]
, Animal [age=1, name=Leo, weight=4]
, Animal [age=2, name=Rinkle, weight=3]
, Animal [age=5, name=Johny, weight=7]
, Animal [age=7, name=Twinkle, weight=2]
]
		 */
		int a[][]= {
				{4,6,2},
				{5,3,2},
				{1,2,7}
		};
		//sort based on first index is smaller
		Arrays.sort(a, (arr1,arr2)-> {
			return arr1[0]-arr2[0];
		}
		);
		for(int e[]: a) {
			for(int i:e) {
				System.out.print(i +" ");
			}
			System.out.println("\n");
		}
		/*
		 * 1 2 7 

		   4 6 2 

		   5 3 2 
		 */
	}
}
