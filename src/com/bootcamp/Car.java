package com.bootcamp;

public class Car extends Vehicle {
    // instance variables hidden for outsiders
    private String brand;
    private String color;
    private String description;
    private double price;
    private boolean emissionTest;

    // default constructor
    public Car() {
    }

    // overloaded constructor
    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;

    }

    // methods
    public void acceleration(){
        System.out.println("The " + getColor() + " " + getBrand() + " is accelerating.");
    }

    public void speed(int mph){
        System.out.println("The " + getColor() + " " + getBrand() + " is going " + mph + " mph");
    }

    // overriding parent's method
    public void start() {
        System.out.println("The " + getColor() + " " + getBrand() + " is starting");
    }
    // overriding parent's method
    public void stop() {
        System.out.println("The " + getColor() + " " + getBrand() + " is stopped");

    }

    public void takeover(String str1, String str2){         // str1 is "blue Jetta" & str2 is "red Porsche"
        System.out.println("The " + str1 + " just passed the " + str2);
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void getEmissionTest() {
        if(emissionTest){
            System.out.println("The " + getColor() + " " + getBrand() + " has stopped to have its emissions checked");
            System.out.println("The " + getColor() + " " + getBrand() + " passes its emission test");

        }

    }

    public void setEmission(boolean emissionTest) {
        this.emissionTest = emissionTest;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // overriding Object() method toString()
    @Override
    public String toString() {
        return "Brand:              " + getBrand() + "\n" +
                "Description:        " + getDescription() + "\n" +
                "Color:              " + getColor() + "\n" +
                "Price:              " + String.format("$%(,.2f", getPrice()) + "\n";
    }
}
