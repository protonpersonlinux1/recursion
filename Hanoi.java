public class Hanoi {
    public static void toh(int n, char t1, char t2, char t3){
        if (n == 0){
            return;
        }

        toh(n - 1, t1, t3, t2);

        System.out.println("Object moved " + n + " from Tower" + t1 + " to Tower" + t2);

        toh(n - 1, t3, t2, t1);
    }

    public static void main(String[] args){
        int n = 3;

        char t1 = 1;

        char t2 = 2;
        char t3 = 3;
        toh(n, t1, t2, t3);
    }
}

