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
            head = new ListNode(newItem,head) 
                return true;
        } // end addFirst

    public boolean addLast(Object newItem) {
            add(newItem);
            return true;
    } // end addLast

    public Object get(int i) {
        ListNode temp = head;
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        else {
            for (int x = 0; x<i; x++) {
                temp= temp.getNext();
            } // end for loop
            return temp.getValue();
        } // end else
    } // end get

    public Object set(int i, Object newValue) {
        ListNode temp = head;
        if (i <= head.size() || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        else {
            for (int x = 0; x<i;x++) {
                temp = temp.getNext();
            }
        Object setVal = temp.setValue();
        temp.setValue(newValue);
        return setVal;
        } // end else
    } // end set

    public Object remove(int i) {
        ListNode temp = head;
        ListNode temp2 = head
        if (i <= head.size() || i >= size()) {
            throw new IndexOutOfBoundsException();
        } 
        else {
            for (int x = 0; x<i;x++) {
                temp=temp.getNext();
            }
            temp2 = temp.getNext();
            temp.getNext(temp2.getNext());
            Object removeReturnValue = temp2.getValue();
            temp2.setNext(null);
            size = size-1;
            return removeReturnValue; 
        }
    } // end remove

    public Object removeFirst() {
        if (size ==0) {
            return null;
        } // end if
        Object removeFirstReturnValue = temp2.getNext();
        ListNode temp = head;
        ListNode temp2= head;
        temp=temp.getNext();
        temp2.setNext(null);
        size--;
        return removeFirstReturnValue; 
    } // end remove first

    public Object removeLast() {
        ListNode temp = head;
        if (size == 0 ) {
            return null; 
        } // end if
        while (temp.getNext().getNext() != null) {
                temp.getNext();
        }
        Object removeLastReturnValue = temp.getNext().getValue();
        temp.setNext(null);
        size--;
    } // end removeLast

    //to string
    public String toString (){
        ListNode temp = head;
        out = "";
        int num =1;
        while (temp.getNext() != null) {
            out+= num +":" + temp.getNext();
            System.out.println(" ");
            num++;
            temp.getNext();
        }
        return out;
    } // end toString

}
