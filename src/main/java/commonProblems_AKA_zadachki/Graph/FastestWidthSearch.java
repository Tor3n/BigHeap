package Graph;

import java.util.*;

class DequesComparator implements Comparator<ClosedArrayDeque<Node>> {
    @Override
    public int compare(ClosedArrayDeque<Node> o1, ClosedArrayDeque<Node> o2) {
        if(o1.getLength() < o2.getLength()){
            return -1;
        } else if(o1.getLength() > o2.getLength()){
            return 1;
        }
        return 0;
    }
}

public class FastestWidthSearch {
    ClosedPriorityQueue<ClosedArrayDeque<Node>> expStack;


    public static void main(String[] args) {
        FastestWidthSearch dji = new FastestWidthSearch();

        dji.inputVarGlob(dji);
        //dji.inputVar1(dji);

        //System.out.println(dji.expStack.stream().max(new DequesComparator()));

        int bb = dji.expStack.size();

        for(int i = 0; i<bb;i++){
            ClosedArrayDeque<Node> a = dji.expStack.poll();
            System.out.println(a.toString()+ " len: "+a.getLength());
        }
    }

    public void inputVarGlob(FastestWidthSearch dj){
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

    public void inputVar1(FastestWidthSearch dj){
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
        Comparator cmp = new DequesComparator();
        expStack = new ClosedPriorityQueue<ClosedArrayDeque<Node>>(cmp);
        ClosedArrayDeque<Node> startList = new ClosedArrayDeque<Node>();

        startList.add(strt);
        expStack.add(startList);

        while(expStack.isOpen()){

            boolean globalClosed = true;
            for(ClosedArrayDeque list : expStack){
                if(list.isOpen()){
                    globalClosed = false;
                    break;
                }
            }

            if(globalClosed==true){
                expStack.setOpen(false);
            }

            Iterator<ClosedArrayDeque<Node>> it = expStack.iterator();
            ArrayList<ClosedArrayDeque<Node>> toAddStack = new ArrayList<>();

            insideExp: while (it.hasNext()){
                ClosedArrayDeque<Node> internalListITinstance = it.next();
                HashMap<Node, Integer> ngr = internalListITinstance.peekLast().getNeighbours();
                if(ngr!=null&&!ngr.isEmpty()){

                    if(ngr.size()==1){
                        for(Map.Entry e : ngr.entrySet()){
                            Node n = (Node) e.getKey();
                            internalListITinstance.add(n);
                        }
                    } else {
                        // cloning
                        ClosedArrayDeque<Node> temp = (ClosedArrayDeque<Node>) internalListITinstance.clone();
                        temp.setLength(internalListITinstance.getLength());

                        //removing internalListITinstance
                        it.remove();
                        for(Map.Entry e : ngr.entrySet()){
                            ClosedArrayDeque<Node> tempInside = (ClosedArrayDeque<Node>) temp.clone();
                            tempInside.setLength(internalListITinstance.getLength());
                            Node n = (Node) e.getKey();
                            tempInside.add(n);
                            toAddStack.add(tempInside);
                        }
                    }

                } else {
                    internalListITinstance.setOpen(false);
                }

                if(toAddStack!=null&&!toAddStack.isEmpty()){
                    break insideExp;
                }

            }

            expStack.addAll(toAddStack);
            //debug
            /*Iterator<ClosedArrayDeque<Node>> it2 = expStack.iterator();
            while (it2.hasNext()){
                ClosedArrayDeque<Node> o = it2.next();
                System.out.println(o.toString()+ " len: "+o.getLength());
            }

            System.out.println("****************"); */
        }


    }
}


/**
 *
 * Main storage that selfDetermines the fastest rout
 *
 * @param <Elem>
 */

class ClosedPriorityQueue<Elem> extends PriorityQueue<Elem>{
    private boolean isOpen = true;

    public ClosedPriorityQueue(Comparator comparator) {
        super(comparator);
        this.isOpen = isOpen;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void setOpen(boolean isOpen){
        this.isOpen=isOpen;
    }

}


/**
 *
 * Chain of nodes that represents a path
 *
 * @param <Node>
 */

class ClosedArrayDeque<Node> extends ArrayDeque<Node>{
    private boolean isOpen = true;
    private Integer length;

    public ClosedArrayDeque() {
        super();
        this.length=new Integer(0);
    }

    @Override
    public boolean add(Node newNode) {
        Node currentLastNode =  this.peekLast();
        if (currentLastNode!=null){
            HashMap<Graph.Node, Integer> neighb = ( (Graph.Node) currentLastNode).getNeighbours();

            for (Map.Entry node : neighb.entrySet()){
                Graph.Node n = (Graph.Node) node.getKey();
                Graph.Node nn = (Graph.Node) newNode;


            }

            boolean b = neighb.containsKey((Graph.Node) newNode);

            length+=neighb.get(newNode);
        }

        super.add(newNode);

        return true;
    }

    @Override
    public ClosedArrayDeque<Node> clone() {
        ClosedArrayDeque<Node> cad = (ClosedArrayDeque<Node>) super.clone();
        cad.setLength(this.length);
        return cad;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void setOpen(boolean isOpen){
        this.isOpen=isOpen;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
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
