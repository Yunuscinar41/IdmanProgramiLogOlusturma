
public class idman {
    private int pushup_sayısı;
    private int burpee_sayısı;
    private int situp_sayısı;
    private int squat_sayısı;

    public idman(int pushup_sayısı, int burpee_sayısı, int situp_sayısı, int squat_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
        this.burpee_sayısı = burpee_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.squat_sayısı = squat_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }
    public void HareketYap(String harekettürü,int sayi){
        if(harekettürü.equals("burpee")){
            burpeeyap(sayi);
        }
        else if(harekettürü.equals("pushup")){
            pushupyap(sayi);
        }
        else if(harekettürü.equals("situp")){
            situpyap(sayi);
        }
        else if(harekettürü.equals("squat")){
            squatyap(sayi);
        }
        else{
            System.out.println("Geçersiz hareket...");
        }
    }
    public void burpeeyap(int sayi){
        if(burpee_sayısı ==0){
            System.out.println("Yapacak burpee kalmadı...");
        }
        if((sayi - burpee_sayısı)> 0){
            System.out.println("Tebrikler hedefinizi geçtiniz");
            burpee_sayısı = 0;
            System.out.println("Kalan burpee : "+ burpee_sayısı);
    }
        else{
            burpee_sayısı -= sayi;
            System.out.println("Kalan burpee : "+ burpee_sayısı);
        }
    }
    public void pushupyap(int sayi){
        if(pushup_sayısı ==0){
            System.out.println("Yapacak pushup kalmadı...");
        }
        if((sayi - pushup_sayısı)> 0){
            System.out.println("Tebrikler hedefinizi geçtiniz");
            pushup_sayısı = 0;
            System.out.println("Kalan pushup : "+ pushup_sayısı);
    }
        else{
            pushup_sayısı -= sayi;
            System.out.println("Kalan pushup : "+ pushup_sayısı);
        }
    }
    public void situpyap(int sayi){
        if(situp_sayısı ==0){
            System.out.println("Yapacak situp kalmadı...");
        }
        if((sayi - situp_sayısı)> 0){
            System.out.println("Tebrikler hedefinizi geçtiniz");
            situp_sayısı = 0;
            System.out.println("Kalan situp : "+ situp_sayısı);
    }
        else{
            situp_sayısı -= sayi;
            System.out.println("Kalan situp : "+ situp_sayısı);
        }
    }
    public void squatyap(int sayi){
        if(squat_sayısı ==0){
            System.out.println("Yapacak squat kalmadı...");
        }
        if((sayi - squat_sayısı)> 0){
            System.out.println("Tebrikler hedefinizi geçtiniz");
            squat_sayısı = 0;
            System.out.println("Kalan squat : "+ squat_sayısı);
    }
        else{
            squat_sayısı -= sayi;
            System.out.println("Kalan squat : "+ squat_sayısı);
        }
    }
    public boolean İdmanBittiMi(){
        
        return((burpee_sayısı == 0) && (situp_sayısı ==0) && (squat_sayısı == 0) && (pushup_sayısı == 0));
    }
}
