class BusKampus extends Kendaraan {

    BusKampus(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " berjalan mengangkut mahasiswa");
    }

    @Override
    void info() {
        System.out.println("Bus Kampus: " + nama + ", kapasitas: " + kapasitas);
    }
}
