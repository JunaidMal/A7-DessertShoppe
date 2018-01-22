/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class Cookie extends DessertItem {

    // Pivate variables for number of cookies and the price of cookies by the dozen
    private int numCookies;
    private double pricePerDozen;

    // constructor for updating name, number of cookies, and price per dozen
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        numCookies = number;
        pricePerDozen = pricePer12;
    }

    public String toString() {
        // Printing first line featuring # of cookies and converted price per dozen from cents to dollars
        String printCookie = numCookies + " @ $" + DessertShoppe.cents2dollarsAndCents((int) pricePerDozen) + " /dz.";
        // new line with name
        printCookie += "\n";
        printCookie += super.getName();
        // converting total price of the cookies being bought from cents to dollars
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        // creating spaces between name and price
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - holder.length() - super.getName().length(); i++) {
            printCookie += " ";
        }
        // adding the cost of the cookies then returning it
        printCookie += holder;

        return printCookie;
    }

    @Override
    public int getCost() {
        // calculating cost of cookies being bought by finding and multiplying cost of 1 cookie by # of cookies
        return (int) Math.round(pricePerDozen / 12 * numCookies);
    }

}
