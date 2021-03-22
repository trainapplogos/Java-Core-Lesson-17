package ua.lviv.trainapplogos;

import java.util.Arrays;

public class IteratorApplication {
	public static void main(String[] args) {
		Integer[] array = {1, 43, -2, 34, 9, 17, -82, 1, 6, 15};
		Integer[] array2 = {1, 43, -2, 34, 9, 17, -82, 1, 6, 15};
		Integer[] array3 = {14, 49, 2, 5, 1, 43, -2, 34, 9, 17, -82, 1, 6, 15, 43, 13, 62};
		Integer[] array4 = {14, 49, 2, 5, 1, 43, -2, 34, 9, 17, -82, 1, 6, 15, 43, 13, 62, 74, 3, 44, 53};

		
		//Task 1:
		System.out.println("----------------------[ Task1 ]----------------------");
		CollectionMod collection = new CollectionMod(array);
		
		Iterator iteratorForward = collection.createForward();
		
		System.out.println("> Initial array: " + Arrays.toString(array));
		System.out.println("> Iterator forward:");
		
		while (iteratorForward.hasNext()) {
			System.out.print(iteratorForward.next() + " ");
		}
		 
		//Task2: 
		System.out.println("\n\n----------------------[ Task2 ]----------------------");
		System.out.println("> Initial array: " + Arrays.toString(array2));
		System.out.println("> Iterator backward over 1 item:");
		
		collection = new CollectionMod(array2);
		Iterator iteratorBackward = collection.createBackward();
		
		while (iteratorBackward.hasNext()) {
			System.out.print(iteratorBackward.next() + " ");
		}
		
		//Task3
		System.out.println("\n\n----------------------[ Task3 ]----------------------");
		System.out.println("> Iterator backward: every 3rd item of array:");
		System.out.println("> Initial array: " + Arrays.toString(array3) + ";\n  arr length: " + array3.length);
		
		
		collection = new CollectionMod(array3);
		iteratorBackward = collection.createBackwardOver2();
		
		System.out.println("> All items over 2 backward: ");
		while (iteratorBackward.hasNext()) {
			Object next = iteratorBackward.next();
			System.out.print(next + " ");
		}
		
		System.out.println("\n> All enen items over 2 backward:");
		iteratorBackward = collection.createBackwardOver2();
		
		while (iteratorBackward.hasNext()) {
			Object next = iteratorBackward.next();
			if ((int) next % 2 != 0) System.out.print(next + " ");
		}
		
		//Task 4:
		System.out.println("\n\n----------------------[ Task4 ]----------------------");
		System.out.println("> Iterator backward: every 5th item of array:");
		System.out.println("> Initial array: " + Arrays.toString(array4) + ";\n  arr length: " + array4.length);
		
		collection = new CollectionMod(array4);
		iteratorForward = collection.createForwardOver4();
		
		System.out.println("> Output all items over 4 forward: ");
		while (iteratorForward.hasNext()) {
			Object next = iteratorForward.next();
			System.out.print(next + " ");
		}
		
		System.out.println("\n> Output all enen items over 4  decrased by 100 forward:");
		iteratorForward = collection.createForwardOver4();
		
		while (iteratorForward.hasNext()) {
			Object next = iteratorForward.next();
			if ((int)next % 2 == 0) System.out.print((int)next - 100 + " ");
		}
		
		//Task 5:
		System.out.println("\n\n----------------------[ Task5 ]----------------------");
		System.out.println("> Iterator backward: every 2nd item of array:");
		System.out.println("> Initial array: " + Arrays.toString(array4) + ";\n  arr length: " + array4.length);
		
		collection = new CollectionMod(array4);
		iteratorForward = collection.createForwardOver2();
		
		System.out.println("> Output all items over 1 forward: ");
		while (iteratorForward.hasNext()) {
			Object next = iteratorForward.next();
			System.out.print(next + " ");
		}
		
		System.out.println("\n> Output all enen items over 1 changed to odd forward:");
		iteratorForward = collection.createForwardOver2();
		
		while (iteratorForward.hasNext()) {
			Object next = iteratorForward.next();
			int res = (int)next;
			if (res % 2 == 0) System.out.print(res + 1 + " ");
		}
		
		
	}	
}
