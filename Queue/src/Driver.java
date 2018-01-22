public class Driver {
    public static void main(String[] args) {

        Queue n = new Queue();

        for (int x = 0; x < 10; x++){
            n.offer(x);
        }

        for (int x = 0; x < 10; x++){
            System.out.println(n.remove() + " removed");
            System.out.println(n.size() + " size");
        }

    }
}
