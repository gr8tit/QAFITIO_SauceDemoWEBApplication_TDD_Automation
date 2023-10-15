package base;

//Interface
interface Mammals {
    String houseFriendly();
    String eatingHabit();


}

//Class
class Domestic implements Mammals{
    String habaitat;
    String Stomach;


    //Constructor
    public Domestic(String habaitat,String Stomach){
        this.habaitat = habaitat;
        this.Stomach = Stomach;

    }

    //Action points

    @Override
     public String houseFriendly(){
        System.out.println(habaitat + " Dog");
        return habaitat;
     }

     @Override

     public String eatingHabit(){
        System.out.println("Has four stomachs");
        return Stomach;

     }

     public static void main(String[] args){
        Domestic domestic = new Domestic("house", "4 stomachs");
        domestic.eatingHabit();
        domestic.houseFriendly();
     }


}
