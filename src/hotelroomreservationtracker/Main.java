
package hotelroomreservationtracker;


public class Main {
    public static void main(String[] args) {

        RoomManager manager = new RoomManager();

      
        manager.addRoom(new StandardRoom(101, "Single Bed"));
        manager.addRoom(new StandardRoom(102, "Double Bed"));
        manager.addRoom(new DeluxeRoom(201, "Ocean View"));
        manager.addRoom(new DeluxeRoom(202, "City View"));

       
        System.out.println("HOTEL ROOM LIST");
        System.out.println(manager.displayRooms());

        
        Room found = manager.searchRoom(101);

        if (found != null) {
            System.out.println("Room 101 found!");
        } else {
            System.out.println("Room not found!");
        }

        manager.assignRoom(101, "Ana");

        System.out.println("\nAFTER ASSIGNING ROOM 101");
        System.out.println(manager.displayRooms());

         
    }
}

