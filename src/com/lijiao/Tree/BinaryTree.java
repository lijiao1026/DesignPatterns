package com.lijiao.Tree;



public class BinaryTree {

	public int data;
	public BinaryTree left;
	public BinaryTree right;
	
	public BinaryTree(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public void insert(BinaryTree tree,int a){
		if (tree.data>a) {//左子树
			if (tree.left!=null) {
				insert(tree.left, a);
			}else{
				tree.left=new BinaryTree(a);
			}
		}
		else{//右子树
			if (tree.right!=null) {
				insert(tree.right, a);
			}else{
				tree.right=new BinaryTree(a);
			}
		}
	}
	
	public void print(BinaryTree tree){
		if (tree!=null) {
			print(tree.left);
			System.out.print(tree.data+" ");
			print(tree.right);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a={66,77,72,60,37,67,69,54};
		BinaryTree binaryTree=new BinaryTree(a[0]);
		for(int i=1;i<a.length;i++){
			binaryTree.insert(binaryTree, a[i]);
		}
		System.out.println("左中右输出");
		binaryTree.print(binaryTree);
	}
}
