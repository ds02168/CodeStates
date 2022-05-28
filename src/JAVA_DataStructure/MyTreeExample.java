package JAVA_DataStructure;
import java.util.*;

class MyTree{
    private String value;
    private ArrayList<MyTree> children;

    public MyTree(){
        this.value = null;
        this.children = null;
    }
    public MyTree(String data){
        this.value = data;
        this.children = null;
    }
    public void setValue(String data){
        this.value =data;
    }
    public String getValue(){
        return this.value;
    }
    public void addChildNode(MyTree node){
        if(children == null)children = new ArrayList<MyTree>();
        children.add(node);
    }
    public void removeChildNode(MyTree node){
        if(children != null) children.remove(node);
    }
    public ArrayList<MyTree> getChildrenNode(){
        return children;
    }
    public boolean contains(String data){
        if(value != null && value.equals(data)) return true;

        if(children != null){
            for(int i=0;i<children.size();i++)
                return children.get(i).contains(data);
        }
        return false;
    }
}

public class MyTreeExample {
    public static void main(String[] args) {
        MyTree rootNode = new MyTree(null);

        for(int i=0;i<=4;i++)
            rootNode.addChildNode(new MyTree(String.valueOf(i)));
        System.out.println(rootNode);;
        System.out.println(rootNode.contains("0"));
        System.out.println(rootNode.contains("1"));
        System.out.println(rootNode.contains("5"));
    }
}
