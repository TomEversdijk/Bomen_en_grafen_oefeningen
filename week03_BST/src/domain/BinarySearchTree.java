package domain;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}
			
	public BinarySearchTree(E data) {
		super(data);
	}

	public boolean lookup(E data) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public boolean addNode(E data) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public boolean removeNode(E data){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchSmallest(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchGreatest(){
		throw new UnsupportedOperationException("Not yet implemented");
	}
}


