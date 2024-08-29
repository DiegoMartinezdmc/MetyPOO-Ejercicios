package models;

public class Temperatura {
    double celsius;

    public Temperatura() {

    }

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }
    public double convertirFarenheit() {
        return (celsius * 9/5) + 32;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
