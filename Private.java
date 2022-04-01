package com.company;

public class Private <E>{
    E data;
    Private<E> next;

    public Private(E object){ data = object; this.next = null;
    }

    public E getData(){
        return data;
    }
}