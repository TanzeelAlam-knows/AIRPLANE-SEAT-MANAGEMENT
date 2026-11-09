import java.util.*;

public class AirplaneManagement{
    String seats[][] = new String [5][2];
    String name;
    int age;
    long phoneNo;
    // Constructor to initialize seats !
    public AirplaneManagement(){
        this.name = "";
        this.age = 0;
        phoneNo = 0;
        for(int i = 0 ; i < this.seats.length ; i++){
            for(int j = 0 ; j < this.seats[i].length ; j++){
                this.seats[i][j] = "";
            }
        }
        
    }

    private void input(){
        Scanner sc = new Scanner (System.in);

        System.out.println("ENTER YOUR NAME :: ");
        this.name = sc.next().trim().toUpperCase();

        System.out.println("ENTER YOUR AGE ::");
        this.age = sc.nextInt();

        if(age < 0 || age > 150){
            System.out.println("FUCKK YOU BITCH ! ");
            System.exit(0);
        }
        else if(age < 18){
            System.out.println("Jaake padhai kar laadle..");
            System.exit(0);
        }


        
    }
    //Seat Booking Logic :
    private void seatBooking(){
        

    }

    //Seat Viewing Logic :
    private void seatViewing(){

    }

    //Method to be called to start the Program
    public void igniter(){
        Scanner sc = new Scanner (System.in);
        System.out.println("\t\t\tWELCOME TO TANZEEL AIRPLANE MANAGEMENT SYSTEM ");

        System.out.println("ENTER :\n1. FOR SEAT BOOKING \n2. FOR SEAT VIEWING \n3.EXIT");
        int inp1 = sc.nextInt();
        
        switch (inp1){
           case 1:
               seatBooking();
               break;
           case 2:
               seatViewing();
               break;
           case 3:
               System.exit(0);
           default:
               System.out.println("PLEASE ENTER A VALID INPUT ! ");
               System.exit(0);
        }
    }


    public static void main(String args[]){
        AirplaneManagement passenger1 = new AirplaneManagement();
        passenger1.igniter();
    }
}