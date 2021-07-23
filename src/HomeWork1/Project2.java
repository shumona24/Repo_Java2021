package HomeWork1;

public class Project2 {

    public static void main(String[] args) {

       // Convert deg-Cel into Fahrenheit
         //
         // fT = cT × 9/5 + 32


        double cTemp = 21.11;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C = " + fTemp + "°F");

     // Convert deg-cel into kel
     // kT = cT × 9/5 + 32
        double celsius = 21.11;
        double kTemp = celsius * 9/5 + 32;
        System.out.println( celsius + "°C = " + kTemp + "°K");

     // Convert deg-f into c
     // fT = cT × 9/5 + 32d
     double fTem = 21.11;
     double cel = fTemp * 9/5 + 32;
        System.out.println( fTemp + " °f = " + cel + "°C");

     //convert deg fTemp into kTemp
     // kT = fT × 9/5 + 32
     double fahrenheit = 21.11;
     double kTem = fahrenheit * 9 / 5 + 32;
        System.out.println(fTem + "°f = " + kTem + "°k");

     // Convert deg  kTem to cTem
     double cTem =  21.11;
     double kel =cTemp * 9 / 5 + 32;
        System.out.println(fTem + "°f" + kel + "°k");





    }
}
