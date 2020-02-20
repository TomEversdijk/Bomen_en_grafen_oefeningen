package ui;

import domain.BinaryTree;

public class BinaryTreeDriver {

	public static void main(String[] args) {
		BinaryTree<String> nodeD = new BinaryTree<>("D");
		BinaryTree<String> nodeF = new BinaryTree<>("F");
		BinaryTree<String> nodeB = new BinaryTree<>("B");
		BinaryTree<String> nodeH = new BinaryTree<>("H");
		
		// knoop A heeft links D en rechts F
		BinaryTree<String> nodeA = new BinaryTree<>("A",nodeD, nodeF);
		// knoop E heeft links H
		BinaryTree<String> nodeE = new BinaryTree<>("E",nodeH,null);
		// knoop G heeft links E en rechts B
		BinaryTree<String> nodeG = new BinaryTree<>("G",nodeE, nodeB);
		
		// boom heeft root C en heeft links A en rechts G
		BinaryTree<String> boom = new BinaryTree<>("C",nodeA, nodeG);
		boom.printPreorder();
	}

}
