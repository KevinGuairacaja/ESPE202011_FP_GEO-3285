package ec.edu.espe.concessionary.model;

public class water {
    String name, lastName, model, serie; 

    public WaterPumpModel(String name, String lastName, String model, String serie) {
        this.name = name;
        this.lastName = lastName;
        this.model = model;
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
}

