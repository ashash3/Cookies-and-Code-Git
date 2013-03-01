public class SearchAlgos {
	// Basic DFS algorithm

	// Assuming we have the following Node class definition
	public Node {
		ArrayList<Node> children;
		public boolean visited;
		
		public ArrayList<Node> getChildren() {
			return children;
		}
	}

	// Recursive implementation
	public void dfs_recursive(Node n) {
		System.out.println(n);
		n.visited = true;
		if (n.getChildren().length() == 0) return;
		for (Node c : n.getChildren()) {
			if (!c.visited) dfs(c);
		}
	}

	// Stack implementation
	public void dfs_iterative(Node root) {
	}
}