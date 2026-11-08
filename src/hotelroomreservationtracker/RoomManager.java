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

        for (int i = 0; i < roomCount; i++) {

            if (rooms[i].getRoomNumber() == roomNumber) {
                return rooms[i];
            }
        }

        return null;
    }

    // Guest Name Validation
    private boolean isValidGuestName(String guestName) {

        if (guestName == null || guestName.trim().isEmpty()) {
            return false;
        }

        String name = guestName.trim();

        for (int i = 0; i < name.length(); i++) {

            char character = name.charAt(i);

            if (!Character.isLetter(character)
                    && !Character.isWhitespace(character)
                    && character != '-'
                    && character != '\''
                    && character != '.') {

                return false;
            }
        }

        return true;
    }

    public boolean assignRoom(int roomNumber, String guestName) {

        Room room = searchRoom(roomNumber);

        if (room != null
                && room.getStatus().equals("Available")
                && isValidGuestName(guestName)) {

            room.setGuestName(guestName.trim());
            room.setStatus("Occupied");

            return true;
        }

        return false;
    }

    public boolean vacateRoom(int roomNumber) {

        Room room = searchRoom(roomNumber);

        if (room != null && room.getStatus().equals("Occupied")) {

            room.setGuestName("None");
            room.setStatus("Available");

            return true;
        }

        return false;
    }

    public int getRoomCount() {
        return roomCount;
    }
    
        // Count the available rooms
public int getAvailableRoomCount() {

    int count = 0;

    for (int i = 0; i < roomCount; i++) {

        if (rooms[i].getStatus().equals("Available")) {
            count++;
        }
    
    }
    return count;

}

    public Room getRoomAt(int index) {

        if (index >= 0 && index < roomCount) {
            return rooms[index];
        }

        return null;
    }
}
