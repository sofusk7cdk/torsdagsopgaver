package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(10,4);
        Room room2 = new Room(8,2);
        Room room3 = new Room(18,8);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,4);

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total lamps: " + totalLamps);

        int totalWindows = countWindowsInBuilding(building);
        System.out.println("Total Windows: " + totalWindows);

        int totalRooms = countRoomsInBuilding(building);
        System.out.println("Total rooms: " + totalRooms);

        boolean normal = isNormal(building);
        System.out.println("Building is " + normal);
    }

    private static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    private static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    private static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    private static boolean isNormal(Building building) {

        if(building.getNumberOfFloors() >= countRoomsInBuilding(building)) {
            return true;
        }
        return false;
    }
}