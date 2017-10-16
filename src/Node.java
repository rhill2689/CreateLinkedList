public class Node {

    int val;
    Bicycle data;
    Node next;


    //constructor
    public Node(){
        val = 0;
        next = null;
        data = null;
    }

    //constructor
    public Node(int x){
        val = x;
        next = null;
        data = null;
    }

    //constructor
    public Node(int x, Node n){
        val = x;
        next = n;
        data = null;
    }


    //constructor
    public Node(int x, Bicycle bi, Node n){
        val = x;
        next = n;
        data = bi;
    }

    public Node(int x, Bicycle bi){
        val = x;
        data = bi;
    }



}
