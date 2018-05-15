package pl.edu.ur.oopl10;

import java.util.Scanner;


public class WprowadzZKonsoli {
    static Scanner x=new Scanner(System.in);
    public static void wprowadzInt(){
        System.out.println("Podaj liczbe: ");
        try{
            int y=x.nextInt();
        }catch (Exception e){
            System.err.println("Nie jest to liczba (int)");
        }
    }
    public static void wprowadzLong(){
        System.out.println("Podaj liczbe: ");
        try{
            long y=x.nextLong();
        }catch (Exception e){
            System.err.println("Nie jest to liczba (long)");
        }
    }
    public static void wprowadzString(){
        System.out.println("Podaj liczbe: ");
        try{
            String y=x.nextLine();
        }catch (Exception e){
            System.err.println("Nie jest to tekst");
        }
    }
    public static void wprowadzDouble(){
        System.out.println("Podaj liczbe: ");
        try{
            double y=x.nextDouble();
        }catch (Exception e){
            System.err.println("Nie jest to liczba (double)");
        }
    }
    }
    

