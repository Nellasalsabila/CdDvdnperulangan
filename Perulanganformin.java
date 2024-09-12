import java.util.Scanner;

public class Perulanganformin {
public static void main(String[] args, Scanner in) {
int awal,akhir,kelipatan;

Scanner s = new Scanner(System.in);
System.out.println("Masukan Nilai Awal: ");
awal = s.nextInt();
System.out.println("Masukan Nilai Akhir: ");
akhir =s.nextInt();
System.out.println("Masukan Nilai Kelipatan: ");
kelipatan = s.nextInt(); 

    for(int i =awal; i >=akhir; i-=kelipatan){
    System.out.println(i+",");
        }
}
}