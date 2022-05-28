package JAVA_DataStructure;

import java.util.*;
class BinSearchTree{
    public static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.setData(data);
            setLeft(null);
            setRight(null);
        }

        public int getData(){
            return this.data;
        }
        public Node getLeft(){
            return left;
        }
        public Node getRight(){
            return right;
        }
        public void setData(int data){
            this.data = data;
        }
        public void setLeft(Node left){
            this.left = left;
        }
        public void setRight(Node right){
            this.right = right;
        }
    }

    public static class binarySearchTree{
        public Node root;

        public binarySearchTree(){
            root = null;
        }
        public void insert(int data){
            Node newNode = new Node(data);
            if(root == null){
                root = newNode;
                return;
            }
            if(root.data == newNode.data) return;

            Node currentNode = root;
            Node parentNode = null;

            while(true){
                parentNode = currentNode;
                if(data < currentNode.getData()){
                    currentNode = currentNode.getLeft();
                    if(currentNode == null){
                        parentNode.setLeft(newNode);
                        return;
                    }else if(currentNode.getData() == newNode.getData()) return;
                }else{
                    currentNode = currentNode.getRight();
                    if(currentNode == null){
                        parentNode.setRight(newNode);
                        return;
                    }else if(currentNode.getData() == newNode.getData()) return;
                }
            }
        }

        public boolean contains(int data){
            Node currentNode = root;
            while(currentNode != null){
                if(currentNode.data == data) return true;
                else if(currentNode.data > data) currentNode = currentNode.getLeft();
                else if(currentNode.data < data) currentNode = currentNode.getRight();
            }
            return false;
        }

        public ArrayList<Integer> preorderTree(Node root, int depth, ArrayList<Integer> list){
            if(root != null){
                list.add(root.getData());
                preorderTree(root.getLeft(),depth+1,list);
                preorderTree(root.getRight(),depth+1,list);
            }
            return list;
        }

        public ArrayList<Integer> inorderTree(Node root, int depth, ArrayList<Integer> list){
            if(root != null){
                inorderTree(root.getLeft(),depth+1,list);
                list.add(root.getData());
                inorderTree(root.getRight(),depth+1,list);
            }
            return list;
        }
        public ArrayList<Integer> postorderTree(Node root, int depth, ArrayList<Integer> list){
            if(root != null){
                postorderTree(root.getLeft(),depth+1,list);
                postorderTree(root.getRight(),depth+1,list);
                list.add(root.getData());
            }
            return list;
        }
    }
}

public class BinarySearchTreeExample {
    public static void main(String[] args) {
        BinSearchTree.binarySearchTree tree = new BinSearchTree.binarySearchTree();
        tree.root = new BinSearchTree.Node(10);
        tree.insert(7);
        tree.insert(8);
        tree.insert(12);
        tree.insert(11);
        System.out.println(tree.root.getLeft().getRight().getData());
        System.out.println(tree.root.getRight().getLeft().getData());

        ArrayList<Integer> test = tree.preorderTree(tree.root,0,new ArrayList<>());
        System.out.println(test.toString());
    }
}
