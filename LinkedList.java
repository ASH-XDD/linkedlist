package linkedlist_package;
class LinkedList{
Node head;
Node tail;
int size;
    class Node{

        int data;
        Node next;
        Node(int d){
        
            this.data=d;
        }
        Node(int d,Node next){
            this.data=d;
            this.next=next;
        }
    }
    public void insertatstart(int data){
        Node node=new Node(data);
           node.next=head;
           head=node;
          if(tail==null){
             
            tail=head;
                        }
                        size++;
                       
    }

    public void insertatend(int data){
if(tail==null){
    insertatstart(data);
}
       Node node=new Node(data);
       tail.next=node;
       tail=node;
       size++;
}

    public void insertatindex(int data,int index){

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
            }
            Node node= new Node(data, temp.next);
            temp.next=node;
            size++;
    }
    public void deleteatstart(){
        if(head==null){
            System.out.println("null");
        }
        System.out.println("deleted item : " + head.data);
        head=head.next;
        size--;
    }
    public void deleteatend(){
 
}
public Node get(int index){

Node node=head;
for (int i = 0; i < index; i++) {
    node=node.next;   
}
return node;
}

public void deleteatend(int index){
if(size<=1){
    deleteatstart();
    return;
}
    Node node=get(size-2);
    tail=node;
    node.next=null;
    size--;
}

public void deleteatindex(int index){
    if(size<=1){
        deleteatstart();
        
    }if(index==size){
        deleteatend();
    }

    Node node=get(index-1);
    node.next=node.next.next;

}

public void getduplicates(){
    
    Node node=head;

       while(node.next!=null){
        if(node.next.data==node.data){
            node.next=node.next.next;
            size--;
        }                    
        else{
            node=node.next;
    
        }
    }
}
        

    public void print(){
         Node temp=head;
         while(temp!=null){
                        System.out.print(temp.data + " -> ");

            temp=temp.next;
    }
    System.out.println("null");
        System.out.println("size : " + size);

}
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insertatstart(1);
        ll.insertatstart(5);
        ll.insertatstart(7);
        ll.insertatindex(2, 2);
        ll.insertatend(23);
        ll.insertatend(23);
        ll.print();
        ll.getduplicates();
        ll.print();
    }
}