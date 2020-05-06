package com.bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    static Scanner keyboard = new Scanner(System.in);
    static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        // welcome user and prompt
        welcome();

    }   // end of main() method

    public static void welcome(){

        String input1;
        String response;
            // welcome user and ask for available options
            System.out.println("\nWelcome! what do you like to do? ");
            System.out.println("Enter (1) to ADD Car: ");
            System.out.println("Enter (2) to DISPLAY all Cars: ");
            System.out.print("Enter (anyother key) to EXIT: ");

            input1 = keyboard.nextLine();
            response = input1;

            // if user choose to add car
            if (response.equals("1")) {
                addCar();
                // enter 2 to display list of cars in teh arraylist
            } else if(response.equals("2")) {
                displayAll();
            }
            else{
                // if anyother key than 1 and 2 exit
            System.out.println("Thank you!");

            }
    }

    public static void addCar() {
        // prompt user to enter car characteristics
        // brand name
        System.out.print("\nEnter Car Brand: ");
        String input = keyboard.nextLine();
        String brandName = input;

        // car color
        System.out.print("Enter Car Color: ");
        input = keyboard.nextLine();
        String carColor = input;

        // car description
        System.out.print("Enter Car Description: ");
        input = keyboard.nextLine();
        String carDescription = input;


        // prompt if emission test is done
        System.out.print("Enter Price: ");
        double price = keyboard.nextDouble();
        keyboard.nextLine();

        Car car = new Car();
        car.setBrand(brandName);
        car.setColor(carColor);
        car.setDescription(carDescription);
        car.setPrice(price);

        // add to the arraylist of cars
        cars.add(car);
        System.out.println("Car Successfully added!");
        welcome();
    }
    public static void displayAll(){
        for (Car c : cars) {
            System.out.println(c.toString());
        }
        welcome();
    }
}
