package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private long cardNumber;
    private int[] zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int[] getZones() {
        return zones;
    }

    public void setZones(int[] zones) throws Exception {
        if (zones.length < 2) {
            throw new Exception("Message");
        }
        this.zones = zones;
    }

}
