package machine;

import java.util.Scanner;

enum  State {
    CHOOSINGANACTION,
    CHOOSINGCOFFEE,
    FILLINGMACHINE;
}

public class CoffeeMachine {
    public static int qtTotalOfWater = 400;
    public static int qtTotalOfMilk = 540;
    public static int qtTotalOfCoffeeBeans = 120;
    public static int qtTotalOfCups = 9;
    public static long qtTotalOfMoney = 550;
    public static State state = State.CHOOSINGANACTION;
    static Scanner scanner = new Scanner(System.in);

    public static void chooseAction(State state, String action) {
            switch (state) {
                case CHOOSINGANACTION:
                    mainMenu(action);
                    break;
                case CHOOSINGCOFFEE:
                    actionBuy(action);
                    break;
                case FILLINGMACHINE:
                    actionFill();
                    break;
                default:
                    System.out.println("Error!");
            }

    }

    public static boolean checkWater(int water) {
        return qtTotalOfWater < water ? false : true;
    }

    public static boolean checkMilk(int milk) {
        return qtTotalOfMilk < milk ? false : true;
    }

    public static boolean checkCoffee(int coffee) {
        return qtTotalOfCoffeeBeans < coffee ? false : true;
    }

    public static boolean checkCups(int cups) {
        return qtTotalOfCups < cups ? false : true;
    }

    public static void makeCoffee(int water, int milk, int coffee, int cups, int money) {
        if (checkWater(water)) {
            if (checkMilk(milk)) {
                if (checkCoffee(coffee)) {
                    if (checkCups(cups)) {
                        System.out.println("I have enough resources, making you a coffee!");
                        qtTotalOfWater -= water;
                        qtTotalOfMilk -= milk;
                        qtTotalOfCoffeeBeans -= coffee;
                        qtTotalOfCups -= cups;
                        qtTotalOfMoney += money;
                    } else {
                        System.out.println("Sorry, not enough cups!");
                    }
                } else {
                    System.out.println("Sorry, not enough coffee!");
                }
            } else {
                System.out.println("Sorry, not enough milk!");
            }
        } else {
            System.out.println("Sorry, not enough water!");
        }
    }

    public static void makeEspresso() {
        makeCoffee(250, 0, 16, 1, 4);
    }

    public static void makeLatte() {
        makeCoffee(350, 75, 20, 1, 7);
    }

    public static void makeCappuccino() {
        makeCoffee(200, 100, 12, 1, 6);
    }

    public static void actionBuy(String action) {
        //System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 0 - back - to main menu:");
        switch (action) {
            case "1":
                makeEspresso();
                state = State.CHOOSINGANACTION;
                chooseAction(state, scanner.next());
                break;
            case "2":
                makeLatte();
                state = State.CHOOSINGANACTION;
                chooseAction(state, scanner.next());
                break;
            case "3":
                makeCappuccino();
                state = State.CHOOSINGANACTION;
                chooseAction(state, scanner.next());
                break;
            case "back":
                state = State.CHOOSINGANACTION;
                chooseAction(state, scanner.next());
                break;
            default:
                System.out.println("Unknown action!");
                state = State.CHOOSINGANACTION;
                chooseAction(state, scanner.next());
                break;
        }
    }

    public static void actionFill() {
        qtTotalOfWater += scanner.nextInt();
        qtTotalOfMilk += scanner.nextInt();
        qtTotalOfCoffeeBeans += scanner.nextInt();
        qtTotalOfCups += scanner.nextInt();
    }

    public static void actionTake() {
        System.out.println("I gave you " + qtTotalOfMoney);
        qtTotalOfMoney = 0;
    }

    public static void showStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(qtTotalOfWater + " of water");
        System.out.println(qtTotalOfMilk + " of milk");
        System.out.println(qtTotalOfCoffeeBeans + " of coffee beans");
        System.out.println(qtTotalOfCups + " of disposable cups");
        System.out.println(qtTotalOfMoney + " of money");
    }

    public static void mainMenu(String action) {
            //System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (action) {
                case "buy":
                    state = State.CHOOSINGCOFFEE;
                    chooseAction(state, scanner.next());
                    break;
                case "fill":
                    actionFill();
                    state =State.CHOOSINGANACTION;
                    chooseAction(state, scanner.next());
                    break;
                case "take":
                    actionTake();
                    state =State.CHOOSINGANACTION;
                    chooseAction(state, scanner.next());
                    break;
                case "remaining":
                    showStatus();
                    state =State.CHOOSINGANACTION;
                    chooseAction(state, scanner.next());
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Unknown action");
                    break;
            }


    }
    public static void main(String[] args) {
        String action = scanner.nextLine();
        chooseAction(state, action);
    }
}
