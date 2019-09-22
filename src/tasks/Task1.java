package tasks;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("1)");
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 7 == 0)
                System.out.print(i + " ");


        System.out.println("Sub1");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 ^ i % 5 == 0)
                System.out.print(i + " ");
        }

        System.out.println("Sub2");
        for (int i = 1; i <= 100; i++) {
            if (i / 10 % 2 == 1)
                if (i % 3 == 0 ^ i % 5 == 0)
                    System.out.print(i + " ");
        }

    }
}
