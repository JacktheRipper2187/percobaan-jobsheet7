import java.util.Scanner;

public class DoWhileCuti22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;
        
        System.out.print("Masukkan jumlah jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuci Anda tidak mencukupi.");
                    break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Anda memilih untuk tidak mengambil cuti");
                break;
            }
               
        } while (jatahCuti > 0);

        
    }
    
}
