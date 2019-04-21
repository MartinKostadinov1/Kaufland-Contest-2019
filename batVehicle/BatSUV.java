package KauflandContest2019.batVehicle;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public class BatSUV extends BatVehicle {
    public BatSUV() {
        super(7, SeatsType.BASIC, 150, 1850, Gearbox.AUTOMATIC, Color.BLUE, PoweredWith.DIESEL);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void stop() {

    }

    public void switchTo4x4() {

    }
}
