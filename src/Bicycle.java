public class Bicycle {
    String type;
    int gear;
    int wheelbase;
    int height;
    String color;
    String constructionMaterial;

    public Bicycle() {

    }

    public Bicycle(String type, int gear, int wheelbase, int height, String color, String constructionMaterial) {
        this.type = type;
        this.gear = gear;
        this.wheelbase = wheelbase;
        this.height = height;
        this.color = color;
        this.constructionMaterial = constructionMaterial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(int wheelbase) {
        this.wheelbase = wheelbase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConstructionMaterial() {
        return constructionMaterial;
    }

    public void setConstructionMaterial(String constructionMaterial) {
        this.constructionMaterial = constructionMaterial;
    }

    @Override
    public String toString() {
        return
                "-type " + type +
                " -gear " + gear +
                " -wheelbase " + wheelbase +
                " -height " + height +
                " -color " + color +
                " -construction_material " + constructionMaterial;
    }
}
