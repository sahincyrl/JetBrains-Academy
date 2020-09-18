package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // coffe machine
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        // espresso
        int eWater = 250;
        int eBeans = 16;
        int eMoney = 4;

        // latte
        int lWater = 350;
        int lMilk = 75;
        int lBeans = 20;
        int lMoney = 7;

        // cappuccino
        int cWater = 200;
        int cMilk = 100;
        int cBeans = 12;
        int cMoney = 6;

        // the loop
        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String chose = scanner.next();

            switch (chose) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String b = scanner.next();

                    switch (b) {
                        case "1":
                            if (water - eWater < 0) System.out.println("Sorry, not enough water!\n");
                            else if (beans - eBeans < 0) System.out.println("Sorry, not enough beans!\n");
                            else if (cups <= 0) System.out.println("Sorry, not enough cup!\n");
                            else {
                                System.out.println("I have enough resources, making you a coffee!\n");

                                water -= eWater;
                                beans -= eBeans;
                                money += eMoney;
                                cups--;
                            }
                            break;
                        case "2":
                            if (water - lWater < 0) System.out.println("Sorry, not enough water!\n");
                            else if (milk - lMilk < 0) System.out.println("Sorry, not enough milk!\n");
                            else if (beans - lBeans < 0) System.out.println("Sorry, not enough beans!\n");
                            else if (cups <= 0) System.out.println("Sorry, not enough cup!\n");
                            else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= lWater;
                                milk -= lMilk;
                                beans -= lBeans;
                                money += lMoney;
                                cups--;
                            }
                            break;
                        case "3":
                            if (water - cWater < 0) System.out.println("Sorry, not enough water!\n");
                            else if (milk - cMilk < 0) System.out.println("Sorry, not enough milk!\n");
                            else if (beans - cBeans < 0) System.out.println("Sorry, not enough beans!\n");
                            else if (cups <= 0) System.out.println("Sorry, not enough cup!\n");
                            else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= cWater;
                                milk -= cMilk;
                                beans -= cBeans;
                                money += cMoney;
                                cups--;
                            }
                            break;
                        default:
                            break;
                    }

                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:\n");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("\nI gave you $" + money);
                    money = 0;
                    break;
                case "remaining":

                    if (money == 0) {
                        System.out.println("\nThe coffee machine has:\n" +
                                water + " of water\n" +
                                milk + " of milk\n" +
                                beans + " of coffee beans\n" +
                                cups + " of disposable cups\n" +
                                money + " of money\n");
                    } else {
                        System.out.println("\nThe coffee machine has:\n" +
                                water + " of water\n" +
                                milk + " of milk\n" +
                                beans + " of coffee beans\n" +
                                cups + " of disposable cups\n$" +
                                money + " of money\n");
                    }


                    break;
                case "exit":
                    System.exit(0);
                    break;
            }

        }

    }


}

