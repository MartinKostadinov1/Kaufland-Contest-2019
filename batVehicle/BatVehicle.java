package KauflandContest2019.batVehicle;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public abstract class BatVehicle {
    protected int seats;
    protected SeatsType seatsType;
    protected int horsepower;
    protected double weight;
    protected Gearbox gearbox;
    protected Color color;
    protected PoweredWith poweredWith;

    public BatVehicle(int seats,SeatsType seatsType, int horsepower, double weight, Gearbox gearbox, Color color, PoweredWith poweredWith) {
        this.seats = seats;
        this.seatsType = seatsType;
        this.horsepower = horsepower;
        this.weight = weight;
        this.gearbox = gearbox;
        this.color = color;
        this.poweredWith = poweredWith;
    }

    public abstract void accelerate();
    public abstract void stop();


}
