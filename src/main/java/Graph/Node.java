package Graph;

import java.util.HashMap;
import java.util.Objects;

public class Node {
    private String sigl;
    private HashMap<Node, Integer> neighbours;

    public Node(String sigl) {
        this.sigl = sigl;
    }

    public Node(String sigl, HashMap<Node, Integer> neighbours) {
        this.sigl = sigl;
        this.neighbours = neighbours;
    }

    public String getSigl() {
        return sigl;
    }

    public void setSigl(String sigl) {
        this.sigl = sigl;
    }

    public HashMap<Node, Integer> getNeighbours() {
        return neighbours;
    }

    public void setNeighbour(Node neighbour, int val) {
        if (this.neighbours == null) {
            this.neighbours = new HashMap<Node, Integer>();
        }

        this.neighbours.put(neighbour, val);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(sigl, node.sigl) && Objects.equals(neighbours, node.neighbours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigl);
    }

    @Override
    public String toString() {
        return "Node{" +
                "sigl='" + sigl + '\'' +
                '}';
    }
}
