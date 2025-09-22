class HotelRunner{
public static void main(String [] args){

Breakfast breakfast=new Breakfast("Idli Sambar");
Lunch lunch = new Lunch("Anna Sambar");
Dinner dinner = new Dinner("Chapathi",30);
Hotel hotel = new Hotel("Manu's Hotel",breakfast,lunch,dinner);

hotel.hotelDetails();
}

}