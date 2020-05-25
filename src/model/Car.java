package model;

public abstract class Car extends Vehicle{

    public String brand;
   /* {
        id = count++;
        System.out.print("Car brand? ");
        Scanner sc = new Scanner(System.in);
        brand = sc.next();
    }*/

    public Car(String brand) {
        super(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}
