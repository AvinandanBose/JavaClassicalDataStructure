package com.company;

import java.util.Scanner;

public class HeightOfBinTree {
    static Scanner sc = null;
    HeightOfBinTree left, right;
    int data;
    public HeightOfBinTree(int data){

        this.data =data;
    }
    static HeightOfBinTree createTree(){
         HeightOfBinTree root=null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new HeightOfBinTree(data);
        System.out.println("Enter left for"+data);
        root.left = createTree();
        System.out.println("Enter right for"+data);
        root.right = createTree();
        return root;
    }
    static void inOrder(HeightOfBinTree root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(HeightOfBinTree root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(HeightOfBinTree root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    int height(HeightOfBinTree N){
        if (N==null){
            return 0;
        }
        else{
            int lDepth = height(N.left);
            int rDepth = height(N.right);
            if (lDepth > rDepth){
                return  lDepth+1;
            }
            else {
                return rDepth+1;
            }
        }
    }
    public static void main(String[]args){
        sc = new Scanner(System.in);
        HeightOfBinTree node = createTree();
        inOrder(node);
        System.out.println();
        preOrder(node);
        System.out.println();
        postOrder(node);
        System.out.println();
        System.out.println("Height of Binary Tree=" + node.height(node));
    }
}
