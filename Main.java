public class Main {
    public static void main(String[] args) {
        FlightBookingSystem system = new FlightBookingSystem();
        Flight flight1 = new Flight("Warszawa", "Nowy Jork", "2024-05-10", 9.5, 10);
        system.dodajLot(flight1);

        system.rezerwujLot("Jan Kowalski", flight1, 1500.00);
        system.wyswietlDostepneLoty();
        system.anulujRezerwacje("Jan Kowalski", flight1);
        system.wyswietlDostepneLoty();
    }
}
