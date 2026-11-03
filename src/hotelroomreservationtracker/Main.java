
package hotelroomreservationtracker;


public class Main {
    public static void main(String[] args) {

        RoomManager manager = new RoomManager();

        // Add rooms
        manager.addRoom(new StandardRoom(101, "Single Bed"));
        manager.addRoom(new StandardRoom(102, "Double Bed"));
        manager.addRoom(new DeluxeRoom(201, "Ocean View"));
        manager.addRoom(new DeluxeRoom(202, "City View"));

        // Display all rooms
        System.out.println("HOTEL ROOM LIST");
        System.out.println(manager.displayRooms());

        // Search for a room
        Room found = manager.searchRoom(101);

        if (found != null) {
            System.out.println("Room 101 found!");
        } else {
            System.out.println("Room not found!");
        }

        // Assign a room
        manager.assignRoom(101, "Ana");

        System.out.println("\nAFTER ASSIGNING ROOM 101");
        System.out.println(manager.displayRooms());

        // Vacate a room
        manager.vacateRoom(101);

        System.out.println("\nAFTER VACATING ROOM 101");
        System.out.println(manager.displayRooms());
    }
}

