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
}
