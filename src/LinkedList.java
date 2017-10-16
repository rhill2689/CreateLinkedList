public class LinkedList {

    Node head;

    //constructor
    public LinkedList(){
        head = null;
    }

    //constructor
    public LinkedList(int x){
        head.val = x;
        head.next = null;
    }

    //constructor
    public LinkedList(int x, Node n){
        head.val = x;
        head.next = n;
    }

    //insert to front of list
    public void insert(int x){
        Node n = new Node(x);
        n.next = head;
        head = n;
    }

    //clear list
    public void clear(){
        head = null;
    }

    //return size of list
    public int size(){
        int count = 0;
        Node curr = head;
        while(curr != null){//traverse through list
            count++;
            curr = curr.next;
        }
        return count;
    }

    //print list
    public void print(){
        Node curr = head;
        while(curr != null){//traverse through list
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    //check if list is empty
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

    //check if list contains element
    public boolean contains(int x){
        Node curr = head;
        while(curr != null){
            if(curr.val == x)//if value found return true
                return true;
            curr = curr.next;
        }
        return false;
    }

    //remove specific element
    public void remove(int x){
        if(isEmpty()){//empty list
            System.out.println("The list is empty.");
            return;
        }

        Node prev = head;
        if(contains(x)){
            if(prev.val == x){ //if first element contains x
                head = prev.next;
                prev.next = null;
            }
            else if(prev.val != x){
                Node curr = head.next;
                while(curr.val != x){//go through list until x is found
                    curr = curr.next;
                    prev = prev.next;
                }//remove x
                prev.next = curr.next;
                curr.next = null;
            }
        }
        else //list does not contain x
            System.out.println("The list does not contain " + x);
    }

    public int sum(){
        if(isEmpty()){//empty list
            System.out.println("The list is empty.");
            return 0;
        }

        Node curr = head;
        int total = 0;
        while(curr != null){//traverse and add each value
            total += curr.val;
            curr = curr.next;
        }
        return total;
    }

    public void insertInOrder(int x){
        Node n = new Node(x);
        if(isEmpty()){//nothing in list
            head = n;
            n.next = null;
            return;
        }

        //insert to head
        //value being inserted is less than what is already there
        Node prev = head;
        if(prev.val > n.val){
            n.next = prev;
            head = n;
            return;
        }

        //one value in list and its less than value being inserted
        if(prev.val < n.val && prev.next == null){
            prev.next = n;
            n.next = null;
            return;
        }

        Node curr = head.next;
        //insert between first and second nodes
        if(prev.val < n.val && curr.val > n.val){
            prev.next = n;
            n.next = curr;
            return;
        }

        if(curr.val < n.val){
            while(curr.val < x && curr.next != null){//find where curr.val not < x
                curr = curr.next;
                prev = prev.next;
            }

            if(curr.val < x && curr.next == null){//insert last element
                curr.next = n;
                curr = curr.next;
                prev = prev.next;
            }
            else{//insert in list
                prev.next = n;
                n.next = curr;
            }
        }
    }

    //sort the list
    public void sortList(){
        LinkedList sort = new LinkedList();

        //user insertInOrder to sort the list
        Node curr = this.head;
        while(curr != null){
            sort.insertInOrder(curr.val);
            curr = curr.next;
        }
        sort.print();
    }
}
