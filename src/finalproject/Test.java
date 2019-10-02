package finalproject;

import finalproject.CreditCard;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("BelCard", 1111, 7500);
        CreditCard card2 = new CreditCard("MasterCard", 4321, 300);
        CreditCard card3 = new CreditCard("Visa", 5858, 100000);

        Set<CreditCard> creditCards = new HashSet<CreditCard>();
        creditCards.add(card1);
        creditCards.add(card2);
        creditCards.add(card3);

//        new ATM(creditCards).run();
    }
}
