package org.example.models;

public class Interview extends Model{
    private String name;

    public Interview(int durationInSeconds, String name) {
        this.durationInSeconds = durationInSeconds;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Берем интервью у %s",
                this.name);
    }
}
