package lab5.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //Add phan tu vao danh sach
        list.add("A");
        list.add("B");
        list.add("F");
        list.add("G");
        list.add("H");
        list.addLast("Z"); //them pt cuoi cung vao mang
        list.add(1, "A2");
        list.addFirst("A1"); //Them pt vao vi tri dau tien
        System.out.println("Original content of list: " + list);
        //Loai bo di 1 pt trong DS theo ten
        list.remove("B");
        //Loai bo di 1pt theo vi tri
        list.remove(2);
        System.out.println("Content of list after deletion: " +list);

        //Loai bi theo vi tri dau va cuoi ban ghi
        list.removeFirst();
        list.removeLast();
        System.out.println("Content of list after delete first and last" +list);

        //Lay ra pt co chi so = 3
        Object list1= list.get(3);

        //Thiet lap lai vi tri cua ptu co chi so = 3
        list.set(1,(String) list1 + " updated");
        System.out.println("List after update: " +list);


    }
}
