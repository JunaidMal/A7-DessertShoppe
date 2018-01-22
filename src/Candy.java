/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class Candy extends DessertItem {

    // private variables for weight and price per pound
    private double weight;
    private int pricePerLbs;

    // constructor for updating name, weight, and price per lbs variables
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    // Printing out the format of the receipt for the candy
    @Override
    public String toString() {

        // First line of the candy part of the reciept
        // Price per lbs converted to dollar format
        String printCandy = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";
        // new line with name of the candy
        printCandy += "\n";
        printCandy += super.getName();
        // converting total cost of candy from cents to dollars
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        // printing the spaces between the price and name
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - holder.length() - super.getName().length(); i++) {
            printCandy += " ";
        }
        // adding the converted price
        printCandy += holder;
        // candy reciept part returned
        return printCandy;
    }

    // calculating the cost of the candy bought
    @Override
    public int getCost() {
        // calculating cost of candy bought 
        int cost = (int) Math.round(weight * pricePerLbs);
        return cost;
    }
}
