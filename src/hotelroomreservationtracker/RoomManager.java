 
package hotelroomreservationtracker;
 
public class RoomManager {
    
    // Array to store room records
    private Room[] rooms = new Room[20];

    // Counts how many rooms are currently stored
    private int roomCount = 0;
    
      // Add a room to the array
    public boolean addRoom(Room room) {

          if (room == null || searchRoom(room.getRoomNumber()) != null) {
        return false;
    }
        
        if (roomCount < rooms.length) {
            rooms[roomCount] = room;
            roomCount++;
            return true;
        }

        return false;
    }
        
         public Room searchRoom(int roomNumber) {

        
    

