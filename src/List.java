public class List {
    private LinkList head;
    private LinkList tail;
    public List(){
        head=null;
        tail=null;
    }
    public boolean isEmpty(){
      int i =0;
      LinkList current = head;
      while(current!=null){
          i++;
          current=current.next;
      }if(i>0)
          return false;
      else return true;
    }
    public void addStart(int data){
        LinkList list = new LinkList(data);
        if(head==null){
         head=tail=list;
         return;
        }else list.next=head;
        head=list;
    }
    public void addEnd(int data){
        LinkList list = new LinkList(data);
        if(tail==null){
        head=tail=list;
        return;
        }else
            tail.next = list;
            tail=tail.next;


            }
        public void removeStart(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        if(head!=null){
            System.out.println("Removed element: "+ head.data);
        head=head.next;
            }
            else
            System.out.println("List is empty!");
        }
        public void removeEnd(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        LinkList current = head;
        LinkList prev = head;
            for(int i =0;i<Size()-1; i++){
                prev=current;
                current=current.next;
            }prev.next=null;
            System.out.println("Element: "+ current.data+" removed");
        }

        public void getStart(){
        if(head!=null)
            System.out.println("First element: " + head.data);
        else
            System.out.println("List is empty!");
        }
        public void getEnd() {

            LinkList current = head;
             int i = 0;
            if (tail != null){
               while(current!=null){
                  i = current.data;
                   current=current.next;

               }
            System.out.println("Last element: " + i);}
            else System.out.println("List is empty!");

        }
        public void find(int data) {

            if (isEmpty()){
                System.out.println("List is empty!");
            return;
        }if(head.data==data){
                System.out.println("This is first element!");
                return;
            }
            else {
                LinkList current = head;
                int i = 1;
                boolean flag = false;
                while (current !=null ) {
                    if (current.data == data) {
                        flag = true;
                        break;
                    }
                    i++;
                    current = current.next;
                }if(flag)
                    System.out.println("Element exist at position: " + i);
                else System.out.println("Element not exists" );


            }
        }
        public void removeAt(int data){
        LinkList current = head;
        LinkList prev = head;
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
            if(head.data==data){
                head=head.next;
                System.out.println("Element: " + data+" removed");
            return;}if(tail.data==data) {
                removeEnd();

            }else{
        while(current.next!=null){
            while(current.data!=data) {

                prev = current;
                current = current.next;

            }
                prev.next=current.next;
                break;


        }
            System.out.println("Element: "+ current.data + " removed");
        }}
        public int Size(){
        if(isEmpty()){

          return 0;
        }
        LinkList current = head;
        int i =1;
        while(current.next!=null){
            i++;
            current=current.next;
        }return i;
        }
    public void printAll(){
        String tmp = " ";
        LinkList list = head;

        while(list!=null){
            System.out.print(list.data+tmp);
            list=list.next;
        }
    }
}
