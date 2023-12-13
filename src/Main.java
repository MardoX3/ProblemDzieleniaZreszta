import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] moneyArray = {50000,20000,10000,5000,2000,1000,500,200,100,50,28,10,5,2,1};
        System.out.println("Algorytm wydawania reszty");
        System.out.println("Kwota do zaplaty");
        int doZaplaty = (int) scanner.nextDouble()*100;
        System.out.println("kwota ziutka");
        int ileMa = (int) scanner.nextDouble()*100;
        int rest = ileMa%doZaplaty;
        int[] wynik = givingChange(rest,moneyArray);
        for (int i = 0;i < wynik.length; i++){
            System.out.print((moneyArray[i]/100)+" - "+wynik[i]+"| ");
        }
    }
    public static int[] givingChange(int rest, int[] moneyArray){
        int size = moneyArray.length;
        int[] amountOfMoney = new int[size];
        for(int i = 0; i < size; i++){amountOfMoney[i] = 0;}
        int i=0;
        while(rest >0){
            amountOfMoney[i] = rest/moneyArray[i];
            rest -= amountOfMoney[i]* moneyArray[i];
            i++;
        }
        return amountOfMoney;

    }
}