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
}