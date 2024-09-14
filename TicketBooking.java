/*
 * write a program by creating a class Booking and with attributes/fields 
 * bookingid
 * bookingdate
 * seatsbooked
 * seatsavailable
 */

import java.time.LocalDate;
import java.util.Random;

class Booking{
	private long bookingId;
	private LocalDate bookingDate;
	private int seatsBooked;
	private static int seatsAvailable;
	
	static {
		seatsAvailable=10;
	}
     Booking(LocalDate bookingDate,int seatsBooked){
     }
       public void 	bookseats() {
    	   boolean isbooked=false;
    	   if(seatsBooked<=seatsAvailable) {
    		   seatsAvailable-=seatsBooked;
    		   isbooked=true;
    	   }
    	   if(isbooked) {
    		   Random random=new Random();
    		   this.bookingId=random.nextLong(999999999);
    		   System.out.println("Booking Successfull..! Your bookingId : "+ bookingId);
    	   }
    	   else
    		   System.out.println("Sorry,seats are not available ");
    	   
       }
       public void cancelseats() {
    	   seatsAvailable=seatsAvailable+this.seatsBooked;
    	   System.out.println("Seats are cancelled.. ");
    	   
    	   
       }
       public static int fetchAvailableSeats() {
    	   return seatsAvailable;
       }
}
public class TicketBooking {
   public static void main(String[] agrs) {
	   Booking b1=new Booking(LocalDate.now(),6);
	   b1.bookseats();
	   System.out.println();
	   Booking b2=new Booking(LocalDate.now(),7);
	   b2.bookseats();
	   
   }
}
