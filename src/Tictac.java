import java.util.Scanner;

public class Tictac{

    public static void main(String[] args) {
        new Tictac().start();
    }

    Scanner scanner = new Scanner(System.in);

    public void start(){

        System.out.print("Start" + "\n" +
                " 1 | 2 | 3 " + "\n" +
                "-----------" + "\n" +
                " 4 | X | 5 " + "\n" +
                "-----------" + "\n" +
                " 6 | 7 | 8 " + "\n" +
                "Twój ruch: ");

        int graczO = scanner.nextInt();

        switch (graczO) {
            case 1: // 1
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " O | 2 | 3 " + "\n" +
                        "-----------" + "\n" +
                        " 4 | X | 5 " + "\n" +
                        "-----------" + "\n" +
                        " 6 | 7 | X " + "\n" +
                        "Twój ruch: ");

                int graczO1 = scanner.nextInt();
                switch (graczO1) {
                    case 2: // 1 2
                        System.out.print("\n" + "\n" +"Runda 2:" + "\n" +
                                " O | O | X " + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5 " + "\n" +
                                "-----------" + "\n" +
                                " 6 | 7 | X " + "\n" +
                                "Twój ruch: ");

                        int graczO21 = scanner.nextInt();
                        switch (graczO21) {
                            case 4: // 1 2 4
                                System.out.print("\n" + "\n" +"Runda 3:" + "\n" +
                                        " O | O | X " + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | X " + "\n" +
                                        "-----------" + "\n" +
                                        " 6 | 7 | X " + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 1 2 5
                                System.out.print("\n" + "\n" +"Runda 3:" + "\n" +
                                        " O | O | X " + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O " + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X " + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 6: // 1 2 6
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X " + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X " + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X " + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 1 2 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X " + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X " + "\n" +
                                        "-----------" + "\n" +
                                        " 6 | O | X " + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 3: // 1 3
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | X | O " + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5 " + "\n" +
                                "-----------" + "\n" +
                                " 6 | 7 | X " + "\n" +
                                "Twój ruch: ");

                        int graczO31 = scanner.nextInt();
                        switch (graczO31){
                            case 4: // 1 3 4
                                System.out.print( "\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " 6 | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 1 3 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 6 | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 6: // 1 3 6
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 1 3 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " 6 | O | X" + "\n" +
                                        "Twój ruch: ");

                                int graczO37 = scanner.nextInt();
                                switch (graczO37){
                                    case 5: // 1 3 7 5
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | O | X" + "\n" +
                                                "Gra zakończona, remis.");
                                        break;
                                    case 6: // 1 3 7 6
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | X " + "\n" +
                                                "-----------" + "\n" +
                                                " O | O | X" + "\n" +
                                                "Gra zakończona, wygrał gracz X.");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 4: // 1 4
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | 3" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO41 = scanner.nextInt();
                        switch (graczO41){
                            case 2: // 1 4 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | 3" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 3: // 1 4 3
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 1 4 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | 3" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 1 4 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 5: // 1 5
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | 3" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO51 = scanner.nextInt();
                        switch (graczO51){
                            case 2: // 1 5 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 3: // 1 5 3
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 1 5 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 1 5 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 6: // 1 6
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | 3" + "\n" +
                                "-----------" + "\n" +
                                " X | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " O | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO61 = scanner.nextInt();
                        switch (graczO61){
                            case 2: // 1 6 2
                                System.out.print("Runda 3:" + "\n" +
                                        " O | O | 3" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 3: // 1 6 3
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 1 6 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | 3" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Twój ruch: ");

                                int graczO65 = scanner.nextInt();
                                switch (graczO65){
                                    case 3: // 1 6 5 3
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | X" + "\n" +
                                                "Gra zakończona, wygrał gracz X.");
                                        break;
                                    case 7: // 1 56 5 4
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " O | O | X" + "\n" +
                                                "Gra zakończona, remis.");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            case 7: // 1 6 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | 3" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 7: // 1 7
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " 6 | O | X" + "\n" +
                                "Twój ruch: ");

                        int graczO71 = scanner.nextInt();
                        switch (graczO71){
                            case 2: // 1 7 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 1 7 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 1 7 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 6: // 1 7 6
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            case 2: // 2
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " 1 | O | X" + "\n" +
                        "-----------" + "\n" +
                        " 4 | X | 5" + "\n" +
                        "-----------" + "\n" +
                        " 6 | 7 | 8" + "\n" +
                        "Twój ruch: ");

                int graczO2 = scanner.nextInt();
                switch (graczO2) {
                    case 1: // 2 1
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | O | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 4: // 2 4
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 5: // 2 5
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 6: // 2 6
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "----------" + "\n" +
                                " O | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO26 = scanner.nextInt();
                        switch (graczO26){
                            case 1: // 2 6 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X" + "\n" +
                                        "----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 2 6 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 2 6 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 2 6 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 7: // 2 7
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 8: // 2 8
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | O" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            case 3: // 3
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " 1 | 2 | O" + "\n" +
                        "-----------" + "\n" +
                        " 4 | X | 5" + "\n" +
                        "-----------" + "\n" +
                        " X | 7 | 8" + "\n" +
                        "Twój ruch: ");

                int graczO3 = scanner.nextInt();
                switch (graczO3){
                    case 1: // 3 1
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | X | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Twój ruch: ");

                        int graczO31 = scanner.nextInt();
                        switch (graczO31){
                            case 4: // 3 1 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 8" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 3 1 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 8" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 3 1 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | 8" + "\n" +
                                        "Twój ruch: ");

                                int graczO317 = scanner.nextInt();
                                switch (graczO317){
                                    case 5: // 3 1 7 5
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | O | X" + "\n" +
                                                "Gra zakończona, remis");
                                        break;
                                    case 8: // 3 1 7 8
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | O | O" + "\n" +
                                                "Gra zakończona, wygrał gracz X");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            case 8: // 3 1 8
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 2: // 3 2
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " X | O | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Twój ruch: ");

                        int graczO32 = scanner.nextInt();
                        switch (graczO32){
                            case 4: // 3 2 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 3 2 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7:// 3 2 7
                                System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 8: // 3 2 8
                                System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 4: // 3 4
                        System.out.print("\n" + "\n" +"Runda 2:" + "\n" +
                                " 1 | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO34 = scanner.nextInt();
                        switch (graczO34){
                            case 1: // 3 4 1
                                System.out.print("\n" + "\n" +"Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 2: // 3 4 2
                                System.out.print("\n" + "\n" +"Runda 3:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 3 4 5
                                System.out.print("\n" + "\n" +"Runda 3:" + "\n" +
                                        " 1 | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 3 4 7
                                System.out.print("\n" + "\n" +"Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                    case 5: // 3 5
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO35 = scanner.nextInt();
                        switch (graczO35){
                            case 1: // 3 5 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 2: // 3 5 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 3 5 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 3 5 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 7: // 3 7
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " X | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Twój ruch: ");

                        int graczO37 = scanner.nextInt();
                        switch (graczO37){
                            case 2: // 3 7 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 3 7 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 3 7 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 8: // 3 7 8
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 8: // 3 8
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | X" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | O" + "\n" +
                                "Twój ruch: ");

                        int graczO38 = scanner.nextInt();
                        switch (graczO38){
                            case 1: // 3 8 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 2: // 3 8 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O| O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 3 8 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | 7 | O" + "\n" +
                                        "Twój ruch: ");

                                int graczO384 = scanner.nextInt();
                                switch (graczO384){
                                    case 1: // 3 8 4 1
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "Gra zakończona, wygrał gracz X.");
                                        break;
                                    case 7: // 3 8 4 7
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | O | O" + "\n" +
                                                "Gra zakończona, remis.");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            case 7: // 3 8 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            case 4: // 4
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " 1 | 2 | 3" + "\n" +
                        "-----------" + "\n" +
                        " O | X | 5" + "\n" +
                        "-----------" + "\n" +
                        " X | 7 | 8" + "\n" +
                        "Twój ruch: ");

                int graczO4 = scanner.nextInt();
                switch (graczO4){
                    case 1: // 4 1
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 2: // 4 2
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 3: // 4 3
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO43 = scanner.nextInt();
                        switch (graczO43){
                            case 1: // 4 3 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 2: // 4 3 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 4 3 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 4 3 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 5: // 4 5
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 7: // 4 7
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 8: // 4 8
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | O" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            case 5: // 5
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " 1 | 2 | 3" + "\n" +
                        "-----------" + "\n" +
                        " 4 | X | O" + "\n" +
                        "-----------" + "\n" +
                        " X | 7 | 8" + "\n" +
                        "Twój ruch: ");

                int graczO5 = scanner.nextInt();
                switch (graczO5){
                    case 1: // 5 1
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    case 2: // 5 2
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    case 3: // 5 3
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | X" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");

                        int gracz053 = scanner.nextInt();
                        switch (gracz053){
                            case 1: // 5 3 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X. ");
                                break;
                            case 2: // 5 3 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X. ");
                                break;
                            case 4: // 5 3 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X. ");
                                break;
                            case 7: // 5 3 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X. ");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 4: // 5 4
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    case 7: // 5 7
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    case 8: // 5 8
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | 7 | O" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
            case 6: // 6
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " 1 | 2 | X" + "\n" +
                        "-----------" + "\n" +
                        " 4 | X | 5" + "\n" +
                        "-----------" + "\n" +
                        " O | 7 | 8" + "\n" +
                        "Twój ruch: ");

                int graczO6 = scanner.nextInt();
                switch (graczO6){
                    case 1: // 6 1
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " X | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " O | 7 | 8" + "\n" +
                                "Twój ruch: ");

                        int graczO61 = scanner.nextInt();
                        switch (graczO61){
                            case 2: // 6 1 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | 8" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 6 1 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 8" + "\n" +
                                        "Twój ruch: ");

                                int graczO615 = scanner.nextInt();
                                switch (graczO615){
                                    case 2: // 6 1 5 2
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | O | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | X" + "\n" +
                                                "Gra zakończona, remis.");
                                        break;
                                    case 8: // 6 1 5 8
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | O" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | O" + "\n" +
                                                "Gra zakończona, wygrał gracz X.");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            case 7: // 6 1 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | 8" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 8: // 6 1 8
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 2: // 6 2
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " O | 7 | X" + "\n" +
                                "Twój ruch: ");

                        int graczO62 = scanner.nextInt();
                        switch (graczO62){
                            case 1: // 6 2 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 6 2 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 6 2 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 6 2 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 4: // 6 4
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " X | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " O | 7 | 8" + "\n" +
                                "Twój ruch: ");

                        int graczO64 = scanner.nextInt();
                        switch (graczO64){
                            case 2: // 6 4 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 6 4 5   
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 6 4 7   
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 8: // 6 4 8   
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 5: // 6 5
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " X | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " O | 7 | 8" + "\n" +
                                "Twój ruch: ");

                        int graczO65 = scanner.nextInt();
                        switch (graczO65){
                            case 2: // 6 5 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 6 5 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 6 5 7
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 8: // 6 5 8
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | 7 | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 7: // 6 7
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " O | O | X" + "\n" +
                                "Twój ruch: ");

                        int graczO67 = scanner.nextInt();
                        switch (graczO67) {
                            case 1: // 6 7 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 2: // 6 7 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 6 7 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 6 7 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 8: // 6 8
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " O | X | O" + "\n" +
                                "Twój ruch: ");

                        int graczO68 = scanner.nextInt();
                        switch (graczO68){
                            case 1: // 6 8 1
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " O | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 2: // 6 8 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | O | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "Twój ruch");
                                int graczO682 = scanner.nextInt();
                                switch (graczO682){
                                    case 1: // 6 8 2 1
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " O | O | X" + "\n" +
                                                "-----------" + "\n" +
                                                " X | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | O" + "\n" +
                                                "Gra zakończona, wygrał gracz X.");
                                        break;
                                    case 4: // 6 8 2 4
                                        System.out.print("\n" + "\n" + "Runda 4:" + "\n" +
                                                " X | O | X" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | X" + "\n" +
                                                "-----------" + "\n" +
                                                " O | X | O" + "\n" +
                                                "Gra zakończona, remis.");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            case 4: // 6 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 6 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " 1 | X | X" + "\n" +
                                        "-----------" + "\n" +
                                        " 4 | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            case 7: // 7
                System.out.print("\n" + "\n" + "Runda 1:" + "\n" +
                        " 1 | 2 | 3" + "\n" +
                        "-----------" + "\n" +
                        " 4 | X | 5" + "\n" +
                        "-----------" + "\n" +
                        " X | O | 8" + "\n" +
                        "Twój ruch: ");

                int graczO7 = scanner.nextInt();
                switch (graczO7){
                    case 1: // 7 1
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " O | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    case 2: // 7 2
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | O | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");
                        break;
                    case 3: // 7 3
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " X | 2 | O" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X. ");

                        int graczO73 = scanner.nextInt();
                        switch (graczO73){
                            case 2: // 7 3 2
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | O | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | 8" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 7 3 4
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " O | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | X" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 5: // 7 3 5
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | 8" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 8: // 7 3 8
                                System.out.print("\n" + "\n" + "Runda 3:" + "\n" +
                                        " X | 2 | O" + "\n" +
                                        "-----------" + "\n" +
                                        " X | X | 5" + "\n" +
                                        "-----------" + "\n" +
                                        " X | O | O" + "\n" +
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 4: // 7 4
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " O | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 5: // 7 5
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | O" + "\n" +
                                "-----------" + "\n" +
                                " X | O | 8" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    case 8: // 7 8
                        System.out.print("\n" + "\n" + "Runda 2:" + "\n" +
                                " 1 | 2 | X" + "\n" +
                                "-----------" + "\n" +
                                " 4 | X | 5" + "\n" +
                                "-----------" + "\n" +
                                " X | O | O" + "\n" +
                                "Gra zakończona, wygrał gracz X.");
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            case 8: // 8
                System.out.print("\n" + "\n" + "Runda 1:" +"\n"+
                        " X | 2 | 3"+"\n"+
                        "-----------"+"\n"+
                        " 4 | X | 5"+"\n"+
                        "-----------"+"\n"+
                        " 6 | 7 | O"+"\n"+
                        "Twój ruch: ");

                int graczO8 = scanner.nextInt();
                switch (graczO8){
                    case 2: // 8 2
                        System.out.print("\n" + "\n" + "Runda 2:" +"\n"+
                                " X | O | 3"+"\n"+
                                "-----------"+"\n"+
                                " 4 | X | 5"+"\n"+
                                "-----------"+"\n"+
                                " X | 7 | O"+"\n"+
                                "Twój ruch: ");

                        int graczO82 = scanner.nextInt();
                        switch (graczO82){
                            case 3: // 8 2 3
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 4: // 8 2 4
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X" );
                                break;
                            case 5: // 8 2 5
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 7: // 8 2 7
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 3: // 8 3
                        System.out.print("\n" + "\n" + "Runda 2:" +"\n"+
                                " X | 2 | O"+"\n"+
                                "-----------"+"\n"+
                                " 4 | X | X"+"\n"+
                                "-----------"+"\n"+
                                " 6 | 7 | O"+"\n"+
                                "Twój ruch: ");

                        int graczO83 = scanner.nextInt();
                        switch (graczO83){
                            case 2: // 8 3 2
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | X | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 6 | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 4: // 8 3 4
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | O"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 6 | X | O"+"\n"+
                                        "Twój ruch: ");

                                int graczO834 = scanner.nextInt();
                                switch (graczO834){
                                    case 2: // 8 3 4 2
                                        System.out.print("\n" + "\n" + "Runda 4:" +"\n"+
                                                " X | O | O"+"\n"+
                                                "-----------"+"\n"+
                                                " O | X | X"+"\n"+
                                                "-----------"+"\n"+
                                                " X | X | O"+"\n"+
                                                "Gra zakończona, remis.");
                                        break;
                                    case 6: // 8 3 4 6
                                        System.out.print("\n" + "\n" + "Runda 4:" +"\n"+
                                                " X | X | O"+"\n"+
                                                "-----------"+"\n"+
                                                " O | X | X"+"\n"+
                                                "-----------"+"\n"+
                                                " O | X | O"+"\n"+
                                                "Gra zakończona, wygrał gracz X");
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                            case 6: // 8 3 6
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | X | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 7: // 6 3 7
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | X | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 6 | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 4: // 8 4
                        System.out.print("\n" + "\n" + "Runda 2:" +"\n"+
                                " X | 2 | X"+"\n"+
                                "-----------"+"\n"+
                                " O | X | 5"+"\n"+
                                "-----------"+"\n"+
                                " 6 | 7 | O"+"\n"+
                                "Twój ruch: ");

                        int graczO84 = scanner.nextInt();
                        switch (graczO84){
                            case 2: // 8 4 2
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 5: // 8 4 5
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 6: // 8 4 6
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | X | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " O | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 7: // 8 4 7
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 5: // 8 5
                        System.out.print("\n" + "\n" + "Runda 2:" +"\n"+
                                " X | 2 | X"+"\n"+
                                "-----------"+"\n"+
                                " 4 | X | O"+"\n"+
                                "-----------"+"\n"+
                                " 6 | 7 | O"+"\n"+
                                "Twój ruch: ");

                        int graczO85 = scanner.nextInt();
                        switch (graczO85){
                            case 2: // 8 5 2
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 4: // 8 5 4
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " 6 | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 6: // 8 5 6
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " 6 | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            case 7: // 8 5 7
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " 6 | 7 | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X.");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    case 6: // 8 6
                        System.out.print("\n" + "\n" + "Runda 2:" +"\n"+
                                " X | 2 | 3"+"\n"+
                                "-----------"+"\n"+
                                " 4 | X | 5"+"\n"+
                                "-----------"+"\n"+
                                " O | X | O"+"\n"+
                                "Twój ruch: ");

                        int graczO86 = scanner.nextInt();
                        switch (graczO86){
                            case 2: // 8 6 2
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | 3"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | O"+"\n"+
                                        "Twój ruch: ");

                                int graczO862 = scanner.nextInt();
                                switch (graczO862){
                                    case 3: // 8 6 2 3
                                        System.out.print("\n" + "\n" + "Runda 4:" +"\n"+
                                                " X | O | O"+"\n"+
                                                "-----------"+"\n"+
                                                " X | X | X"+"\n"+
                                                "-----------"+"\n"+
                                                " O | X | O"+"\n"+
                                                "Gra zakończona, wygrał gracz X");
                                        break;
                                    case 4: // 8 6 2 4
                                        System.out.print("\n" + "\n" + "Runda 4:" +"\n"+
                                                " X | O | X"+"\n"+
                                                "-----------"+"\n"+
                                                " O | X | X"+"\n"+
                                                "-----------"+"\n"+
                                                " O | X | O"+"\n"+
                                                "Gra zakończona, remis." );
                                        break;
                                    default: System.out.println("Nie można wykonać takiego ruchu");
                                        break;
                                }
                                break;
                            case 3: // 8 6 3
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 4: // 8 6 4
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | X | 3"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 5: // 8 6 5
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | X | 3"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                    case 7:// 8 7
                        System.out.print("\n" + "\n" + "Runda 2:" +"\n"+
                                " X | 2 | 3"+"\n"+
                                "-----------"+"\n"+
                                " 4 | X | 5"+"\n"+
                                "-----------"+"\n"+
                                " X | O | O"+"\n"+
                                "Twój ruch: ");

                        int graczO87 = scanner.nextInt();
                        switch (graczO87){
                            case 2: // 8 7 2
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | O | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 3: // 8 7 3
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 4: // 8 7 4
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " O | X | 5"+"\n"+
                                        "-----------"+"\n"+
                                        " X | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            case 5: // 8 7 5
                                System.out.print("\n" + "\n" + "Runda 3:" +"\n"+
                                        " X | 2 | X"+"\n"+
                                        "-----------"+"\n"+
                                        " 4 | X | O"+"\n"+
                                        "-----------"+"\n"+
                                        " X | O | O"+"\n"+
                                        "Gra zakończona, wygrał gracz X");
                                break;
                            default: System.out.println("Nie można wykonać takiego ruchu");
                                break;
                        }
                        break;
                    default: System.out.println("Nie można wykonać takiego ruchu");
                        break;
                }
                break;
            default: System.out.println("Nie można wykonać takiego ruchu");
                break;
        }
    }
}

