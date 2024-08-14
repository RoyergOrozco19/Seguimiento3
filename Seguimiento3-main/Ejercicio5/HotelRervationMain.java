package Ejercicio5;

public class HotelRervationMain {
    public static void main(String[] args) {
        HotelReservation[] hotel = new HotelReservation[5];

        hotel[1] = new HotelReservation(100, 180.0, true, "Gabriel Rosero");
        hotel[2] = new HotelReservation(101, 150.0, false, "Jose Pineda");
        hotel[3] = new HotelReservation(102, 190.0, true, "Jefferson Martinez");
        hotel[4] = new HotelReservation(103, 200.0, false, "Luis Diaz");
        hotel[5] = new HotelReservation(104, 140.0, true, "Omar Ruiz");

        System.out.println("Room Details:");
        for (HotelReservation reservation : hotel) {
            System.out.println("Room Number: " + reservation.getRoomNumber());
            System.out.println("Price per Night: $" + reservation.getPricePerNight());
            System.out.println("Availability: " + (reservation.isAvailability() ? "Available" : "Occupied"));
            System.out.println("Guests: " + reservation.getGuests());
            System.out.println("------------------------------");
        }


        hotel[1].setPricePerNight(160.0);
        hotel[1].setAvailability(false);
        hotel[1].setGuests("Carlos García");


        System.out.println("Details after Modifications:");
        for (HotelReservation reservation : hotel) {
            System.out.println("Room Number: " + reservation.getRoomNumber());
            System.out.println("Price per Night: $" + reservation.getPricePerNight());
            System.out.println("Availability: " + (reservation.isAvailability() ? "Available" : "Occupied"));
            System.out.println("Guests: " + reservation.getGuests());
            System.out.println("------------------------------");
        }
    }
}


