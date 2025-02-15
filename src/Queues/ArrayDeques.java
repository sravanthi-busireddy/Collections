package Queues;
import java.util.ArrayDeque;

public class ArrayDeques {
	public static void main(String[] args) {
		ArrayDeque<Integer> dq= new ArrayDeque<>();
		dq.offer(10);
		dq.offerLast(20);
		dq.offerFirst(30);
		
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		
		//implementing stack using deque
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		//implementing queue using deque
		ArrayDeque<Integer> queue=new ArrayDeque<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}
	/*output:
[30, 10, 20]
30
30
20
[30, 10, 20]
30
10
20
[]
[30, 20, 10]
30
[20, 10]
[10, 20, 30]
10
[20, 30]
	 */

}
