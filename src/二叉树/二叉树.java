package 二叉树;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Date: 2018/8/23 11:37
 * Description:
 *
 * @author yanlin
 */
public class 二叉树 {



	public TreeNode root;//根节点

	/**
	 * 递归前序遍历
	 *
	 * @param root
	 */
	public static void preOrderNode(TreeNode root) {
		if (root == null) {
			return;
		} else {
			System.out.print(root.data + " ");
			preOrderNode(root.leftChild);
			preOrderNode(root.rightChild);
		}
	}

	/**
	 * 非递归前序遍历
	 * @param root
	 * 利用压栈的思想，先将树的右子节点压入栈，再将树的左子节点压入栈中，
	 */
	public static void preOrderNodeNotRec(TreeNode root) {
		if (root == null) {
			return;
		} else {
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while (!stack.isEmpty()){
				System.out.print(stack.pop().data + " ");
				if (root.rightChild!=null) {
				    stack.push(root.rightChild);
				} 
				if (root.leftChild!=null) {
				    stack.push(root.leftChild);
				} 
			}
		}
		System.out.println();
	}

	public  void insert(int value){

		//将需要的插入的值封装为一个二叉树的节点
		TreeNode newNode = new TreeNode(value);
		//创建一个引用，引用当前节点
		TreeNode current = root;
		//创建一个引用，引用父节点
		TreeNode parent ;
		//如果根节点为空，将新节点设为根节点
		if(root == null){
			root = newNode;
			return;
		}
		while (true){
			//父节点指向当前节点
			parent = current;
			if (current.data > value){
				current = current.leftChild;
				if(current == null){
					parent.leftChild = newNode;
					return;
				}
			}else {
				current = current.rightChild;
				if(current == null){
					parent.rightChild = newNode;
					return;
				}
			}
		}

	}

	public static void main(String[] args) {
		二叉树 tree = new 二叉树();
		tree.insert(10);
		tree.insert(20);
		tree.insert(14);
		tree.insert(15);
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		preOrderNode(tree.root);
		System.out.println();
		preOrderNodeNotRec(tree.root);

	}
}
