void main() {
    //1
    Scanner sc = new Scanner(System.in);

    System.out.print("Podaj liczbę: ");
    int liczba1 = sc.nextInt();

    for(int i = 1; i<=liczba1; i+=2){
        if(i%2==1){
            System.out.print(i+", ");
        }
    }

    //2
    System.out.print("Podaj liczbę: ");
    int liczba2 = sc.nextInt();

    int potega = 1;

    while(potega <= liczba2){
        System.out.println(potega);
        potega *= 2;
    }
}
