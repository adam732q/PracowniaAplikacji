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
}