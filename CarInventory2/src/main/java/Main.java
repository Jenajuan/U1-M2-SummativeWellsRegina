import java.util.ArrayList;     //this class gets the user input and adds it
import java.util.Scanner;      // to the car list and runs the functions.
import java.util.List;

//keeps up with car inventory.
public class Main {
    public static void main(String[] args) {
        char quit = 'Y';
        String action;
        Car car = new Car();

        ArrayList<Car> carList = new ArrayList<>();//CREATE ARRAY LIST
        Scanner scanner = new Scanner(System.in); //SCANNER INPUT


        do {                           //DO WHILE LOOP  createS string action
            System.out.println("What would you like to do?"); //input request action
            action = scanner.next();                           // switch cases
            switch (action) {
                case "add": //Requests input from user to add cars to inventory until the user
                    //has no more records ro add:
                    do {
                        System.out.println("Car Make");
                        car.make = scanner.next();

                        System.out.println("Car Model");
                        car.model = scanner.next();

                        System.out.println("Car Year");
                        car.year = scanner.nextInt();

                        System.out.println("Car Color");
                        car.color = scanner.next();

                        System.out.println("Car Miles");
                        car.miles = scanner.nextInt();

                        //To add user input to car list
                        carList.add(new Car(car.make, car.model, car.year, car.color, car.miles));

                        //will ask user if they have another entry.
                        System.out.println("Want to add another car?");

                        String word = scanner.next();//creates a variable to read user input.
                        word = word.toUpperCase();//makes letter uppercase if user enters lowercase
                        quit = word.charAt(0); //Takes input and saves it to quit to check if loop will continue.
                    }
                    while (quit == 'Y');
                    break;
                case "delete":
                    System.out.println("Please enter the Make to delete");
                    String deleteMake = scanner.next();
                    System.out.println("Please enter the Model to delete");
                    String deleteModel = scanner.next();
                    System.out.println("Please enter the Year to delete");
                    String deleteYear = scanner.next();
                    System.out.println("Please enter the Color to delete");
                    String deleteColor = scanner.next();
                    System.out.println("Please enter the Miles to delete");
                    String deleteMiles = scanner.next();

                    //will delete a car from the inventory
                    //will go through the entire inventory
                    for (int x = 0; x < carList.size(); x++) {
                        if (carList.get(x).getMake().equals(deleteMake) &&
                                carList.get(x).getModel().equals(deleteModel)) {
                            carList.remove(x);   //delete car
                        }
                    }

                    break;
                case "list":
                    if (carList.size() > 0) { // Will print entire list if list is not empty
                        for (int i = 0; i < carList.size(); i++) {
                            System.out.print(carList.get(i).getMake() + "");
                            System.out.print(carList.get(i).getModel() + "");
                            System.out.print(carList.get(i).getYear() + "");
                            System.out.print(carList.get(i).getColor() + "");
                            System.out.print(carList.get(i).getMiles() + "");
                        }
                    } else {
                        System.out.println("The car Inventory is Empty!");
                    }
                    break;
                case "search":
                    System.out.println("Please Enter the Search Type:");
                    String type = scanner.next();
                    switch (type) {
                        case "make":
                            System.out.println("Car Make: ");
                            String searchMake = scanner.next();

                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getMake().equals(searchMake)) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }
                            break;
                        case "model":
                            System.out.println("Car Model: ");
                            String searchModel = scanner.next();

                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getModel().equals(searchModel)) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }
                            break;
                        case "year":
                            System.out.println("Car Year: ");
                            int searchYear = scanner.nextInt();
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getYear() == searchYear) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;
                        case "color":
                            System.out.println("Car Color: ");
                            String searchColor = scanner.next();
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getColor().equals(searchColor)) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;
                        case "miles":
                            System.out.println("Please Enter the Maximum Number of Miles: ");
                            int maxMiles = scanner.nextInt();

                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getMiles() <= maxMiles) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;
                        default:
                            break;

                    }
            }
        } while (!"quit".equals(action));
    }
}






