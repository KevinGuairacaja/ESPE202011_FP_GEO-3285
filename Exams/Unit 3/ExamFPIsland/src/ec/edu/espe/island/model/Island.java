package ec.edu.espe.island.model;

public class Island {

    private String name;
    private String ocean;
    private int size;
    private String kind;
    private int numberOfInhabitants;

    public Island(String name, String ocean, int size, String kind, int numberOfInhabitants) {
        this.name = name;
        this.ocean = ocean;
        this.size = size;
        this.kind = kind;
        this.numberOfInhabitants = numberOfInhabitants;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ocean
     */
    public String getOcean() {
        return ocean;
    }

    /**
     * @param ocean the ocean to set
     */
    public void setOcean(String ocean) {
        this.ocean = ocean;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind the kind to set
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * @return the numberOfInhabitants
     */
    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    /**
     * @param numberOfInhabitants the numberOfInhabitants to set
     */
    public void setNumberOfInhabitants(int numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
    }

    
}
