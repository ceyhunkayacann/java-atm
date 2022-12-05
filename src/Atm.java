import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String username;
        String password;

        String _username = "ceyy";
        String _password = "1234";

        int right = 3;
        double balance = 4000;
        int select;
        int price;

        Scanner userInput = new Scanner(System.in);

        while (right > 0)  {
            System.out.print("Kullanıcı Adı : ");
            username = userInput.nextLine();

            System.out.print("Şifre : ");
            password = userInput.nextLine();

            if(username.equals(_username) && password.equals(_password)) {
                System.out.println("Merhaba, " + username.substring(0, 1).toUpperCase() + username.substring(1));

                do {
                    System.out.println("-------------------------------------\n" +
                            "\t1 - Para Çekme\n" +
                            "\t2 - Para Yatırma\n" +
                            "\t3 - Bakiye Sorgulama\n" +
                            "\t4 - Çıkış Yap\n");

                    do {
                        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                        select = userInput.nextInt();
                        if((select != 1) && (select != 2) && (select != 3) && (select != 4)){
                            System.out.println("Geçersiz İşlem");
                        }
                    }
                    while ((select != 1) && (select != 2) && (select != 3) && (select != 4));

                    System.out.println("-------------------------------------\n");

                    switch (select){
                        case 1 :
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            price = userInput.nextInt();

                            if(price < balance) {
                                balance -= price;
                                System.out.println("İşleminiz başarıyla tamamlanmıştır.");
                                System.out.println("Güncel Bakiye : " + (int)balance + " TL");
                            }
                            else {
                                System.out.println("Yetersiz Bakiye");
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price = userInput.nextInt();
                            balance += price;
                            System.out.println("İşleminiz başarıyla tamamlanmıştır.");
                            System.out.println("Güncel Bakiye : " + (int)balance + " TL");
                            break;
                        case 3:
                            System.out.println("Bakiye : " + (int)balance + " TL");
                            break;
                        case 4:
                            System.out.println("Çıkış Yapıldı.");
                    }


                }while (select != 4);
                break;
            }
            else {
                right--;
                if(right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankanız ile iletişime geçiniz.");
                    break;
                }
                else{
                    System.out.println("Hatalı Giriş.");
                    System.out.println(right + " hakkınız kaldı");
                }
            }
        }








    }
}
