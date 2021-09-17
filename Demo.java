package collection;

import java.util.*;


public class Demo {
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueuekDemo();
		doSetDemo();
		doMapDemo();
	}


	private static void doListDemo() {
		// TODO Auto-generated method stub
		System.out.println("In doListDemo");
		List<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doStackDemo() {
		// TODO Auto-generated method stub
		System.out.println("In doStackDemo");
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		String pop = stack.pop();
		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	private static void doQueuekDemo() {
		System.out.println("In doQueueDemo");
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());

		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	private static void doSetDemo() {
		System.out.println("In doSetDemo");
		Set<String> set = new LinkedHashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("d");
		for(String str : set) {
			System.out.println(str);
		}
		set.forEach((value)
	                -> System.out.println(value));
	}
	private static void doMapDemo() {
		System.out.println("In doMapDemo");
		Map<String,Integer> map = new HashMap<>();
		map.put("a",100);
		map.put("b",200);
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		map.forEach(
	            (key, value)
	                -> System.out.println(key + " = " + value));
	}
	
	
}
