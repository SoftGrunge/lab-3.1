public class Main {
    //Efimov DA
    public static void main(String[] args) {
        List list = new List();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.addStart(4);
        list.addStart(5);
        list.addStart(6);
        list.addStart(7);
        list.addStart(8);
        System.out.println(list.isEmpty());
        list.getStart();
        list.removeAt(1);
        list.removeAt(5);
        list.removeStart();

        list.removeEnd();
        list.getEnd();
        System.out.println("list size: " + list.Size());
        list.printAll();


    }
}
