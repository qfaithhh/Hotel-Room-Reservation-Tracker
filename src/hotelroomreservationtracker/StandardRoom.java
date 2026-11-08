
package hotelroomreservationtracker;
 
public class StandardRoom extends Room {
    private String bedType;

    
    public StandardRoom(int roomNumber, String bedType) {
        super(roomNumber);
        this.bedType = bedType;
    }

   
    public String getBedType() {
        return bedType;
}
}