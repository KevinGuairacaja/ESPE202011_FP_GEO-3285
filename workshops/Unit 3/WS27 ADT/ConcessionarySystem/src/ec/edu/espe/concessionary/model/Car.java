package ec.edu.espe.concessionary.model;

public class Car {
    private String brand;
    private int ringSize;
    private int numberOfDoors;
    private int numberOfPassengers;
    private String plateNumber;

    public Car(String name, int ringSize, int numberOfDoors, int numberOfPassengers, String plateNumber) {
        this.brand = name;
        this.ringSize = ringSize;
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
        this.plateNumber = plateNumber;
    }
    
    

    /**
     * @return the brand
     */
    public String getName() {
        return brand;
    }

    /**
     * @param name the brand to set
     */
    public void setName(String name) {
        this.brand = name;
    }

    /**
     * @return the ringSize
     */
    public int getRingSize() {
        return ringSize;
    }

    /**
     * @param ringSize the ringSize to set
     */
    public void setRingSize(int ringSize) {
        this.ringSize = ringSize;
    }

    /**
     * @return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param numberOfDoors the numberOfDoors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * @return the numberOfPassengers
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * @param numberOfPassengers the numberOfPassengers to set
     */
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    
}

