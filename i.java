package linkedlist_package;
class i extends LinkedList{
  Node head;
  Node tail;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
         Node(int d,Node next){
            this.data=d;
            this.next=next;
        }
    }
        public void getduplicates(){
             
            Node node=head;

               while(node.next!=null){
                if(node.next.data==node.data){
                    node.next=node.next.next;
                    System.out.println("1");
                }                    
             else{
                    node=node.next;
                }
        }

       
    }
    public static void main(String[] args) {
       
     i obj = new i();
      obj.insertatstart(2);
        obj.insertatstart(2);
            obj.insertatstart(3);
    obj.getduplicates();
   


    

    }
}
