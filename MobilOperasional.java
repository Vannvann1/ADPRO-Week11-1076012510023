class MobilOperasional extends Kendaraan {

    MobilOperasional(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " digunakan untuk operasional kampus");
    }

    @Override
    void info() {
        System.out.println("Mobil Operasional: " + nama + ", kapasitas: " + kapasitas);
    }
}
