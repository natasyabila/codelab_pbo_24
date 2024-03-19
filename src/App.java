public class App {
    private static Object balok;

    public static void main(String[] args) throws Exception {
        // Membuat objek untuk masing-masing kelas
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");

        System.out.println("\nPerhitungan Kubus:");
        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        System.out.println("\nPerhitungan Tabung:");
        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
