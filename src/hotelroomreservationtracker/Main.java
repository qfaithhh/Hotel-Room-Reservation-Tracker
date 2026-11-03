
package hotelroomreservationtracker;


public class Main {
    public static void main(String[] args) {

        RoomManager manager = new RoomManager();

        
        manager.addRoom(new StandardRoom(101, "Single Bed"));
        manager.addRoom(new StandardRoom(102, "Double Bed"));
        manager.addRoom(new DeluxeRoom(201, "Ocean View"));
        manager.addRoom(new DeluxeRoom(202, "City View"));

    }
}

