

public class Cinema {
    String[][] seats;

    // Konstruktøren initialiserer biografen med et antal rækker og sæder.
    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien "X".
    // Sæder, der ikke er reserveret, har værdien "O".
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats]; // Fejl 1: Array skal initialiseres først

        // Fejl 5: Vi skal først initialisere alle sæder til "O"
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";  // Alle sæder starter som ledige ("O")
            }
        }

        // Fejl 5: Derefter reserverer vi direktørens sæde
        this.seats[0][0] = "X";  // Række 0, sæde 0 reserveres til direktøren
    }

    // Returnerer antal rækker
    public int getRows() {
        return seats.length;
    }

    // Returnerer antal sæder i hver række
    public int getSeats() {
        return seats[0].length;
    }

    // Reserverer et sæde, hvis det er ledigt ("O").
    // Ændrer værdien til "X" (reserveret) og returnerer true.
    // Hvis sædet allerede er reserveret ("X"), returneres false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {  // Tjekker om sædet er ledigt
            seats[row][seat] = "X";  // Reserverer sædet
            return true;
        }
        return false;  // Sædet er allerede reserveret
    }

    // Afbestiller en reservation ved at ændre værdien fra "X" til "O".
    // Returnerer true, hvis reservationen blev afbestilt, ellers false.
    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {  // Fejl 3: Retter "x" til "X" for korrekt sammenligning
            seats[row][seat] = "O";  // Afbestiller reservationen
            return true;
        }
        return false;  // Sædet var ikke reserveret
    }

    // Returnerer en streng, der repræsenterer hele sædeoversigten i biografen.
    public String toString() {
        String result = ""; // Fejl 4: Initialiserer `result` som en tom streng (ikke `null`)
        for (int i = 0; i < seats.length; i++) {
            result += "|";  // Tilføjer separator for hver række
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";  // Tilføjer hvert sæde til strengen
            }
            result += "\n";  // Ny linje efter hver række
        }
        return result;  // Returnerer den samlede visning af sæderne
    }
}
