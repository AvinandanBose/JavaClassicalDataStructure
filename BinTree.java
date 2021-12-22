package com.company;

import java.util.Scanner;

public class BinTree {
    static Scanner sc = null;
    BinTree left, right;
    int data;
    public BinTree(int data){
        this.data =data;
    }
    static BinTree createTree(){
        BinTree root=null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new BinTree(data);
        System.out.println("Enter left for"+data);
        root.left = createTree();
        System.out.println("Enter right for"+data);
        root.right = createTree();
        return root;
    }
    static void inOrder(BinTree root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(BinTree root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(BinTree root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[]args){
        sc = new Scanner(System.in);
        BinTree node = createTree();
        inOrder(node);
        System.out.println();
        preOrder(node);
        System.out.println();
        postOrder(node);
    }

}
