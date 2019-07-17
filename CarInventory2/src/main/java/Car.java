//this class should lists variables, constructors, getters and setters.
public class Car {
    //to create variables
    protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected int miles;

    //empty constructor
    public Car() {
    }

    //created constructor
    public Car(String make, String model, int year, String color, int miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }

    // getter and setter
    public String getMake() {
        return this.make;
    }

    public void setMake(String newMake) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public int getMiles() {
        return this.miles;
    }

    public void setMiles(int newMiles) {
        this.miles = newMiles;
    }
}


//}
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

//public class CarController {
//
//
//   private List<CarClass> carList;
//
//   public CarController() {
//       carList = new ArrayList<>();
//       carList.add(new CarClass("Chevrolet", "Chevelle SS", 1968, "blue", 187000));
//       carList.add(new CarClass("Subaru", "Outback", 2015, "maroon", 69000));
//       carList.add(new CarClass("Chevrolet", "Silverado", 2002, "blue", 200000));
//       carList.add(new CarClass("Nissan", "Altima", 2005, "silver", 203000));
//       carList.add(new CarClass("Ford", "Mustang", 1985, "red", 185000));
//
//       carList.remove(3);
//
//       System.out.println(carList);
//
//       Scanner scan = new Scanner(System.in);
//
//       System.out.println("Enter max mileage accepted: ");
//
//       int miles = Scanner.nextInt();
//       Boolean isUnder = 100000 < miles;
//
//       if (miles > 0 && miles < 100000)
//           System.out.println("Here are your results: ");
//       else System.out.println("No cars match your results");
//
//       //I know this if else is not correct; work on getting user input and printing comparison values from list
////Also, find out why nextInt doesn't work here. Do I need to call int miles on this page to use it?
//
//
//   }
//}public class CarClass {
//
//
//   //create variables
//   private String make;
//   private String model;
//   private int year;
//   private String color;
//   private int miles;
//
//
//   //create empty set
//   public CarClass() { }
//
//
//   //create array string
//   public CarClass(String make, String model, int year, String color, int miles) {
//       this.make = make;
//       this.model = model;
//       this.year=year;
//       this.color=color;
//       this.miles = miles;
//   }
//
//   //getters and setters
//
//   public String getMake() {
//       return this.make;
//   }
//
//   public void setMake(String make) {
//       this.make = make;
//   }
//
//   public String getModel() {
//       return this.model = model;
//   }
//
//   public void setModel(String model) {
//       this.model = model;
//   }
//
//   public int getYear() {
//       return this.year = year;
//   }
//
//   public void setYear(int year) {
//       this.year= year;
//   }
//
//   public int getMiles() {
//       return this.miles;
//   }
//
//   public void setMiles(int miles) {
//       this.miles = miles;
//   }
//}
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//public class CarController {
//
//
//   private List<CarClass> carList;
//
//   public CarController() {
//       carList = new ArrayList<>();
//       carList.add(new CarClass("Chevrolet", "Chevelle SS", 1968, "blue", 187000));
//       carList.add(new CarClass("Subaru", "Outback", 2015, "maroon", 69000));
//       carList.add(new CarClass("Chevrolet", "Silverado", 2002, "blue", 200000));
//       carList.add(new CarClass("Nissan", "Altima", 2005, "silver", 203000));
//       carList.add(new CarClass("Ford", "Mustang", 1985, "red", 185000));
//
//       carList.remove(3);
//
//       System.out.println(carList);
//
//       Scanner scan = new Scanner(System.in);
//
//       System.out.println("Enter max mileage accepted: ");
//
//       int miles = Scanner.nextInt();
//       Boolean isUnder = 100000 < miles;
//
//       if (miles > 0 && miles < 100000)
//           System.out.println("Here are your results: ");
//       else System.out.println("No cars match your results");
//
//       //I know this if else is not correct; work on getting user input and printing comparison values from list
////Also, find out why nextInt doesn't work here. Do I need to call int miles on this page to use it?
//
//
//   }
//}