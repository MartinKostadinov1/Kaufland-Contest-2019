package KauflandContest2019.batVehicle;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public class BatLimousine extends BatVehicle {

    public BatLimousine() {
        super(5, SeatsType.LEATHER, 260, 2100, Gearbox.AUTOMATIC, Color.GRAY, PoweredWith.ELECTRIC);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void stop() {

    }

    public void recharge() {

    }
}
