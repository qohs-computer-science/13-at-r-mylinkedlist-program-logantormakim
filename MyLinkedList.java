// Logan Torma-Kim
// 10/23/2024
// pd 3
public class MyLinkedList
{
    private ListNode head;
    private ListNode size;
    public MyLinkedList() {
        head = null; // when head = null list is empty
        size = 0;
    } // end constructor
    
    //start of methods
    public int size() {
        return size;
    } // end size
    
    public boolean isEmpty() {
        if (size == 0 || head == null) {
            return true; 
        }
        else {
            return false;
        }
    } // end isEmpty

    public boolean add(Object newItem) {
        ListNode temp = head;
        int size1 = temp.size();
        while (temp.getNext() != null) {
            temp=temp.getNext();
        }
        temp.set(newItem);
        if (size1!= head.size()) {
            return true;
        }
        else {
            return false;
        }
    } // end add

    public boolean addFirst(Object newItem) {
        ListNode temp = head;
        for (int x = 0; x < head.size(); x++) {
            
        }
    }






    //to string
    public String toString (){
        ListNode temp = head;
        out = "";
        int val =1;
        while (temp.getNext() != null) {
            out+= val +":" + temp.getNext();
            System.out.println(" ");
            val++;
            temp.getNext();
        }
        return out;
    } // end toString

}
