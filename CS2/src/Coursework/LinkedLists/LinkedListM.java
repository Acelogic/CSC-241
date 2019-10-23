package Coursework.LinkedLists;

import java.util.List;

public class LinkedListM<E>   {

    private Node<E> head;
    private Node<E> next;
    private int size;

    public LinkedListM() {
        this.size = 0;
    }


    public void add(E element) {
        if (head == null) {
            head = new Node<>(null, element, next);
            size++;
        } else if (next == null) {
            next = new Node<>(head, element, null);
            size++;
        } else {
            next.add(element);
        }
    }


    public E get(int index) {
        return null;
    }



    public int size() {
        return size;
    }

    private static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.value = element;
            this.next = next;
            this.prev = prev;
        }

        public E getValue() {
            return value;
        }

        public void add(E element) {
            if (next == null) {
                next = new Node<>(prev, element, next);
            } else {
                next.add(element);

            }
        }
    }
}

