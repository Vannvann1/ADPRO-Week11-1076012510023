public class Main {
    public static void main(String[] args) {

        Kendaraan k1 = new BusKampus("Bus A", 40);
        Kendaraan k2 = new MobilOperasional("Mobil B", 5);
        Kendaraan k3 = new SepedaListrik("Sepeda C", 1);

        Kendaraan k4 = new Kendaraan("Kendaraan Darurat", 2) {
            @Override
            void bergerak() {
                System.out.println(nama + " bergerak cepat untuk keadaan darurat");
            }

            @Override
            void info() {
                System.out.println("Anonymous Kendaraan: " + nama + ", kapasitas: " + kapasitas);
            }
        };

        Kendaraan[] daftar = {k1, k2, k3, k4};

        for (Kendaraan k : daftar) {
            k.info();
            k.bergerak();
            System.out.println();
        }
    }
}
