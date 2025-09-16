class HotelRoom {
    public String guestName;
    public int roomNumber;

    public HotelRoom(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    public void hotelRoomDisplay() {
        System.out.println(guestName);
        System.out.println(roomNumber);
    }
}


