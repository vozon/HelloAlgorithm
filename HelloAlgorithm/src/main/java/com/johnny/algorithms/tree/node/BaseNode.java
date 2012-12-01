package com.johnny.algorithms.tree.node;

public class BaseNode {
	private BaseNode parent;
	private BaseNode leftChild;
	private BaseNode rightChild;
	private String decription;

	public BaseNode getParent() {
		return parent;
	}

	public void setParent(BaseNode parent) {
		this.parent = parent;
	}

	public BaseNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BaseNode leftChild) {
		this.leftChild = leftChild;
	}

	public BaseNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BaseNode rightChild) {
		this.rightChild = rightChild;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}
}