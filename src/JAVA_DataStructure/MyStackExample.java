package JAVA_DataStructure;

import java.util.ArrayList;

class ArrayListStack{
    private ArrayList<Integer> listStack = new ArrayList<>();

    public void push(Integer data){
        listStack.add(data);
    }

    public Integer pop(){
        if(listStack.isEmpty())
            return null;
        return listStack.remove(listStack.size()-1);
    }

    public int size(){
        return listStack.size();
    }

    public Integer peek(){
        if(listStack.isEmpty())
            return null;
        return listStack.get(listStack.size()-1);
    }

    public String show(){
        return listStack.toString();
    }

    public void clear(){
        listStack.clear();
    }
}

public class MyStackExample {
    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.show());

        stack.pop();
        stack.pop();

        System.out.println(stack.show());
    }
}
