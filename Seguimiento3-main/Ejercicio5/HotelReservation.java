package Ejercicio5;

public class HotelReservation {
    private int roomNumber;
    private double pricePerNight;
    private boolean availability;
    private String guests;

    public HotelReservation(int roomNumber, double pricePerNight, boolean availability, String guests) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.guests = guests;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }
}
