public class Flight {
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private double czasTrwaniaLotu;
    private int liczbaMiejsc;

    public Flight(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, double czasTrwaniaLotu, int liczbaMiejsc) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTrwaniaLotu = czasTrwaniaLotu;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }

    public String getDataWylotu() {
        return dataWylotu;
    }

    public double getCzasTrwaniaLotu() {
        return czasTrwaniaLotu;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public void setDataWylotu(String dataWylotu) {
        this.dataWylotu = dataWylotu;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "miejsceDocelowe='" + miejsceDocelowe + '\'' +
                ", miejsceWylotu='" + miejsceWylotu + '\'' +
                ", dataWylotu='" + dataWylotu + '\'' +
                ", czasTrwaniaLotu=" + czasTrwaniaLotu +
                ", liczbaMiejsc=" + liczbaMiejsc +
                '}';
    }

    public void add(Flight flight) {
    }
}
