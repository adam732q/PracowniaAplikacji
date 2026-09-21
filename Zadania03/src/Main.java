void main() {
    //1
    Scanner sc = new Scanner(System.in);

    System.out.print("Podaj liczbę: ");
    int liczba = sc.nextInt();

    for(int i = 1; i <= liczba; i += 2){
        System.out.println(i);
    }
}
