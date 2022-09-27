package objects;

public class Automobile {
    // Properties
    private String make;
    private String model;
    private int year;
    private String color;
    private int kpl; // consumption of liters per 100 kilometers

    // Constructors
    public Automobile() {
    }

    public Automobile(String make, String model, int year, String color, int kpl) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.kpl = kpl;
    }

    // Override equals method.
    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;
        // Check if both reference variables are pointing to the same object in the heap.
        if (this == o) {
            isEqual = true;
        } else {
            // Check if input object is an instance of the objects.Automobile class.
            if (o instanceof Automobile) {
                // Cast the input object type to objects.Automobile to be able to use its properties
                // for comparison.
                Automobile obj = (Automobile) o;
                if (getYear() == obj.getYear() && getKpl() == obj.getKpl() &&
                        getMake().equals(obj.getMake()) && getModel().equals(obj.getModel()) &&
                        getColor().equals(obj.getColor())) {
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKpl() {
        return kpl;
    }

    public void setKpl(int kpl) {
        this.kpl = kpl;
    }

    // Methods
    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void stopEngine() {
        System.out.println("Stopping engine...");
    }
}
