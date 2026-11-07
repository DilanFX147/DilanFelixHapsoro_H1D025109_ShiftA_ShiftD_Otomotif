public class Main {

    public static void main(String[] args) {

        Mobil mobil = new Mobil("R 1234 AB", "Toyota Avanza");
        Motor motor = new Motor("R 4321 XY", "Honda Beat", 5);

        System.out.println("===== PERJALANAN MOBIL =====");
        mobil.jalan(50);
        mobil.isiBBM(5);
        mobil.jalan(50);
        mobil.jalan(100);

        System.out.println();
        System.out.println("===== PERJALANAN MOTOR =====");
        motor.isiBBM(4);
        motor.jalan(100);
        motor.jalan(160);
        motor.jalan(100);

        System.out.println();
        System.out.println("===== BENGKEL =====");
        Servisable servisMobil = new Mobil("B 1111 AA", "Suzuki Ertiga");
        Servisable servisMotor = motor;
        servisMobil.servis();
        servisMotor.servis();

        System.out.println();
        System.out.println("===== KLAKSON =====");
        PunyaKlakson klakson = mobil;
        klakson.bunyikanKlakson();

        System.out.println();
        System.out.println("===== STATUS AKHIR =====");
        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}