import java.util.Random;

void main() {

    Scanner sc = new Scanner(System.in);

    //1
    System.out.print("Podaj liczbe: ");
    int liczba = sc.nextInt();

    for(int i = 1; i <= liczba; i += 2){
        System.out.println(i);
    }


    //2
    System.out.print("Podaj liczbe: ");
    int n = sc.nextInt();

    int potega = 1;

    while(potega <= n){
        System.out.println(potega);
        potega = potega * 2;
    }


    //3
    int suma = 0;
    int liczba2;

    System.out.print("Podaj liczbe: ");
    liczba2 = sc.nextInt();

    while(liczba2 != 0){
        suma = suma + liczba2;

        System.out.print("Podaj liczbe: ");
        liczba2 = sc.nextInt();
    }

    System.out.println("Suma = " + suma);


    //4
    int liczba4;
    int suma4 = 0;
    int ilosc = 0;
    int najmniejsza = 0;
    int najwieksza2 = 0;

    System.out.print("Podaj liczbe: ");
    liczba4 = sc.nextInt();

    if(liczba4 != 0){
        najmniejsza = liczba4;
        najwieksza2 = liczba4;
    }

    while(liczba4 != 0){

        suma4 = suma4 + liczba4;
        ilosc++;

        if(liczba4 < najmniejsza){
            najmniejsza = liczba4;
        }

        if(liczba4 > najwieksza2){
            najwieksza2 = liczba4;
        }

        System.out.print("Podaj liczbe: ");
        liczba4 = sc.nextInt();
    }

    double srednia = (double)suma4 / ilosc;
    suma4 = najmniejsza + najwieksza2;

    System.out.println("Najmniejsza liczba = " + najmniejsza);
    System.out.println("Najwieksza liczba = " + najwieksza2);
    System.out.println("Suma najmniejszej i najwiekszej = " + suma4);
    System.out.println("Srednia arytmetyczna = " + srednia);

    //5
    Random random = new Random();

    int wylosowana = random.nextInt(100) + 1;
    int liczba5;

    System.out.print("Zgadnij liczbe: ");
    liczba5 = sc.nextInt();

    while(liczba5 != wylosowana){

        if(liczba5 > wylosowana){
            System.out.println("Podales za duza wartosc");
        }

        if(liczba5 < wylosowana){
            System.out.println("Podales za mala wartosc");
        }

        System.out.print("Podaj liczbe: ");
        liczba5 = sc.nextInt();
    }

    System.out.println("Gratulacje");

    //6
    System.out.print("Podaj znak: ");
    char znak = sc.next().charAt(0);

    System.out.print("Podaj x: ");
    int x = sc.nextInt();

    System.out.print("Podaj y: ");
    int y = sc.nextInt();

    System.out.print("Podaj a: ");
    int a = sc.nextInt();

    System.out.print("Podaj b: ");
    int b = sc.nextInt();

    for(int i = 1; i < y; i++){
        System.out.println();
    }

    for(int i = 0; i < b; i++){

        for(int j = 1; j < x; j++){
            System.out.print(" ");
        }

        for(int j = 0; j < a; j++){
            System.out.print(znak);
        }

        System.out.println();
    }

}
