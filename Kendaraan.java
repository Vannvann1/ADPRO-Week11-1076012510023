abstract class Kendaraan {
    String nama;
    int kapasitas;

    // constructor
    Kendaraan(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    // method abstract
    abstract void bergerak();
    abstract void info();
}
