import java.util.Scanner;

public class linkedlist {
    Node head = null;
    Node tail= null;
    public class Node{
         int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }
    }
    public void insertAtHead(int data) {
            Node t = new Node(data);
            if(head==null){
                head=t;
                tail = t;
            }
            else{
                t.next = head;
                head=t;

            }
        }
    public void insertAtEnd(int data) {
        Node t = new Node(data);
        if(head==null){
            head=t;
            tail=t;
        }
        else{
            tail.next=t;
            tail=t;
        }
    }
    public void insertBefore(int data,int position) {
        Node t = new Node(data);
        Node itr=head;
        if(itr.data==position){
            t.next=itr;
            head=t;
            return;
        }
        while(itr.next!=null  &&   itr.next.data!=position  ){
            itr=itr.next;
        }
        if(itr.next==null){
            System.out.println("element not found...");
            return;
        }
        t.next=itr.next;
        itr.next=t;
    }
    public void insertAfter(int data,int postion) {
        Node t = new Node(data);
        Node itr=head;
        while(itr.data!=postion){
            itr=itr.next;
        }
        t.next=itr.next;
        itr.next=t;
    }

    public void printlist() {
        Node itr =head;
        while(itr!=null){
            if(itr.next==null){
                System.out.println(itr.data);
                return;
            }
            System.out.print(itr.data+"->");
            itr=itr.next;
            
        }
    }
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        Scanner sc = new Scanner(System.in);
        boolean temp=true;
        while(temp){
        // System.out.print("enter the element to be inserted-->");
        // int data = sc.nextInt();
        System.out.println("-----------------Select an option to insert the element at a position------------------");
        System.out.println("1.Insert at starting node");
        System.out.println("2.Insert before a particular node");
        System.out.println("3.Insert after a particular node");
        System.out.println("4.Insert after last node");
        System.out.println("5.print the complete list");
        System.out.println("6.stop the process");
        System.out.println("enter the option and press enter<-/  :");
        
        int i = sc.nextInt();
        

        
        switch (i) {
            case 1:
                System.out.print("enter the element to be inserted-->");
                int d1 = sc.nextInt();
                ll.insertAtHead(d1);
                
                break;
            case 2:
                System.out.print("enter the element to be inserted-->");
                int d2 = sc.nextInt();
                System.out.println("enter the preceding position element ");
                int position = sc.nextInt();
                ll.insertBefore(d2, position);
                break;
            case 3:
                System.out.print("enter the element to be inserted-->");
                int d3 = sc.nextInt();
                 System.out.println("enter the succeding position element ");
                int pos = sc.nextInt();
                ll.insertAfter(d3, pos);
                break;
            case 4:
                System.out.print("enter the element to be inserted-->");
                int d4 = sc.nextInt();
                ll.insertAtEnd(d4);
                break;
            case 5:
                ll.printlist();
                break;
            case 6:
                temp=false;
                break;
        
            default:
                System.out.println("enter the correct value..");
                break;
        }
    }
        sc.close();
    }
}
