package JavaMaster.Inheritance.Part3;

public class Room {
    DimensionRoom dimensionRoom;
    int roomNumber;

    public Room(DimensionRoom dimensionRoom, int roomNumber) {
        this.dimensionRoom = dimensionRoom;
        this.roomNumber = roomNumber;
    }

    private class DimensionRoom {
        private int with, height, depth;
    }
}
