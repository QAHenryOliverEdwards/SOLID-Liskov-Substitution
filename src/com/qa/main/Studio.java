package com.qa.main;

public class Studio extends IsStudio{

    private int squareFootage;
    private int numberOfBedrooms = 0;

    public Studio(){
        this.numberOfBedrooms = 0;
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
