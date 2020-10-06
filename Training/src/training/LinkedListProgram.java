package training;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("AMB");
		ll.add("Ambu");
		ll.add("Ambaarish");
		ll.add("Ambaa");
		
		System.out.println("The linked list are "+ll);
		
		ll.addFirst("Amb");
		ll.addLast("Ambeei");
		ll.add(1, "Bab");
		
		System.out.println("The linked list are "+ll);
		
		LinkedList<String> la = new LinkedList<String>();
		la.add("Baa");
		la.add("Abb");
		la.add("Maa");
		
		System.out.println("*****************");
		
		ll.addAll(la);
		for(int i=0 ; i<ll.size() ; i++) {
			System.out.println(ll.get(i));
			
		}
		
		la.remove("Baa");
		la.remove(0);
		
		System.out.println("The linked List are "+la);
		
		System.out.println("*****************");
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("*****************");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		
		
		
	}

}
