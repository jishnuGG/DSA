import java.util.LinkedList;

public class SinglyLinkedList {
        private static class Node{
            Node next ;
            int data;
            Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }
        private Node head;
        private Node tail;
        private int size;
    public SinglyLinkedList()
    {
        head=null;
        tail=null;
        size=0;
    }
    public void insertatEnd(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else{
            tail.next=new_node;
            tail=new_node;
        }
        size++;
    }
    public void insertatBegnning(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
        size++;
    }
     public void insertat(int data,int index)
     {
       if(index<0 || index>size)
       {
          System.out.println("index is not in the range");
           return;
       }
       if(index==0)
       {
        insertatBegnning(data);
        return;
       }
       else if(index==size)
       {
        insertatEnd(data);
        return;
       }
       else{
        Node new_Node=new Node(data);
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        new_Node.next=temp.next;
        temp.next=new_Node;
       }
     }
     public void printll()
     {
         Node temp=head;
         while(temp!=null)
         {
            System.out.print(temp.data+" ");
            temp=temp.next;
         }
     }
     public  int findthelength()
     {
         return size;
     }
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList(); 
            list.insertatEnd(5); 
            list.insertatBegnning(10);
            list.insertat(3, 1);
            System.out.println(list.findthelength());
            list.printll();
        }
    
}

