package org.example.models;

public class Song extends Model {
    private String performer;

    private String title;

    public Song(int durationInSeconds, String performer, String title){
        this.durationInSeconds = durationInSeconds;
        this.performer = performer;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Звучит песня '%s', исполнитель %s",
                this.title,
                this.performer);
    }
}
