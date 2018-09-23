public class LiczbyParzyste {

    public static void main(String[] args) {

        int[] tablica = new int[101];
        int i = 0;
        int suma = 0;



        while (i <= tablica.length){

            if (i%2 != 0) {

                i++; continue;
            }
            tablica[i] = i;
            System.out.println(tablica[i]);
            suma = suma + tablica[i];
            i++;
        }
        System.out.println("Suma elementow tablicy wynosi: " + suma);


    }

}
