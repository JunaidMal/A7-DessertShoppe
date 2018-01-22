/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class Sundae extends DessertItem {

    // private variables for name, cost, topping name and cost
    private String name;
    private int icCost;
    private String toppingName;
    private int toppingCost;

    // updating name, cost, topping name and cost variables
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        this.name = icName;
        this.icCost = icCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    @Override
    public String toString() {
        // printing name of topping with sundae name on a new line
        String printSundae = toppingName + " Sundae with \n";
        printSundae += name;
        // converting total cost from cents to dollars
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        // creating spaces between name and cost in reference to receipt width
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - holder.length() - name.length(); i++) {
            printSundae += " ";
        }

        // adding cost to the string then returning it
        printSundae += holder;
        return printSundae;
    }

    public int getCost() {
        // adding topping cost to the cost of the sundae
        return toppingCost + icCost;
    }

}
