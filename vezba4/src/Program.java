import liste.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        for (int element: list) {
            System.out.println(element);
        }

        list.removeFirst();
        System.out.println("After remove first");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.removeLast();
        System.out.println("After remove last");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
