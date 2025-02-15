package lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println("index of list1: "+list1.indexOf(20));
		System.out.println("lastIndex of list1: "+list1.lastIndexOf(30));
		System.out.println("get the element: "+list1.get(2));
		System.out.println("set the element: "+list1.set(2, 300));
		System.out.println("remove the element: "+list1.remove(3));
		list1.add(4, 500);
		System.out.println("add element from the index: "+ list1);
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+ " ");	
		}
		System.out.println();
		for(Integer lst:list1) {
			System.out.println(lst);
		}
		Iterator<Integer> lt=list1.iterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		Iterator<Integer> lt1= list1.listIterator();
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
		}
		Iterator<Integer> lt2=list1.listIterator(3);
		while(lt2.hasNext()) {
			System.out.println(lt2.next());
		}
		List<Integer> lt3= list1.subList(3, 5);
		System.out.println("sublist:"+ lt3);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list1);
		System.out.println("size : "+ list1.size());
		System.out.println("remove: "+ list1.remove(4));
		System.out.println(list1);
		System.out.println("is Empty: "+list1.isEmpty());
		System.out.println("is contains: "+list1.contains(40));
		System.out.println("is contains: "+list1.contains(25));
		System.out.println("addAll: "+list1.addAll(list2));
		System.out.println(list1);
		System.out.println("retainAll: "+list1.retainAll(list2));
		System.out.println(list1);
		System.out.println("removeAll: "+list2.removeAll(list1));
		System.out.println(list1);
		Object a[]=list1.toArray();
		for(Object e:a) {
			Integer temp= (Integer) e;
			System.out.println(temp);
		}
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);	
		
	}
	/* output:
	 * index of list1: 1
lastIndex of list1: 2
get the element: 30
set the element: 30
remove the element: 40
add element from the index: [10, 20, 300, 50, 500]
10 20 300 50 500 
10
20
300
50
500
10
20
300
50
500
10
20
300
50
500
50
500
sublist:[50, 500]
[10, 20, 300, 50, 500]
size : 5
remove: 500
[10, 20, 300, 50]
is Empty: false
is contains: false
is contains: false
addAll: true
[10, 20, 300, 50, 1, 2, 3]
retainAll: true
[1, 2, 3]
removeAll: true
[1, 2, 3]
1
2
3
[1, 2, 3]
[]
	 */

}
