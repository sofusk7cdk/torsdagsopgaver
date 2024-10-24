

public class Main {

    public static void main(String[] args) {
        // Initialiserer biografen med 20 rækker og 10 sæder
        Cinema biogrande = new Cinema(20, 10);

        // Reserverer række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Printer hele biografens sædeoversigt
        System.out.println(biogrande);

        // Reserverer det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        // Fejl 2: Indekser starter fra 0, så vi skal bruge -1 for at reservere det sidste sæde
        biogrande.reserve(numberOfRows - 1, numberOfSeats - 1);

        // Afbestiller reservationen på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));
    }
}
