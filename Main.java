
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz...");
        String idmanlar = "Geçerli hareketler : \n"
                        + "pushup(şınav) \n"
                        + "situp(mekik)\n"
                        + "burpee \n"
                        + "squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.print("Burpee sayısı : ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayısı : ");
        int pushup = scanner.nextInt();
        System.out.print("Squat sayısı : ");
        int squat = scanner.nextInt();
        System.out.print("Situp sayısı : ");
        int situp = scanner.nextInt();
        scanner.nextLine();
        
        idman idman =new idman(pushup,situp,burpee,squat);
        
    
        System.out.print("İdman başlıyor....");
        
        int i = 1; 
        
        try(FileWriter writer = new FileWriter("log.txt")){
            writer.write("İdman Programı...\n");
            writer.write("Burpee sayısı : " + idman.getBurpee_sayısı() + " \n");
            writer.write("Pushup sayısı : " + idman.getPushup_sayısı() + " \n");
            writer.write("Situp sayısı : " + idman.getSitup_sayısı() + " \n");
            writer.write("Squat sayısı : " + idman.getSquat_sayısı() + " \n");
            
            
            

        while(idman.İdmanBittiMi()== false){
            System.out.print("Hareket türü (burpee,squat,pushup,situp) : ");
            String tür =scanner.nextLine();
            System.out.print("Kaç tane yapacaksınız ?: ");
            int sayi =scanner.nextInt();
            scanner.nextLine();
            idman.HareketYap(tür, sayi);
            
            writer.write(i + ".Islem ------> Hareket : "+ tür + " Sayı : " + sayi + " \n");
            i++;
            
            
        }
        } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("İdmanını başarıyla bitirdin....");
        




}
    
}

