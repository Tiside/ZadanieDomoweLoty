public class Reservation {
    private Flight flight;
    private String imiePasażera;
    private double cenaBiletu;

    public Reservation(Flight flight, String imiePasażera, double cenaBiletu) {
        this.flight = flight;
        this.imiePasażera = imiePasażera;
        this.cenaBiletu = cenaBiletu;
        this.flight.setLiczbaMiejsc(this.flight.getLiczbaMiejsc() - 1);
    }

    public Flight getFlight() {
        return flight;
    }

    public String getImiePasażera() {
        return imiePasażera;
    }

    public double getCenaBiletu() {
        return cenaBiletu;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "flight=" + flight +
                ", imiePasażera='" + imiePasażera + '\'' +
                ", cenaBiletu=" + cenaBiletu +
                '}';
    }
}
