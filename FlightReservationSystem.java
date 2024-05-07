import java.util.List;

public interface FlightReservationSystem {
    void rezerwujlot(String imiePasazera, Flight flight, double cena);
    boolean anulujRezerwacje(String imiePasazera, Flight flight);
    List<Flight> szukajLoty(String z, String dok);
    void wyswietlDostepneLoty();
}
