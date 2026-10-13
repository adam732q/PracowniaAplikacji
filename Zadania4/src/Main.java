void main() {
    //Zadanie 1
    int[] tab1 = {5,10,15,20,25,30};
    int[] tab2 = {1,2,3,4,5};

    System.out.println("Co drugi elelment pierwszej tablicy: ");

    for (int i = 0; i < tab1.length; i += 2) {
        System.out.println(tab1[i]);
    }

    System.out.println("Co drugi element drugiej tablicy: ");

    for (int i = 0; i < tab2.length; i += 2) {
        System.out.println(tab2[i]);
    }

    //Zadanie 2
    int[] tab = {3,5,71,9,22,1,26,45};

    int najwieksza = tab[0];

    for(int i = 1; i < tab.length; i++){
        if(tab[i] > najwieksza){
            najwieksza = tab[i];
        }
    }
    System.out.println("Najwiekszy element tablicy to: "+ najwieksza);


    //Zadanie 3
    String[] tab3 = {"ala","ma","kota"};

    for(String slowo : tab3){
        System.out.println(slowo.toUpperCase());
    }


    //Zadanie 4
    Scanner sc = new Scanner(System.in);

    String[] slowa2 = new String[5];

    for(int i = 0; i < slowa2.length; i++){
        System.out.print("Podaj slowo: ");
        slowa2[i] = sc.nextLine();
    }

    System.out.println("Slowa od konca:");

    for(int i = slowa2.length - 1; i >= 0; i--){

        for(int j = slowa2[i].length() - 1; j >= 0; j--){
            System.out.print(slowa2[i].charAt(j));
        }

        System.out.println();
    }

    //Zadanie 5
    int[] liczby = new int[8];

    for(int i = 0; i < liczby.length; i++){
        System.out.print("Podaj liczbe: ");
        liczby[i] = sc.nextInt();
    }

    for(int i = 0; i < liczby.length - 1; i++){

        for(int j = 0; j < liczby.length - 1 - i; j++){

            if(liczby[j] > liczby[j + 1]){

                int temp = liczby[j];
                liczby[j] = liczby[j + 1];
                liczby[j + 1] = temp;
            }
        }
    }
    System.out.println("Posortowana tablica:");

    for(int i = 0; i < liczby.length; i++){
        System.out.print(liczby[i] + " ");
    }
    System.out.println();

    // Zadanie 6
    Scanner sc6 = new Scanner(System.in);

    int[] liczby6 = new int[5];

    for(int i = 0; i < liczby6.length; i++){
        System.out.print("Podaj liczbe: ");
        liczby6[i] = sc6.nextInt();
    }

    for(int i = 0; i < liczby6.length; i++){

        int silnia = 1;

        for(int j = 1; j <= liczby6[i]; j++){
            silnia = silnia * j;
        }

        System.out.println("Silnia z " + liczby6[i] + " = " + silnia);
    }


// Zadanie 7
    String[] tab7a = {"ala", "ma", "kota"};
    String[] tab7b = {"ala", "ma", "kota"};

    boolean takieSame = true;

    for(int i = 0; i < tab7a.length; i++){

        if(!tab7a[i].equals(tab7b[i])){
            takieSame = false;
        }
    }

    if(takieSame){
        System.out.println("Tablice sa takie same.");
    }
    else{
        System.out.println("Tablice nie sa takie same.");
    }

    // Zadanie 8
    int[] liczby8 = new int[10];

    int suma = 0;

    for(int i = 0; i < liczby8.length; i++){
        liczby8[i] = (int)(Math.random() * 21) - 10;
        suma = suma + liczby8[i];
    }

    System.out.println("Zawartosc tablicy:");

    for(int i = 0; i < liczby8.length; i++){
        System.out.print(liczby8[i] + " ");
    }

    System.out.println();

    int min = liczby8[0];
    int max = liczby8[0];

    for(int i = 0; i < liczby8.length; i++){

        if(liczby8[i] < min){
            min = liczby8[i];
        }

        if(liczby8[i] > max){
            max = liczby8[i];
        }
    }

    double srednia = (double)suma / liczby8.length;

    int mniejsze = 0;
    int wieksze = 0;

    for(int i = 0; i < liczby8.length; i++){

        if(liczby8[i] < srednia){
            mniejsze++;
        }

        if(liczby8[i] > srednia){
            wieksze++;
        }
    }

    System.out.println("Najmniejszy element: " + min);
    System.out.println("Najwiekszy element: " + max);
    System.out.println("Srednia: " + srednia);
    System.out.println("Elementy mniejsze od sredniej: " + mniejsze);
    System.out.println("Elementy wieksze od sredniej: " + wieksze);

    System.out.println("Tablica od konca:");

    for(int i = liczby8.length - 1; i >= 0; i--){
        System.out.print(liczby8[i] + " ");
    }

    System.out.println();

}