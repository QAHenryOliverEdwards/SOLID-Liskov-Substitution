package com.qa.main;

public abstract class Apartment {
    private int squareFootage;
    private int numberOfBedrooms;

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}
