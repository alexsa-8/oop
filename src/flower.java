//import com.sun.tools.javac.Main;

public class flower {
    String nameFlower;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {
        this.nameFlower = nameFlower;
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    void outputInformationFlower() {
        System.out.print("Название: " + nameFlower + ", цвет: "+flowerColor+
                ", строна происхождения: " + country + ", цена: ");
        System.out.printf("%.2f",cost);
        System.out.println(" руб., срок стояния (день): " + lifeSpan + " .");
    }
}
