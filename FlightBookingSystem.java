import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem {
    private List<Flight> flight = new ArrayList<>();
    private List<Reservation> rezerwacje = new ArrayList<>();



    public void rezerwujLot(String imiePasażera, Flight flight, double cena) {
        if (flight.getLiczbaMiejsc() > 0) {
            Reservation nowaRezerwacja = new Reservation(flight, imiePasażera, cena);
            rezerwacje.add(nowaRezerwacja);
            System.out.println("Rezerwacja dodana: " + nowaRezerwacja);
        } else {
            System.out.println("Brak miejsc na ten lot.");
        }
    }


    public boolean anulujRezerwacje(String imiePasażera, Flight flight) {
        for (Reservation rezerwacja : rezerwacje) {
            if (rezerwacja.getImiePasażera().equals(imiePasażera) && rezerwacja.getFlight().equals(flight)) {
                rezerwacje.remove(rezerwacja);
                flight.setLiczbaMiejsc(flight.getLiczbaMiejsc() + 1);
                System.out.println("Rezerwacja anulowana: " + rezerwacja);
                return true;
            }
        }
        return false;
    }

    public List<Flight> szukajLotów(String z, String dok) {
        List<Flight> znalezioneLoty = new ArrayList<>();
        for (Flight flight : flight) {
            if (flight.getMiejsceWylotu().equalsIgnoreCase(z) && flight.getMiejsceDocelowe().equalsIgnoreCase(dok)) {
                znalezioneLoty.add(flight);
            }
        }
        return znalezioneLoty;
    }

    public void wyswietlDostepneLoty() {
        for (Flight flight : flight) {
            if (flight.getLiczbaMiejsc() > 0) {
                System.out.println(flight);
            }
        }
    }

    public void dodajLot(Flight flight) {
        flight.add(flight);
    }
}
