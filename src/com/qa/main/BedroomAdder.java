package com.qa.main;

public class BedroomAdder {
    public void addBedroom(IsPenthouse penthouse) {
        penthouse.setSquareFootage(penthouse.getSquareFootage() + 40);
        penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
    }
}