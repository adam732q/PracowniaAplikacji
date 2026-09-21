void main() {
    //1
    Scanner sc = new Scanner(System.in);

    System.out.print("Podaj liczbę: ");
    int liczba = sc.nextInt();

    for(int i = 1; i <= liczba; i += 2){
        System.out.println(i);
    }

    //2
    System.out.print("Podaj liczbę: ");
    int n = sc.nextInt();

    int potega = 1;

    while(potega <= n){
        System.out.println(potega);
        potega = potega * 2;
    }
}
