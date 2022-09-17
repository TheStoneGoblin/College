//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
public class Exercise5_9 {
    public static void main(String[] args) {
        //used to print table out
        System.out.println("Feet        Meters      |       Meters      Feet");
        System.out.println("________________________________________________");
        System.out.println("1.0         "+footToMeter(1.0)+"       |       20.0      "+ meterToFoot(20.0));
        System.out.println("2.0         "+footToMeter(2.0)+"        |       25.0      "+ meterToFoot(25.0));
        System.out.println("...                     |                       ");
        System.out.println("9.0         "+footToMeter(9.0)+"       |       60.0      "+ meterToFoot(60.0));
        System.out.println("10.0        "+footToMeter(10.0)+"        |       65.0      "+ meterToFoot(65.0));
    }
    /** Convert from feet to meters */
    public static double footToMeter(double foot){
        return foot * 0.305;
    }

    /** Convert from meters to feet*/
    public static double meterToFoot(double meter){
        return meter * 3.279;
    }
}
