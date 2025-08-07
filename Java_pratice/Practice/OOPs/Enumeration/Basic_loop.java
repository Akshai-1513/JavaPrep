package Practice.OOPs.Enumeration;

public class Basic_loop {
    enum Week implements About{
        Monday , Tuesday , Wednesday , Thrusday , Friday , Saturday , Sunday ; // these are called the constants
        // Basically these are public , static , final.

        @Override
        public void about() {
            System.out.println("This is the about method.");
        }
    }

    public static void main(String[] args){
        for(Week day : Week.values()){
            System.out.println(day); // This actually prints all the constants in the Week
        }

        Week day = Week.Friday;// we should initialize it.
        day.about();

        // Week day = new Week(); //Enum types cannot be instantiated
        // enum can't be created as object.
    }
}
