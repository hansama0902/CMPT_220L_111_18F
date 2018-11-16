package Lab10;

import java.util.Arrays;

public class Application {

   public static void main(String[] args) {
       Appliance appliances[] = new Appliance[15];
       appliances[1] = new TV("Samsung 15", "Curved", true, 440, "Black", "Korea", 55);
       appliances[0] = new TV("Samsung 1", "Curved", true, 440, "Black", "Korea", 55000);
       appliances[2] = new TV("Samsung 2", "Curved", true, 440, "Black", "Korea", 5);
       appliances[3] = new TV("Samsung 3", "Curved", true, 440, "Black", "Korea", 5845000);
       appliances[4] = new TV("Samsung 4", "Curved", true, 440, "Black", "Korea", 500);
       appliances[5] = new TV("Samsung 5", "Curved", true, 440, "Black", "Korea", 5500);
       appliances[6] = new Telephone("Samsung 6", false, true, 440, "Black", "Korea", 100);
       appliances[7] = new Telephone("Samsung 7", false, true, 440, "Black", "Korea", 575000);
       appliances[8] = new Telephone("Samsung 8", false, true, 440, "Black", "Korea", 9000);
       appliances[9] = new Telephone("Samsung 9", false, true, 440, "Black", "Korea", 5000);
       appliances[10] = new Telephone("Samsung 10", false, true, 440, "Black", "Korea", 550500);
       appliances[11] = new Toaster("Samsung 11", "Curved", true, 440, "Black", "Korea", 1200);
       appliances[12] = new Toaster("Samsung 12", "Curved", true, 440, "Black", "Korea", 3000);
       appliances[13] = new Toaster("Samsung 13", "Curved", true, 440, "Black", "Korea", 500);
       appliances[14] = new Toaster("Samsung 14", "Curved", true, 440, "Black", "Korea", 90500);

       Arrays.sort(appliances);
       for(Appliance app:appliances) {
           System.out.println(app);
       }

   }

}
