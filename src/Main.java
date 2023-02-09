import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = scan.nextInt();

        if(year%100!=0 && year%4==0){
            System.out.print(year+" bir artık yıldır !");
        }else if(year%100==0 && year%400==0){
            System.out.print(year+" bir artık yıldır !");
        }else{
            System.out.print(year+" bir artık yıldır değildir !");
        }


    }

}