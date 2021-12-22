package com.company;

import java.util.Scanner;

public class BinTree2<T> {
    static Scanner sc2 = null;
    BinTree2<T> left, right;
    int data;

    public  BinTree2(int data){
        this.data =data;
    }
    static  BinTree2  createTree(){
        BinTree2  root=null;
        System.out.println("Enter data:");
        int data = sc2.nextInt();
        if(data==-1){
            return null;
        }
        root = new BinTree2<>(data);
        System.out.println("Enter left for"+data);
        root.left = createTree();
        System.out.println("Enter right for"+data);
        root.right = createTree();
        return root;
    }
    static void inOrder(BinTree2 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
     static void preOrder(BinTree2 root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
     static void postOrder(BinTree2 root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[]args){
        sc2 = new Scanner(System.in);
        BinTree2 node = createTree();
        inOrder(node);
        System.out.println();
        preOrder(node);
        System.out.println();
        postOrder(node);
    }

}

