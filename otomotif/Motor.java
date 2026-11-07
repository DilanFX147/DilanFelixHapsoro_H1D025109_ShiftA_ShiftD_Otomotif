public class Motor extends Kendaraan implements Servisable {
    private double kmPerLiter;
    public Motor(String noPlat, String merek) {
        super(noPlat, merek);
        this.kmPerLiter = 40;
    }
    public Motor(String noPlat, String merek, double bbmAwal) {
        super(noPlat, merek, bbmAwal);
        this.kmPerLiter = 40;
    }
    public double getKmPerLiter() {
        return kmPerLiter;
    }
    public void setKmPerLiter(double kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    @Override
    public void jalan(double jarakKm) {
        double bbmDibutuhkan = jarakKm / kmPerLiter;
        if (getBbm() >= bbmDibutuhkan) {
            setBbm(getBbm() - bbmDibutuhkan);
            setOdometer(getOdometer() + jarakKm);
            System.out.printf("[%s] Menempuh %.1f km, sisa BBM %.1f L%n",
                    getMerek(), jarakKm, getBbm());
        } else {
            System.out.printf("[%s] BBM tidak cukup! Butuh %.1f L, tersedia %.1f L%n",
                    getMerek(), bbmDibutuhkan, getBbm());
        }
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("--- Info Motor ---");
        super.tampilkanInfo();
        System.out.printf("Konsumsi : %.1f km/L%n", kmPerLiter);
    }
    @Override
    public void servis() {
        System.out.println("[" + getMerek() + "] Servis selesai: ganti oli dan setel CVT.");
    }
}