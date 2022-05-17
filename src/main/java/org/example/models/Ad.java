package org.example.models;

public class Ad extends Model{
    private String productName;

    public Ad(int durationInSeconds, String productName) {
        this.durationInSeconds = durationInSeconds;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return String.format("Реклама продукта '%s'",
                this.productName);
    }
}
