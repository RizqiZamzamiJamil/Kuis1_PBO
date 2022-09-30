// Rizqi Zamzami Jamil 20 2141762089
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-== Data Karyawan  PT XYZ ==-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("  Jumlah Karyawan  : ");
        int jk = in.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for(int i=0; i<jk; i++){
            System.out.print("  Nama Karyawan  : ");
            String nama = in.next();
            System.out.print("  NIP            : ");
            String nip = in.next();
            System.out.print("  Jam Kerja      : ");
            int jamkerja = in.nextInt();

            Pegawai peg = new Pegawai(nama, nip, jamkerja);
            System.out.println("=-== Data Gaji  Total Karyawan ==-=");
            peg.hitungGajiHarian();
            peg.cetakPenghasilan();
        }
    }
}
