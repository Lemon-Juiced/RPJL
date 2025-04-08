package dev.lemonjuice.RPJL;

/**
 * A class representing a JSON tree structure.
 */
public class JSONTree {
    private String name;
    private String value;
    private JSONTree[] children;

    /**
     * Constructor for JSONTree.
     *
     * @param name The name of the node.
     * @param value The value of the node.
     * @param children The children of the node (if there are any).
     */
    public JSONTree(String name, String value, JSONTree[] children) {
        this.name = name;
        this.value = value;
        this.children = children;
    }

    /**
     * Get the name of the node.
     *
     * @return The name of the node.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value of the node.
     *
     * @return The value of the node.
     */
    public String getValue() {
        return value;
    }

    /**
     * Get the children of the node.
     *
     * @return The children of the node.
     */
    public JSONTree[] getChildren() {
        return children;
    }

    /**
     * Set the name of the node.
     *
     * @param name The name of the node.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the value of the node.
     *
     * @param value The value of the node.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Set the children of the node.
     *
     * @param children The children of the node.
     */
    public void setChildren(JSONTree[] children) {
        this.children = children;
    }

    /**
     * Add a child to the node.
     *
     * @param child The child to add.
     */
    public void addChild(JSONTree child) {
        if (children == null) {
            children = new JSONTree[1];
            children[0] = child;
        } else {
            JSONTree[] newChildren = new JSONTree[children.length + 1];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            newChildren[children.length] = child;
            children = newChildren;
        }
    }

    /**
     * Remove a child from the node.
     *
     * @param child The child to remove.
     */
    public void removeChild(JSONTree child) {
        if (children == null) {
            return;
        }
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                JSONTree[] newChildren = new JSONTree[children.length - 1];
                System.arraycopy(children, 0, newChildren, 0, i);
                System.arraycopy(children, i + 1, newChildren, i, children.length - i - 1);
                children = newChildren;
                return;
            }
        }
    }

    /**
     * Clear the children of the node.
     */
    public void clearChildren() {
        children = null;
    }

    /**
     * Check if the node has children.
     *
     * @return True if the node has children, false otherwise.
     */
    public boolean hasChildren() {
        return children != null && children.length > 0;
    }

    /**
     * Convert the JSONTree to a string representation.
     *
     * @return The string representation of the JSONTree.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"name\": \"").append(name).append("\", ");
        sb.append("\"value\": \"").append(value).append("\", ");
        sb.append("\"children\": [");
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                sb.append(children[i].toString());
                if (i < children.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

}
