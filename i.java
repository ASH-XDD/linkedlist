package linkedlist_package;
class i extends LinkedList{
 
    
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
tail=node;
tail.next=null;
       
    }
    public static void main(String[] args) {
       
     i obj = new i();
    obj.insertatstart(3);
    obj.insertatstart(3);
    obj.insertatstart(3);
    obj.insertatstart(2);
    obj.insertatstart(2);
    obj.insertatstart(1);
    obj.print();
    obj.getduplicates();
    obj.print();
   


    

    }
}
