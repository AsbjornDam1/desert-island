import java.util.Scanner;

public class DesertIsland {


    public static void main(String[] args) {
        String[] options = {"kæreste", "kaffemaskine", "Netflix", "sofa", "løbesko", "guitar", "slik", "hund", "bog", "øl"};

        Scanner scanInput1 = new Scanner(System.in);

        System.out.println("Hvilken ting vil du helst have med på en øde ø?");
        System.out.println("1." + options[0]);
        System.out.println("2." + options[1]);
        System.out.println("3." + options[2]);
        System.out.println("4." + options[3]);
        System.out.println("5." + options[4]);
        System.out.println("6." + options[5]);
        System.out.println("7." + options[6]);
        System.out.println("8." + options[7]);
        System.out.println("9." + options[8]);
        System.out.println("10." + options[9]);
        System.out.println(" ");
        System.out.println("Du må vælge 1 ting du gerne vil have med, du må godt vælge det samme flere gange, hvis du tror det hjælper :)");

        int[] scanIndex = new int[10];
        int max = scanIndex[0];
        int valgtFlestGange = 0;

        for (int i = 1; i <= options.length; i++) {
            System.out.println("Skriv dine valg med tal:");
            int userInputs = scanInput1.nextInt();

            scanIndex[userInputs-1] = scanIndex[userInputs-1] + 1;

        }

        for (int option : scanIndex) {
            System.out.print(option + ", ");
        }

        for (int i = 0; i < options.length; i++) {
            int currentElement = scanIndex[i];

            if (currentElement > max){
                max = currentElement;
                valgtFlestGange = i;
            }
        }

        String mereEndEtValgt = "";
        int mostChosenValuesIndex = scanIndex[valgtFlestGange];

        for (int i = 0; i < options.length; i++) {
            if (mostChosenValuesIndex == scanIndex[i]){
                mereEndEtValgt += options[i] + ", ";
            }
        }
        System.out.println("\n" + mereEndEtValgt + "Er det/de element der er valgt flest gange");

    }
}

