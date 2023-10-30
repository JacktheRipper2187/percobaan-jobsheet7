import java.util.Scanner; 

public class WhileGaji22 { 

    public static void main(String[] args) { 
        Scanner input22 = new Scanner(System.in); 
        
        int jumlahKaryawan, jumlahJamLembur; 
        double gajiLembur, totalGajiLembur; 
        gajiLembur = 0; 
        totalGajiLembur = 0; 
        
        String jabatan; 

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input22.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input22.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input22.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
        }

         System.out.println("Total gaji lembur: " + totalGajiLembur);
            
        
    }
}
