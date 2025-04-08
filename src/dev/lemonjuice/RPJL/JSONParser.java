package dev.lemonjuice.RPJL;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A class representing a JSON parser using the JSONTree structure.
 */
public class JSONParser {
    private JSONTree root;

    /**
     * Constructor for JSONParser.
     *
     * @param root The root of the JSON tree.
     */
    public JSONParser(JSONTree root) {
        this.root = root;
    }

    /**
     * Get the root of the JSON tree.
     *
     * @return The root of the JSON tree.
     */
    public JSONTree getRoot() {
        return root;
    }

    /**
     * Set the root of the JSON tree.
     *
     * @param root The root of the JSON tree.
     */
    public void setRoot(JSONTree root) {
        this.root = root;
    }

    /**
     * Perform a depth-first traversal of the JSON tree.
     *
     * @param node The current node to traverse.
     */
    public void depthFirstTraversal(JSONTree node) {
        if (node == null) {
            return;
        }

        // Process the current node
        System.out.println("Name: " + node.getName() + ", Value: " + node.getValue());

        // Recursively traverse the children
        if (node.getChildren() != null) {
            for (JSONTree child : node.getChildren()) {
                depthFirstTraversal(child);
            }
        }
    }

    /**
     * Perform a breadth-first traversal of the JSON tree.
     */
    public void breadthFirstTraversal() {
        if (root == null) {
            return;
        }

        Queue<JSONTree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            JSONTree current = queue.poll();

            // Process the current node
            System.out.println("Name: " + current.getName() + ", Value: " + current.getValue());

            // Add the children to the queue
            if (current.getChildren() != null) {
                for (JSONTree child : current.getChildren()) {
                    queue.add(child);
                }
            }
        }
    }

}
