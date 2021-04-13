package liste;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private ListNode<T> head;
    private int listSize;

    public void addFirst(T element){
        ListNode<T> newNode = new ListNode<T>(element, head);
        head = newNode;
        listSize++;
    }

    ListNode<T> getHead(){
        return head;
    }

    public void addLast(T element){
        ListNode<T> newNode = new ListNode<T>(element, null);
        if(head == null){
            head = newNode;
            listSize++;
        }
        else{
            ListNode<T> lastNode = getLastNode();
            lastNode.setNext(newNode);
            listSize++;
        }
    }

    public void add(int index, T element){

    }

    public T getFirst() {
        if(head != null){
            return head.getElement();
        }

        throw new RuntimeException("List is empty!");
    }

    public T getLast() {
        if(head != null){
            ListNode<T> lastNode = getLastNode();
            return lastNode.getElement();
        }
        throw new RuntimeException("List is empty!");
    }

    public Object get(int index){
       if(index < 0 || index >= listSize){
           throw new IndexOutOfBoundsException("Index out of range!");
       }
       int i = 0;
       ListNode<T> currentNode = head;

       while(currentNode != null){
           if (index == i){
               return currentNode.getElement();
           }
           currentNode = currentNode.getNext();
           i++;
       }

       return null;
    }

    public int indexOf(T element){
        return 0;
    }

    public void removeFirst(){
        if(head != null){
            head = head.getNext();
            listSize--;
        }else{
            throw new RuntimeException("List is empty!");
        }

    }

    public void removeLast(){
        if(head != null){
            ListNode<T> previousNode = null;
            ListNode<T> currentNode = head;

            while (currentNode.getNext() != null){
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }

            if(previousNode != null){
                previousNode.setNext(null);
            }else{
                head = null;
            }

            listSize--;
        }
        else{
            throw new RuntimeException("List is empty!");
        }

    }

    public void remove(int index){

    }

    public void remove(T element){

    }

    public int size(){
        return listSize;
    }

    private ListNode<T> getLastNode() {
        ListNode<T> currentNode = head;

        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
}
