import java.util.Scanner;

public class Looping {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cd atau DVD?");
        String pilihan = in.next();

        if(pilihan.equals("Cd")) {
           Cd c1 = new Cd();
           c1.print();
        }else if (pilihan.equals("DVD")){
           DVD d1 = new DVD();
           d1.print();
        } else {
            System.out.println("Input Salah.");
        }
        
        while (true) {
            System.out.println("Cd atau DVD? (ketik 'keluar' untuk berhenti)");
            pilihan = in.next();
           
            if (pilihan.equalsIgnoreCase("keluar")) {
                System.out.println("Terima kasih, program dihentikan.");
                break;  
            }

            if (pilihan.equalsIgnoreCase("Cd"));
    
            }
    }
}