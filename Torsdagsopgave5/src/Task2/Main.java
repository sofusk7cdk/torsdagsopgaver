package Task2;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        cafe.loadMenuData();

        for (String i : cafe.getCoffeeMenu()) {
            System.out.println(i);
        }


    }
}