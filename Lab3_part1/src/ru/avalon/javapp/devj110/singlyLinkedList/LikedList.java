package ru.avalon.javapp.devj110.singlyLinkedList;
public class LikedList {

    private Element element1;

    public void addFirst(int value) {
        if (element1 != null) {
            Element newElement = new Element();
            newElement.child = element1;
            element1 = newElement;
            newElement.data = value;
        } else {
            element1 = new Element();
            element1.data = value;
        }
    }

    public void addFromEnd(int value) { //Добавление в конец   РАБОЧИЙ
        if (element1 != null){
            Element tempElement = element1;
            Element newElement = new Element();
        while (tempElement.child !=null){
               tempElement = tempElement.child;
        }
            tempElement.child = newElement;
            newElement.data = value;                                
           } else {
            element1 = new Element();
            element1.data = value;
        }
    }


    public int getFromStart (){ //Получение значения первого элемента    
        if (element1 == null){
        throw new NullPointerException("В списке нет элементов");
        }
        return element1.data;
                }
    
   

    public int getFromEnd (){ //Получение значения последнего элемента РАБОЧИЙ    
       Element tempElement = element1;        
        if (element1 == null){
        throw new NullPointerException("В списке нет элементов");
        }
       while (tempElement.child!=null){    
           tempElement = tempElement.child;
       }
       return tempElement.data;
    }

    
    public int getRemoveFromStart () {  //получение и удаление первого элемента
        if (element1 == null){
        throw new NullPointerException("В списке нет элементов");
        }
        Element tempElement = element1.child;
        Element firstElement = element1; // 
        element1=element1.child;
        while (tempElement!=null){    
        tempElement = tempElement.child;
        }
        
        return firstElement.data;
      
             
    }
    
 
        public int getRemoveFromEnd (){ //получение и удаление последнего элемента
        if (element1 == null){
        throw new NullPointerException("В списке нет элементов");
        }
        Element tempElement = element1;         
        while (tempElement.child!=null){
           tempElement = tempElement.child;
        }
        Element lastElement = tempElement;
       
            if (lastElement != element1 ){
            tempElement = element1;
            while (tempElement.child != lastElement)
                tempElement=tempElement.child;
            lastElement = tempElement;
            lastElement.child=null;
            }
            else{
                element1=null;
            }
        return tempElement.data;
       }
 
    
    public boolean find (int value){  //поиск значения, возвращает boolean
        Element tempElement = element1;
        while (tempElement.child!=null){
        if (tempElement.data == value){
        return true;}    
        tempElement = tempElement.child;
        }
        return false; 
    }  
    
//        Вторая реализация метода          
//        public boolean find (int value){  //поиск значения, возвращает boolean
//        Element tempElement = element1;
//        while (tempElement.child!=null){    
//        if (tempElement.data == value) break;
//            tempElement = tempElement.child;
//                }
//        return tempElement.data == value;  
//    }  
    
    
        public boolean isEmpty() {
        return element1 == null;
    }    
    
    
    
        
    public int length (){//размер списка
    int length = 0;
    Element tempElement = element1;
    if (isEmpty()){
        return length;
    }
    else{
        while (tempElement!=null)
            {tempElement = tempElement.child;
            length++;
            }
        }
    return length;        
    }
    
public void remove(int value){ //удаление эленмента, содержащего заданное значение

    Element tempElement = element1;
    Element prevElement = element1;
    if (element1 == null){
        return;
        }
    if (element1.data == value){
        element1=element1.child;}
    else {
            while (tempElement.child!=null){

                if (tempElement.data != value) {
                    prevElement = tempElement;   
                    tempElement = tempElement.child;
                                               }
                else {
                prevElement.child = tempElement.child;
                tempElement=tempElement.child;
                     }
                                            }
         }

}
 
      
    public String print (){
        String line = "";
        Element tempElement = element1;
        while (tempElement!=null){
            line = line + " " + tempElement.data;
            tempElement = tempElement.child;
        }
        return line;
    }
}
