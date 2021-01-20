package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Penthouse penthouse = new Penthouse();
        System.out.println(penthouse.getNumberOfBedrooms());
        System.out.println(penthouse.getSquareFootage());

        BedroomAdder bedroomAdder = new BedroomAdder();

        bedroomAdder.addBedroom(penthouse);

        System.out.println(penthouse.getNumberOfBedrooms());
        System.out.println(penthouse.getSquareFootage());
    }
}
