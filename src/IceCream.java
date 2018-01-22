/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class IceCream extends DessertItem {

    // private variable for cost
    private int cost;

    // updating name and cost variables
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public String toString() {
        // printing name
        String printIceCream = super.getName();
        // converting total cost from cents to dollars
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        // creating spaces between the name and price in reference to the width of the receipt
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - holder.length() - super.getName().length(); i++) {
            printIceCream += " ";
        }
        // adding the total cost to the receipt
        printIceCream += holder;

        return printIceCream;

    }

    @Override
    public int getCost() {
        // returning cost
        return cost;
    }

}
