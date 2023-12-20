package org.decorator;

public class Exector {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");

      Sandwich mySandwich=new Cheese(new Beef(new BasicSandwich()));

        System.out.println("Description = "+mySandwich.getDescription());
        System.out.println("Cost = "+mySandwich.getCost());


    }
}