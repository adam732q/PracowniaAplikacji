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

    if(bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1){
        System.out.println("Z twoich liczb można zbudować trójkąt");
    }else{
        System.out.println("Z twoich liczb niemożna zbudować trójkąta");
    }
}