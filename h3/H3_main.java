package h3;

public class Mensch {

    public String name;
    public int gebJahr;
    public int alter;

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int jahr) {
        this.gebJahr = jahr;
    }

    public void setAlter() {
        this.alter = 2025 - this.gebJahr;
    }

    public String getName() {
        return name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public int getAlter() {
        return alter;
    }
}
