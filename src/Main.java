public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("World");
        System.out.println(list.get(0));
        System.out.println(list.size());

        list.remove(1);
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
    }

}

