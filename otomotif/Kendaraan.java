public abstract class Kendaraan {

    public static final double HARGA_BBM_PER_LITER = 10000;

    private final String noPlat;

    private String merek;
    private double bbm;
    private double odometer;

    public Kendaraan(String noPlat, String merek) {
        this(noPlat, merek, 0);
    }

    public Kendaraan(String noPlat, String merek, double bbmAwal) {
        this.noPlat = noPlat;
        this.merek = merek;
        this.bbm = bbmAwal;
        this.odometer = 0;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getBbm() {
        return bbm;
    }

    public void setBbm(double bbm) {
        this.bbm = bbm;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public void isiBBM(double liter) {
        this.bbm = this.bbm + liter;
        System.out.printf("[%s] Isi BBM %.1f L, biaya Rp%,.0f%n", merek, liter, hitungBiaya(liter));
    }
    public double hitungBiaya(double liter) {
        return liter * HARGA_BBM_PER_LITER;
    }

    public void tampilkanInfo() {
        System.out.println("No. Plat : " + noPlat);
        System.out.println("Merek    : " + merek);
        System.out.printf("BBM      : %.1f L%n", bbm);
        System.out.printf("Odometer : %.1f km%n", odometer);
    }

    public abstract void jalan(double jarakKm);
}