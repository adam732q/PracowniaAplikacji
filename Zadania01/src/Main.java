void main() {
    //1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    //2
    String imie = "Adam";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    //3
    System.out.println("Mam na imię "+imie+", mam "+(2026-rokUrodzenia)+" lat  i będę pisać maturę za "+liczba+" roku.");

    //4
    Scanner sc = new Scanner(System.in);

    System.out.print("Podaj temperaturę na zewnątrz: ");
    double stopnie =sc.nextDouble();
    double farenheit = 1.8 * stopnie + 32.0;
    System.out.println("Temperatura w farenheit: " + farenheit);

    //5
    Scanner sc2 = new Scanner(System.in);

    System.out.print("Podaj długość pierwszego boku trójkąta: ");
    int pierwszy =sc2.nextInt();
    System.out.print("Podaj długość drugiego boku trójkąta: ");
    int drugi =sc2.nextInt();
    System.out.print("Podaj długość trzeciego boku trójkąta: ");
    int trzeci =sc2.nextInt();
    int obwod = pierwszy + drugi + trzeci;
    System.out.println("Obwód trójkąta wynosi: " + obwod);

    //6
    Scanner sc3 = new Scanner(System.in);

    System.out.print("Podaj pierwsze słowo: ");
    String slowo1 =sc3.next();
    System.out.print("Podaj drugie słowo: ");
    String slowo2 =sc3.next();
    System.out.print("Podaj trzecie słowo: ");
    String slowo3 =sc3.next();
    System.out.println(slowo3+", "+slowo2+", "+slowo3);
}
