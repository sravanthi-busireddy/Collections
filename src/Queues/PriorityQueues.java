package Queues;

import java.util.PriorityQueue;

public class PriorityQueues {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		PriorityQueue<Integer> pq1= new PriorityQueue<>((a,b)->b-a);
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		/*output:
		 [10, 20, 30, 40]
10
[20, 40, 30]
20
[30, 40]
30
[40]
40
[]
[40, 30, 20, 10]
40
[30, 10, 20]
30
[20, 10]
20
[10]
10
[]
*/
	}

}
