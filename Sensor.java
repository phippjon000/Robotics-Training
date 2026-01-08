public class Sensor {
    private double position;

    public Sensor() {
        position = 0;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double pos) {
        position = pos;
    }

    public void addTen() {
        position += 10;
    }

    public void subTen() {
        position -= 10;
    }
}