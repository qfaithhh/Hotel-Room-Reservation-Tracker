 //PARENT
package hotelroomreservationtracker;

public class Room {
    
    private int roomNumber;
    private String guestName;
    private String status;
    
    
    // Constructor
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.guestName = "None";
        this.status = "Available";
        
    }
    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getStatus() {
        return status;
    }
       

    }

