package Models;

import java.util.Date;

/**
 * Модель билета
 */
public class Ticket {

    private long id;
    private int routeNumber;
    private int place;
    private int price;
    private Date date;
    private int zonaStart;
    private int zonaStop;
    private short type;
    private boolean isValid;

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public void setZonaStop(int zonaStop) {
        this.zonaStop = zonaStop;
    }

    public void setZonaStart(int zonaStart) {
        this.zonaStart = zonaStart;
    }

    public Ticket(int routeNumber, int place, int price, Date date, boolean isValid) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", " + (isValid ? "Free" : "Busy");
    }

    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }

    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public int getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }

    public long getId() {
        return id;
    }

    public short getType() {
        return type;
    }

    public int getZonaStop() {
        return zonaStop;
    }

    public int getZonaStart() {
        return zonaStart;
    }

}
