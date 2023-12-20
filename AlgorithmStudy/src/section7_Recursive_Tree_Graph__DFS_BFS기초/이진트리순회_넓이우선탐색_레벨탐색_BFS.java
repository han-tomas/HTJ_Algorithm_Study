package section7_Recursive_Tree_Graph__DFS_BFS기초;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//	int data;
//	Node lt, rt;
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}


public class 이진트리순회_넓이우선탐색_레벨탐색_BFS {
	Node root;
	public void DFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		이진트리순회_넓이우선탐색_레벨탐색_BFS tree = new 이진트리순회_넓이우선탐색_레벨탐색_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}
