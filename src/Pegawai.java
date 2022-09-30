//Rizqi Zamzami Jamil 20 2141762089
public class Pegawai {
    private String Nama, NIP;
    private double gajiPokok, lembur, uangMakan, transport;
    private int jumlahJamKerja;
    private double gaji;
    
    Pegawai(String Nama, String NIP, int jumlahJamKerja){
        this.Nama = Nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    private void setJumlahJamKerja(int jumlahJamKerja) {
        this.jumlahJamKerja = jumlahJamKerja;
    }


    public String getNama() {
        return Nama;
    }

    public String getNIP() {
        return NIP;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getLembur() {
        return lembur;
    }

    public double getUangMakan() {
        return uangMakan;
    }

    public double getTransport() {
        return transport;
    }

    public int getJumlahJamKerja() {
        return jumlahJamKerja;
    }


    //rumus
    public void hitungGajiHarian() {
        double nilaiGaji = 2000;
        int jamLembur = jumlahJamKerja - 7;
        if (jumlahJamKerja >= 9) {
            transport = 4000;
            uangMakan = 3500;
            gajiPokok = nilaiGaji * 7;
            lembur = jamLembur * (2000 * 1.5);
        } else if (jumlahJamKerja >= 8) {
            uangMakan = 3500;
            gajiPokok = nilaiGaji * 7;
            lembur = jamLembur * (2000 * 1.5);
        } else if (jumlahJamKerja > 0 && jumlahJamKerja <= 7) {
            gajiPokok = nilaiGaji * 7;
            lembur = jamLembur * (2000 * 1.5);
        } else {
            jumlahJamKerja = jumlahJamKerja * 2000;
        }

        gaji = gajiPokok + lembur + uangMakan + transport;
    }

    public void cetakPenghasilan() {
        System.out.println("   Nama           : " + Nama);
        System.out.println("   NIP            : " + NIP);
        System.out.println("   Jam Kerja      : " + jumlahJamKerja);
        System.out.println("   Gaji Pokok     : " + gajiPokok);
        System.out.println("   Bonus Lembur   : " + lembur);
        System.out.println("   Uang Makan     : " + uangMakan);
        System.out.println("   Uang Transport : " + transport);
        System.out.println("-----------------------------------");
        System.out.println("   Total Gaji     : " + gaji);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}