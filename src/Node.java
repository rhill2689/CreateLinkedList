public class Node {

    int val;
    Node next;


    //constructor
    public Node(){
        val = 0;
        next = null;
    }

    //constructor
    public Node(int x){
        val = x;
        next = null;
    }

    //constructor
    public Node(int x, Node n){
        val = x;
        next = n;
    }



}
