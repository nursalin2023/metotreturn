import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(number());
        namber();
        num();


    }

    public static int number() {

        int num = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                num += i;
            }
        }
        return num;
    }

    public static int namber() {
        int numm = 0;
        for (int j = 0; j <= 100; j++) {
            if (j % 4 == 0) {numm += j;}}return numm;}
    public static int num(){
       int numb = 0;
        for (int j = 0; j <=100 ; j++) {
            if (j%5==0){
                numb+=j;}}
        return numb;
    }
}
