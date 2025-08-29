import java.util.*;
class Node{
    String name;
    String d;
    String number;
    Node next;
    Node(String name,String d,String number)
    {
        this.name=name;
        this.d=d;
        this.number=number;
        this.next=null;
    }
}
class Student{
    Node head=null,end=null;
    void insert(String name,String d,String number){
        Node newn=new Node(name,d,number);
        if(head==null){
            head=newn;
            end =newn;
        }
        else{
            end.next=newn;
            end=newn;
        }

    }
    void display(){
        Node i=head;
        while(i!=null){
            System.out.println(i.name+" "+i.d+" "+i.number);
            i=i.next;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);int f=0;
         Student st=new Student();
        while(f==0){
        System.out.println("Enter Name:");
        String name=s.nextLine();

        System.out.println("Enter dept:");
        String d=s.nextLine();
        System.out.println("Enter phone num:");
        String number=s.nextLine();
        st.insert(name,d,number);
        st.display();
        System.out.println("Enter zero to continue else 1");
        int a=s.nextInt();f=a;s.nextLine();
        }

    }
}
