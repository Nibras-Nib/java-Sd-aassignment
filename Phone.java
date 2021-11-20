package com.company.java_oop;


abstract class Features{

    abstract void video();
    abstract void game();
    abstract void getdetails();
}

class Nokia_6310 extends Features{
    Nokia_6310(){}
    public void getdetails(){
        System.out.println("""
                2 GB RAM
                16 GB internal storage
                3000 mAh battery""");
    }
    Nokia_6310(int cost){
        System.out.println("Nokia_6310 price is "+cost+"Taka");
    }
    public void music(){
        System.out.println("Music is playing in Nokia_6310 ");
    }
    public void ring(){
        System.out.println("Your Nokia_6310 is ringing ");
    }
    public void game(){
        System.out.println("You can't Play Game in Nokia_6310");
    }
    public void video(){
        System.out.println("You can't run video in Nokia_6310 ");
    }
}

class Nokia_XR20 extends Nokia_6310  {
    public void getdetails(){
        System.out.println("""
            6 GB RAM
            128 GB internal storage
            4630 mAh battery""");
    }
    Nokia_XR20(int cost,int charger_cost){
        super(cost-1000);
        System.out.println("Nokia_XR20 price is cost " + cost+" And charger cost is "+ charger_cost);
    }
    public void music_Video(){
        System.out.println("Music is playing  with video in your Nokia_XR20 ");
    }
    @Override
    public void ring(){
        System.out.println("Your Nokia_XR20 is ringing ");
    }
    public void game(){
        System.out.println("Your game is opening");
    }
    public void video(){
        System.out.println("Your Video is running ");
    }
}



public class Phone {
    public static void main(String[] args) {
        Nokia_6310 phone0=new Nokia_6310(4000);

        System.out.println("Details about this phone\n" );

        phone0.getdetails();
        System.out.println(".....................\n");
        Nokia_6310 phone1 =new Nokia_XR20(5000,2000);
        System.out.println("Details about this phone\n" );
        phone1.getdetails();
        System.out.println(".....................\n");
        phone1.ring();
        phone1.game();
        phone1.video();
        phone0.game();
    }
}
