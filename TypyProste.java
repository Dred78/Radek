package pl.javastart.first;


public class Test_7
{
    byte b = 127; // -128 do 127
    short s = 32767; // -32768 do 32767
    int i = -2147483648; // -2147483648 do 2147483647
    long l = 9223372036854775807l; // -9223372036854775808 do 9223372036854775807
    float f = 3.444444f; // -3,4*10^38 do 3,4*10^38
    double d = 3.777654545656345645; // -1,8* 10^108 do 1,8* 10^108
    char c = 'a'; // większość liter występującyh na świecie
    String string = "Jakiś tekst";

    public static void main (String[] args)
    {
        byte b1 = 127;
        b1++;
        b1++;
        System.out.println(b1);


        int wynik1, wynik2 = 7, wynik3, wynik4;
        int l1 = 72;
        int l2 = 16;
        wynik1 = l1+l2;
        wynik2 = l1-l2;
        wynik3 = l1*l2;
        wynik4 = l1/l2;
        int wynik5 = l1%l2;
        System.out.println("Wynik = " + wynik1);
        System.out.println("Wynik = " + wynik2);
        System.out.println("Wynik = " + wynik3);
        System.out.println("Wynik = " + wynik4);
        System.out.println("Wynik = " + wynik5);
        wynik5++;
        wynik5++;
        wynik5++;
        System.out.println("Wynik = " + wynik5);
        wynik1--;
        System.out.println("Wynik = " + wynik1);
    }
}
