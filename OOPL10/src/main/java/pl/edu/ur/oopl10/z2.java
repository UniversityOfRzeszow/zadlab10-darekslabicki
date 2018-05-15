package pl.edu.ur.oopl10;

public class z2 {

    public static void main(String[] args) {
        int[] tab = new int[10];
        try {
            for (int i = 0; i < 11; i++) {
                tab[i] = 0;
            }
            }catch(ArrayIndexOutOfBoundsException e){
                    System.err.println("Wyszedles poza rozmiar tablicy");
                    }
        }
    }


