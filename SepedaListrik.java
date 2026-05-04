class SepedaListrik extends Kendaraan {

    SepedaListrik(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " melaju dengan tenaga listrik");
    }

    @Override
    void info() {
        System.out.println("Sepeda Listrik: " + nama + ", kapasitas: " + kapasitas);
    }
}
