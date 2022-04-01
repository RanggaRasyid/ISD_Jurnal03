package com.company;

import java.util.NoSuchElementException;

public class Linked<E> {
    private Private<E> firstPrivate;
    private Private<E> lastPrivate;
    private String name;

    public Linked() {
        this("Linked list");
    }

    public Linked(String listName) {
        name = listName;
        firstPrivate = lastPrivate = null;
    }
    // Insert At Front
    public void insertAtFront(E insertItem) {
        Private newPrivate = new Private(insertItem);

        if (isEmpty()) {
            firstPrivate = lastPrivate = new Private<E>(insertItem);
        } else { // firstPrivate refers to new Private
            newPrivate.next = firstPrivate;
            firstPrivate = newPrivate;
        }
    }
    // Insert At Back
    public void insertAtBack(E insertItem) {
        Private newPrivate = new Private(insertItem);

        if (isEmpty()) {
            firstPrivate = lastPrivate = new Private<E>(insertItem);
        } else {
            lastPrivate.next = newPrivate;
            lastPrivate = newPrivate;
        }
    }
    //Remove from Back
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastPrivate.data;

        if (firstPrivate == null) {
            firstPrivate = lastPrivate = null;
        } else {
            Private<E> current = firstPrivate;
            while (current.next != lastPrivate) {
                current = current.next;
            }
            lastPrivate = current;
            current.next = null;
        }
        return removedItem;
    }
    //Remove from Front
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = firstPrivate.data;

        if(firstPrivate != null){
            Private temp = new Private(firstPrivate);
            firstPrivate = firstPrivate.next;
            temp = null;
        }
        return removedItem;
    }

    private boolean isEmpty() {
        return firstPrivate == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: %n", name);
        Private<E> current = firstPrivate;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
    }
}