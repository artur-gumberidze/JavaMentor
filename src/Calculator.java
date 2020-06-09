import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
public void Input() throws Exception {
    System.out.println("На каких цифрах вы хотите работать?");
    System.out.println("1.Арабских");
    System.out.println("2.Римских");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String challenge = reader.readLine();
    if (challenge.equals("1")){
        System.out.println("Введите арифметическую операцию:");
        String[] arifm = reader.readLine().split(" ");
        String s = arifm[1];
        Arifmetic arifmetic = new Arifmetic(Integer.parseInt(arifm[0]),s,Integer.parseInt(arifm[2]));
        System.out.println(arifmetic.Arifmetic());

    }
    else if(challenge.equals("2")){
        System.out.println("Введите арифметическую операцию:");
        String[] arifmR = reader.readLine().split(" ");
        Roman roman = new Roman();
        int fch = roman.digit(arifmR[0]);
        int sch = roman.digit(arifmR[2]);
        Arifmetic arifmetic = new Arifmetic(fch,arifmR[1],sch);
    }
}
}
