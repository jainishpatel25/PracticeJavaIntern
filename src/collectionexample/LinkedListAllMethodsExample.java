package collectionexample;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

public class LinkedListAllMethodsExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // =========================
        // 1️⃣ ADD METHODS
        // =========================														// []
        list.add("A");                 // add at end
        list.add("B");
        list.addFirst("Start");        // add at beginning
        list.addLast("End");           // add at end
        list.add(2, "Middle");         // add at index
        list.offer("OfferElement");    // queue style add
        list.offerFirst("OfferFirst");
        list.offerLast("OfferLast");

        System.out.println("After Adding: " + list);

        // =========================
        // 2️⃣ GET METHODS
        // =========================
//        System.out.println("First: " + list.getFirst());
//        System.out.println("Last: " + list.getLast());
//        System.out.println("Index 2: " + list.get(2));
//        System.out.println("Peek: " + list.peek());
//        System.out.println("Peek First: " + list.peekFirst());
//        System.out.println("Peek Last: " + list.peekLast());
//
//        // =========================
//        // 3️⃣ SEARCH METHODS
//        // =========================
//        System.out.println("Contains B? " + list.contains("B"));
//        System.out.println("Index of B: " + list.indexOf("B"));
//        System.out.println("Last Index of B: " + list.lastIndexOf("B"));

        // =========================
        // 4️⃣ REMOVE METHODS
        // =========================
        list.remove();                // remove first
        System.out.println(list);
        list.remove("Middle");        // remove by value
        list.remove(2);               // remove by index
        list.removeFirst();
        list.removeLast();
        list.poll();                  // queue remove
        list.pollFirst();
        list.pollLast();

        System.out.println("After Removing: " + list);

        // =========================
        // 5️⃣ STACK METHODS
        // =========================
        list.push("X");
        list.push("Y");
        list.push("Z");

        System.out.println("After Push: " + list);

        System.out.println("Pop: " + list.pop());
        System.out.println("After Pop: " + list);

        // =========================
        // 6️⃣ ITERATION METHODS
        // =========================
        list.add("M");
        list.add("N");
        list.add("O");

        System.out.println("Using For-each:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Using Descending Iterator:");
        Iterator<String> desc = list.descendingIterator();
        while (desc.hasNext()) {
            System.out.println(desc.next());
        }

        // =========================
        // 7️⃣ BULK METHODS
        // =========================
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("P");
        list2.add("Q");

        list.addAll(list2);     // add all elements
        System.out.println("After addAll: " + list);

        list.removeAll(list2);  // remove all matching
        System.out.println("After removeAll: " + list);

        list.retainAll(Collections.singleton("M"));
        System.out.println("After retainAll: " + list);

        // =========================
        // 8️⃣ CLEAR & SIZE
        // =========================
        System.out.println("Size: " + list.size());
        list.clear();
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
