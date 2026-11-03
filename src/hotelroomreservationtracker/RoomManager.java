 
package hotelroomreservationtracker;
 
public class RoomManager {
    
  
    private Room[] rooms = new Room[20];

 
    private int roomCount = 0;
    
  
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
         public String displayRooms() {

        String result = "";

        for (int i = 0; i < roomCount; i++) {

            result += "Room Number: " + rooms[i].getRoomNumber() + "\n";
            result += "Guest Name: " + rooms[i].getGuestName() + "\n";
            result += "Status: " + rooms[i].getStatus() + "\n";

            result += "--------------------\n";
        }

        return result;
         }
    
    public Room searchRoom(int roomNumber) {

      
    
