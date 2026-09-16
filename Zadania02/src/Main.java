void main() {
    //1
    Scanner sc = new Scanner(System.in);
    System.out.print("Podaj liczbe: ");
    int liczba = sc.nextInt();
    if(liczba%3==0){
        System.out.println("Twoja Liczba jest podzielna przez 3");
    }else{
        System.out.println("Twoja liczba nie jest podzielna przez 3");
    }

    //2
    Scanner sc2 = new Scanner(System.in);

    System.out.print("Podaj 1 bok trójkąta: ");
    int bok1 = sc2.nextInt();

    System.out.print("Podaj 2 bok trójkąta: ");
    int bok2 = sc2.nextInt();

    System.out.print("Podaj 3 bok trójkąta: ");
    int bok3 = sc2.nextInt();

    if(bok1 + bok2 >= bok3 && bok1 + bok3 >= bok2 && bok2 + bok3 >= bok1){
        System.out.println("Z twoich liczb można zbudować trójkąt");
    }else{
        System.out.println("Z twoich liczb niemożna zbudować trójkąta");
    }

    //3
    Scanner sc3 = new Scanner(System.in);

    System.out.print("Podaj liczbe: ");
    int a = sc3.nextInt();

    System.out.print("Podaj liczbe: ");
    int b = sc3.nextInt();

    if(a>b){
        System.out.println("Większe jest: "+a);
    }else if(b>a){
        System.out.println("Większe jest: "+b);
    }

    //4
    Scanner sc4 = new Scanner(System.in);

    System.out.print("Podaj liczbe: ");
    int a2 = sc4.nextInt();

    System.out.print("Podaj liczbe: ");
    int b2 = sc4.nextInt();

    System.out.print("Podaj liczbe: ");
    int c2 = sc4.nextInt();

    int najwieksza = a2;

    if(b2>najwieksza){
        najwieksza = b2;
    }
    if(c2>najwieksza){
        najwieksza = c2;
    }

    System.out.println("Najwieksza liczba to " + najwieksza);

    //5
    Scanner sc5 = new Scanner(System.in);

    System.out.print("Podaj numer miesiaca: ");
    int miesiac = sc5.nextInt();

    String nazwa = switch(miesiac){
        case 1 -> "Styczen";
        case 2 -> "Luty";
        case 3 -> "Marzec";
        case 4 -> "Kwiecien";
        case 5 -> "Maj";
        case 6 -> "Czerwiec";
        case 7 -> "Lipiec";
        case 8 -> "Sierpien";
        case 9 -> "Wrzesien";
        case 10 -> "Pazdziernik";
        case 11 -> "Listopad";
        case 12 -> "Grudzien";
        default -> "Nieprawidlowy numer miesiaca";
    };
    System.out.println(nazwa);

    //6
    Scanner sc6 = new Scanner(System.in);

    System.out.print("Podaj imie: ");
    String imie = sc6.next();

    String mojeImie = "Adam";
    if(imie.equals(mojeImie)){
        System.out.println("Masz takie samo imie jak ja");
    }else{
        System.out.println("Masz inne imie niż ja");
    }

    //7
    Scanner sc7 = new Scanner(System.in);

    System.out.print("Podaj swój wiek: ");
    int wiek = sc7.nextInt();

    boolean pelnolotni = wiek>=18 ? true : false;

    System.out.println("Pełnoletni: " + pelnolotni);

    //8
    Scanner sc8 = new Scanner(System.in);

    System.out.print("Podaj rok: ");
    int rok = sc8.nextInt();

    if((rok%4==0 && rok%100!=0) || rok%400==0){
        System.out.println("Rok przestępny");
    }else{
        System.out.println("Rok nieprzestępny");
    }

    //9
    Scanner sc9 = new Scanner(System.in);

    System.out.print("Podaj swoją wagę: ");
    double waga = sc9.nextDouble();

    System.out.print("Podaj swój wzrost w metrach: ");
    double wzrost = sc9.nextDouble();

    double bmi = waga / (wzrost * wzrost);

    System.out.println("BMI: " + bmi);

    if(bmi < 18.5){
        System.out.println("Niedowaga");
    }else if(bmi <= 24.9){
        System.out.println("Waga prawidłowa");
    }else{
        System.out.println("Nadwaga");
    }

    //10
    Scanner sc10 = new Scanner(System.in);

    double cena;
    int raty;

    do {
        System.out.print("Podaj cenę towaru (100-10000 zł): ");
        cena = sc10.nextDouble();
    } while(cena < 100 || cena > 10000);

    do {
        System.out.print("Podaj liczbę rat (6-48): ");
        raty = sc10.nextInt();
    } while(raty < 6 || raty > 48);

    double oprocentowanie;

    if(raty <= 12){
        oprocentowanie = 0.025;
    }else if(raty <= 24){
        oprocentowanie = 0.05;
    }else{
        oprocentowanie = 0.10;
    }

    double rata = (cena + cena * oprocentowanie) / raty;

    System.out.println("Miesięczna rata: " + rata + " zł");

    //11
    Scanner sc11 = new Scanner(System.in);

    System.out.println("Prosty kalkulator");

    System.out.print("Podaj pierwszą liczbę: ");
    double a = sc11.nextDouble();

    System.out.print("Podaj działanie (+, -, *, /): ");
    char dzialanie = sc11.next().charAt(0);

    System.out.print("Podaj drugą liczbę: ");
    double b = sc11.nextDouble();

    switch(dzialanie){
        case '+':
            System.out.println("Wynik: " + (a + b));
            break;

        case '-':
            System.out.println("Wynik: " + (a - b));
            break;

        case '*':
            System.out.println("Wynik: " + (a * b));
            break;

        case '/':
            if(b == 0){
                System.out.println("Nie można dzielić przez zero");
            }else{
                System.out.println("Wynik: " + (a / b));
            }
            break;

        default:
            System.out.println("Błędny symbol działania");
    }
}