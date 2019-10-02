package finalproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;

public class ATM {

    private static Scanner in;
    private static float balance = 0;
    private static int anotherTransaction;
    private static Scanner inputCardScanner;

    private Set<CreditCard> creditCards;
    public ATM(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        transaction();
    }

    private static void transaction() {
        System.out.println("Вставьте карту");
        Scanner inputCardScanner = new Scanner(System.in);
        String inputCard = inputCardScanner.nextLine();
            {
                String languages;
                System.out.println("Выберите язык: ");
                System.out.println("1. Белорусский");
                System.out.println("2. English");
                System.out.println("3. Русский");
                System.out.println("4. Сменить ПИН-код");

                languages = in.nextLine();
            }

            int choice;
            System.out.println("Выберите операцию:");
            System.out.println("1. Выдача наличных");
            System.out.println("2. Пополнение счета");
            System.out.println("3. Сумма на счете");

            choice = in.nextInt();
            switch (choice) {
                case 1:
                    float amount;
                    System.out.println("Выберите сумму: ");
                    amount = in.nextFloat();
                    if (amount > balance || amount == 0) {
                        System.out.println("Неверная сумма\n\n");
                        anotherTransaction();
                    } else {
                        balance = balance - amount;
                        System.out.println("Ваша сумма составила " + amount + "\n" + "Ваш баланс составляет " + balance);
                        anotherTransaction();
                    }
                    break;

                case 2:
                    float deposit;
                    System.out.println("Выберите сумму: ");
                    deposit = in.nextFloat();
                    balance = deposit + balance;
                    System.out.println("Ваш депозит составляет " + deposit + "\n" + "Ваш остаток составляет " + balance);
                    anotherTransaction();
                    break;

                case 3:
                    System.out.println("Ваш остаток составляет " + balance);
                    anotherTransaction();
                    break;

                default:
                    System.out.println("Неверная операция:\n\n");
                    anotherTransaction();
                    break;
            }
        }

    private static void anotherTransaction() {
        System.out.println("Желаете ли вы выполнить другую операцию?\n\nНажмите 1 для выполнения другой операции\n\nНажмите 2 для выхода");
        anotherTransaction = in.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        } else if (anotherTransaction == 2) {
            System.out.println("Заберите вашу карту");
        } else {
            System.out.println("Неверная операция\n\n");
            anotherTransaction();
        }
    }
    }
