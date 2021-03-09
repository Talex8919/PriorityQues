package kg.megacome.course.models;

public class Tickets implements Comparable<Tickets> {
    private int price;
    private boolean isVip;
    private String ticketName;

    public Tickets(int price, boolean isVip, String ticketName) {
        this.price = price;
        this.isVip = isVip;
        this.ticketName = ticketName;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "price=" + price +
                ", isVip=" + isVip +
                ", ticketName='" + ticketName + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    @Override
    public int compareTo(Tickets o) {
        return 0;
    }
}
