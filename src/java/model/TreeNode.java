package java.model;

//红黑树用的结点
public class TreeNode {

	public final String RED="RED";
	private int value;
	private String color;
	private TreeNode left;
	private TreeNode right;
	private TreeNode parent;
	
	
	public TreeNode(int value){
		this.value=value;
		this.color=RED;
		this.left=null;
		this.right=null;
		this.parent=null;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public TreeNode getLeft() {
		return left;
	}


	public void setLeft(TreeNode left) {
		this.left = left;
	}


	public TreeNode getRight() {
		return right;
	}


	public void setRight(TreeNode right) {
		this.right = right;
	}


	public TreeNode getParent() {
		return parent;
	}


	public void setParent(TreeNode parent) {
		this.parent = parent;
	}




	public String getRED() {
		return RED;
	}


	@Override
	public String toString() {
//		String l,r;
//		if(left==null){
//			l="NIL";
//		}else{
//			l=String.valueOf(left.getValue());
//		}
//		if(right==null){
//			r="NIL";
//		}else{
//			r=String.valueOf(right.getValue());
//		}
		String p;
		if(parent==null){
			p="NIL";
		}else{
			p=String.valueOf(parent.getValue());
		}
		return "[ " + value +" " +color+" "+p+"]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeNode other = (TreeNode) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
	
	

}
