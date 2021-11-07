package ru.avalon.javapp.devj110.singlyLinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Односвязный список содержит значения:");
        LikedList list = new LikedList();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(6);
        list.addFromEnd(7);
        list.addFromEnd(8);
        list.addFromEnd(9);
        list.addFromEnd(7);
        list.addFirst(11);
        list.addFromEnd(12);
        list.addFromEnd(10);
        list.getFromStart();
    
        System.out.println(list.print());
  
        System.out.println("Первый элемент: " + list.getFromStart());
        System.out.println(list.print());
        
        System.out.println("Последний элемент: " + list.getFromEnd());
        
        System.out.println(list.print());
        
        System.out.println("Вывод первго элемента с удалением из списка: " + list.getRemoveFromStart());
        System.out.println(list.print());
        
        System.out.println("Вывод последнего элемента с удалением из списка: " + list.getRemoveFromEnd());
        System.out.println(list.print());
 
        
        System.out.println("Список содержит заданное число: " + list.find(6)); 
    
        System.out.println("Список пуст: " + list.isEmpty());
        
        System.out.println("Длина списка: " + list.length());
        
        System.out.println("Удаление элемента, содержащего заданное значение");
        System.out.println(list.print());
        list.remove(4);
        System.out.println(list.print());
        list.remove(5);
        System.out.println(list.print());
        list.remove(7);
        System.out.println(list.print());
                 
    
    }
    

}
