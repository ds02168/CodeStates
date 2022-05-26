package JAVA_DataStructure;

import java.util.ArrayList;

class ArrayQueue{
    private ArrayList<Integer> listQueue;

    ArrayQueue(int size){
        listQueue = new ArrayList<>(size);
    }
    public void offer(Integer data){
        listQueue.add(data);
    }

    public Integer poll(){
        if(listQueue.isEmpty())
            return null;
        return listQueue.remove(0);
    }

    public int size(){
        return listQueue.size();
    }

    public Integer peek(){
        if(listQueue.isEmpty())
            return null;
        return listQueue.get(0);
    }

    public String show(){
        return listQueue.toString();
    }

    public void clear(){
        listQueue.clear();
    }
}

public class MyQueueExample {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.show());

        queue.poll();
        queue.poll();

        System.out.println(queue.show());
    }
}
