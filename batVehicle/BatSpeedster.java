package KauflandContest2019.batVehicle;

public class BatSpeedster extends BatVehicle {

    public BatSpeedster() {
        super(2, SeatsType.SPORT, 320, 1600, Gearbox.MANUAL, Color.RED, PoweredWith.GASOLINE);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void stop() {

    }

    public void openCloseRoof() {
    }
}
