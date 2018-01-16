package zimmermann.larissa.firebaseapp;

/**
 * Created by laris on 16/01/2018.
 */

public class Product {
    private String description;
    private String color;
    private String producer;

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
