class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        HotelRoom room1 = new HotelRoom("Ravi", 201);
        HotelRoom room2 = new HotelRoom("Kiran", 202);
        HotelRoom room3 = new HotelRoom("Manoj", 203);
        HotelRoom room4 = new HotelRoom("Arun", 204);
        HotelRoom room5 = new HotelRoom("Rahul", 205);

        HotelRoom[] hotelRooms = {room1, room2, room3, room4, room5};

        hotel.hotelDisplay(hotelRooms);
    }
}