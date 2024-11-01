// Logan Torma-Kim
// 10/31/2024
// pd 3
//testing the many methods of the class
public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList test = new MyLinkedList();
    test.add("obj1");
    test.add("obj2");
    test.add("obj3");
    test.add("obj4");
    test.add("obj5");
    test.add("obj6");
    test.add("obj7");
    test.add("obj8");
    test.add("obj9");
    System.out.println("Original list  ");
    System.out.println(test);
    test.addLast("objLast");
    System.out.println("List with addLast  ");
    System.out.println(test);
    test.addFirst("objFirst");
    System.out.println("After adding first ");
    System.out.println(test);
    test.set(7, "SetObj");
    System.out.println("After setting new object ");
    System.out.println(test);
    System.out.println("Using the get method, the item at 2 is " + test.get(2));
    test.remove(1);
    System.out.println("after using .remove to remove item at 1");
    System.out.println(test);
    System.out.println("Size is "+ test.size());
    System.out.println("Is test empty? " + test.isEmpty());
    test.removeFirst();
    System.out.println("After removing first");
    System.out.println(test);
    test.removeLast();
    System.out.println("After removing last");
    System.out.println(test);
  } // end main
  
} // end class
