// Implement your own encapsulating classes

// Class Car will encapsulate all the variables and methods.

class Car {
    private String modelName;
    private String company;
    private String variant;
    private int builtYear;

    // getter method for modelName

    public String getModelName() {
        return modelName;
    }

    // setter method for modelName

    public void setModelName(String myModel) {
        this.modelName = myModel;
    }

    // getter method for company

    public String getCompany() {
        return company;
    }

    // setter method for company
    
    public void setCompany(String myCompany) {
        this.company = myCompany;
    }

    // getter method for variant

    public String getVariant() {
        return variant;
    }

    // setter method for variant
    
    public void setVariant(String myVariant) {
        this.variant = myVariant;
    }

    // getter method for builtYear

    public int getBuiltYear() {
        return builtYear;
    }

    // setter method for builtYear
    
    public void setBuiltYear(int myBuiltYear) {
        this.builtYear = myBuiltYear;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModelName("Safari");
        car.setCompany("Tata Motors");
        car.setVariant("Petrol");
        car.setBuiltYear(1998);

        System.out.println("Car model name: "+car.getModelName());
        System.out.println("Car company: "+car.getCompany());
        System.out.println("Car variant: "+car.getVariant());
        System.out.println("Car built year: "+car.getBuiltYear());
    }
    
}
