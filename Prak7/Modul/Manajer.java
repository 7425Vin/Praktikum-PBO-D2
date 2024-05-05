public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }


    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
