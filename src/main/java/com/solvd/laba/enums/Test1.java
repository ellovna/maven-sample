package com.solvd.laba.enums;

class Test1 {
    SizeEnum pizzaSize;

    public Test1(SizeEnum pizzaSize) {
        this.pizzaSize = pizzaSize;
    }


    public void orderPizza() {
        switch (pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza");
                break;
            case LARGE:
                System.out.println("I ordered a large pizza");
                break;
            case EXTRALARGE:
                System.out.println("I ordered a extraLarge pizza");
                break;
            default:
                System.out.println("I don't know which one to order");
                break;
        }
    }
}
