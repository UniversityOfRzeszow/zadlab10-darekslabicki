package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class z5 {

    static Scanner x = new Scanner(System.in);

    public static void wprowadzInt() {
        System.out.println("Podaj liczbe: ");
        try {
            int y = x.nextInt();
        } catch (Exception e) {
            System.err.println("Nie jest to liczba (int)");
        }
    }

    public static void wprowadzLong() {
        System.out.println("Podaj liczbe: ");
        try {
            long y = x.nextLong();
        } catch (Exception e) {
            System.err.println("Nie jest to liczba (long)");
        }
    }

    public static void wprowadzString() {
        System.out.println("Podaj liczbe: ");
        try {
            String y = x.nextLine();
        } catch (Exception e) {
            System.err.println("Nie jest to tekst (string)");
        }
    }

    public static void wprowadzDouble() {
        System.out.println("Podaj liczbe: ");
        try {
            double y = x.nextDouble();
        } catch (Exception e) {
            System.err.println("Nie jest to liczba (double)");
        }
    }

    public static void zapiszInt(int liczba) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("int.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(liczba));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Nieudana proba zapisu do pliku!");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Nieudana proba zapisu do pliku!");
            }
        }
    }

    public static void zapiszString(String napis) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("String.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(napis);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Nieudana proba zapisu do pliku!");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Nieudana proba zapisu do pliku!");
            }
        }
    }

    public static void zapiszDouble(double liczba) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("double.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(liczba));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Nieudana proba zapisu do pliku!");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Nieudana proba zapisu do pliku!");
            }
        }
    }

    public static void odczytajInt() {
        FileReader fr = null;
        try {
            fr = new FileReader("int.txt");
            BufferedReader br = new BufferedReader(fr);
            String stringRead = "";
            System.out.println("Zawartosc pliku:");
            while (stringRead != null) {
                stringRead = br.readLine();
                System.out.println(stringRead);                
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
            }
        }
    }

    public static void odczytajString() {
        FileReader fr = null;
        try {
            fr = new FileReader("String.txt");
            BufferedReader br = new BufferedReader(fr);
            String stringRead = "";
            System.out.println("Zawartosc pliku:");
            while (stringRead != null) {
                stringRead = br.readLine();
                System.out.println(stringRead);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
            }
        }
    }

    public static void odczytajDouble() {
        FileReader fr = null;
        try {
            fr = new FileReader("double.txt");
            BufferedReader br = new BufferedReader(fr);
            String stringRead = "";
            System.out.println("Zawartosc pliku:");
            while (stringRead != null) {
                stringRead = br.readLine();
                System.out.println(stringRead);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
            }
        }
    }

}
