package l10_linkedlist;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList implements Collection {
    private Node head;

    @Override
    public int size() {
        Node current = head;
        int result = 0;
        while (current != null) {
            result++;
            current = current.getNext();
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            //TODO here
            if (current.getData() == o) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size()];
        Node current = head;
        int i = 0;
        while (current != null) {
            result[i] = current.getData();
            i++;
            current = current.getNext();
        }

        return result;
    }

    @Override
    public boolean add(Object o) {

        Node next = new Node(o, null);
        if (head == null) {
            head = next;
        } else {
            Node toAdd = head;
            while (toAdd.getNext() != null) {
                toAdd = toAdd.getNext();
            }
            toAdd.setNext(next);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object object : c) {
            add(object);
        }
        return true;
    }

    @Override
    public void clear() {
        head = null;
    }

    //TODO WTF
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += " " + current.getData();
            current = current.getNext();
        }
        return result;
    }

    //Not interested
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
