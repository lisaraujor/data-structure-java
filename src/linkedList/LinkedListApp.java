package linkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		System.out.println("Size: " + list.getSize());
		System.out.println();
		
		list.removeByIndex(1);
		
		System.out.println(list);
		System.out.println("Size: " + list.getSize());
		System.out.println();
		
		list.removeByIndex(3);
		
		System.out.println(list);
		System.out.println("Size: " + list.getSize());
	}
}
