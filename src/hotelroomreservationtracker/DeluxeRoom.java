 
package hotelroomreservationtracker;


public class DeluxeRoom extends Room{
     private String extraFeature;

   
    public DeluxeRoom(int roomNumber, String extraFeature) {
        super(roomNumber);
        this.extraFeature = extraFeature;
    }

    
    public String getExtraFeature() {
        return extraFeature;
}
}