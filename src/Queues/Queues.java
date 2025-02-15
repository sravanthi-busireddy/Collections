package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<Integer>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
	}
	/* output:
 [10, 20, 30, 40, 50]
10
[20, 30, 40, 50]
20
[20, 30, 40, 50]
	 */

}
