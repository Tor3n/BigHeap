package Graph;

import java.util.*;

public class Djikstra {
    ClosedArrayList<ClosedLinkedList<Node>> expStack;
    PriorityQueue<ClosedLinkedList<Node>> pq;

    public static void main(String[] args) {
        Djikstra dji = new Djikstra();

        dji.inputVarGlob(dji);

        //dji.inputVar1(dji);

        System.out.println(dji.expStack);
    }

    public void inputVarGlob(Djikstra dj){
        Node start = new Node("start");
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node fin = new Node("fin");

        start.setNeighbour(a,2);
        start.setNeighbour(b,5);
        a.setNeighbour(d,7);
        a.setNeighbour(b,8);
        b.setNeighbour(d, 2);
        b.setNeighbour(c,4);
        c.setNeighbour(fin,3);
        c.setNeighbour(d,6);
        d.setNeighbour(fin, 1);

        dj.findAWay(start);
    }

    public void inputVar1(Djikstra dj){
        Node start = new Node("start");
        Node a = new Node("a");
        Node b = new Node("b");
        Node fin = new Node("fin");

        start.setNeighbour(a,2);
        start.setNeighbour(b,1);
        a.setNeighbour(fin,7);
        b.setNeighbour(fin,3);

        dj.findAWay(start);
    }


    public void findAWay(Node strt){

        expStack = new ClosedArrayList<>();
        ClosedLinkedList<Node> startList = new ClosedLinkedList<>();
        startList.add(strt);
        expStack.add(startList);

        while(expStack.isOpen()){

            boolean globalClosed = true;
            for(ClosedLinkedList list : expStack){
                if(list.isOpen()){
                    globalClosed = false;
                    break;
                }
            }

            if(globalClosed==true){
                expStack.setOpen(false);
            }

            Iterator<ClosedLinkedList<Node>> it = expStack.iterator();
            ArrayList<ClosedLinkedList<Node>> toAddStack = new ArrayList<>();

            insideExp: while (it.hasNext()){
                ClosedLinkedList<Node> internalList = it.next();
                HashMap<Node, Integer> ngr = internalList.getLast().getNeighbours();
                if(ngr!=null&&!ngr.isEmpty()){

                    if(ngr.size()==1){
                        for(Map.Entry e : ngr.entrySet()){
                            Node n = (Node) e.getKey();
                            internalList.add(n);
                        }
                    } else {
                        // cloning
                        ClosedLinkedList<Node> temp = (ClosedLinkedList<Graph.Node>) internalList.clone();

                        //removing internalList
                        it.remove();
                        for(Map.Entry e : ngr.entrySet()){
                            ClosedLinkedList<Node> tempInside = (ClosedLinkedList<Node>) temp.clone();
                            Node n = (Node) e.getKey();
                            tempInside.add(n);
                            toAddStack.add(tempInside);
                        }
                    }

                } else {
                    internalList.setOpen(false);
                }

                if(toAddStack!=null&&!toAddStack.isEmpty()){
                    break insideExp;
                }

            }

            expStack.addAll(toAddStack);

        }


    }
}


class Node{
    private String sigl;
    private HashMap<Node, Integer> neighbours;

    public Node(String sigl){
        this.sigl = sigl;
    }

    public Node(String sigl, HashMap<Node, Integer> neighbours){
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
        if(this.neighbours==null){
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
        return Objects.hash(sigl, neighbours);
    }

    @Override
    public String toString() {
        return "Node{" +
                "sigl='" + sigl + '\'' +
                '}';
    }
}

class ClosedArrayList<Node> extends ArrayList<Node>{
    private boolean isOpen = true;

    public boolean isOpen(){
        return isOpen;
    }

    public void setOpen(boolean isOpen){
        this.isOpen=isOpen;
    }


}

class ClosedLinkedList<Node> extends LinkedList<Node>{
    private boolean isOpen = true;
    private Integer length;

    public ClosedLinkedList() {
        super();
        length=new Integer(0);
    }

    public ClosedLinkedList(ClosedLinkedList<Node> internalList) {
        super(internalList);
        this.isOpen=internalList.isOpen();
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void setOpen(boolean isOpen){
        this.isOpen=isOpen;
    }

    /*@Override
    public boolean add(Node t) {
        boolean res = super.add(t);
        Graph.Node nn = (Graph.Node) getLast();
        if(length==null){

        }else{
            HashMap<Graph.Node, Integer> ne = nn.getNeighbours();
            for(Map.Entry<Graph.Node, Integer> e : ne.entrySet()){
                if(e.getKey().equals((Graph.Node) t)){
                    length+=e.getValue();
                }
            }
        }
        return res;
    }

    @Override
    public Object clone() {
        Object o = super.clone();
        ClosedLinkedList<Node> cl = (ClosedLinkedList<Node>) o;
        cl.length=this.length;

        return (Object) cl;
    }*/

}
