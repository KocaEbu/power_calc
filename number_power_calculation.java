import java.util.Scanner;

public class number_power_calculation {

    public static void main(String[] args) {
        int n,k;
        int total=1 ;

        Scanner  input = new Scanner(System.in);

        System.out.print("Lutfen ussu alinacak sayiyi giriniz : ");
        n= input.nextInt();

        System.out.print("Lutfen ussun kac oldugunu giriniz : ");
        k= input.nextInt();

        for(int i=1 ; i<=k; i++){

            total=total*n;

        }


        System.out.println("Us alinma islem sonucu : "+ total);


    }

}
