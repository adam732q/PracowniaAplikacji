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
}
