package Graph;

import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return node;
        
        Map<Node, Node> map = new HashMap<Node, Node>();
        cloneHelper(node, map);
        return map.get(node);
    }

    private void cloneHelper(Node node, Map<Node, Node> map) {
        Node newNode = null;
        if (map.containsKey(node)) {
            newNode = map.get(node);
            return;
        } else {
            newNode = new Node(node.val);
            map.put(node, newNode);
        }

        for (Node neighbor: node.neighbors) {
            cloneHelper(neighbor, map);
            newNode.neighbors.add(map.get(neighbor));
        }
    }
}