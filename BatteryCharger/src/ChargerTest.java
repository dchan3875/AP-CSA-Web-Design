public class ChargerTest
{
    public static void main(String[] args)
    {
        int[] table1 = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
        BatteryCharger charger1 = new BatteryCharger(table1);
        //System.out.println(charger1.getChargingCost(23,2));
        System.out.println("Charger 1 START TIME: " + charger1.getChargeStartTime(5));

        System.out.println();

        int[] table2 = {55,12,523,51,45,12,425,252,85,34,748,65,20,30,25,90,184,24,62,124,12,123,10,100};
        BatteryCharger charger2 = new BatteryCharger(table2);
        //System.out.println(charger2.getChargingCost(23,2));
        System.out.println("Charger 2 START TIME: " + charger2.getChargeStartTime(5));

        System.out.println();

        int[] table3 = {200,120,500,205,200,209,130,20,50,99,11,111,222,333,444,555,4,0,123,45,12,50,80,32};
        BatteryCharger charger3 = new BatteryCharger(table3);
        //System.out.println(charger3.getChargingCost(23,2));
        System.out.println("Charger 3 START TIME: " + charger3.getChargeStartTime(5));

        System.out.println();

        int[] table4 = {90,20,10,50,60,230,600,20,15,60,80,20,900,300,70,90,20,80,20,70,21,35,120,4920};
        BatteryCharger charger4 = new BatteryCharger(table4);
        //System.out.println(charger4.getChargingCost(23,2));
        System.out.println("Charger 4 START TIME: " + charger4.getChargeStartTime(5));

        System.out.println();

        int[] table5 = {46,27,342,7,34,34,15,67,85,56,23,64,345,7,643,74,2,7,9,4,2,1,4,5};
        BatteryCharger charger5 = new BatteryCharger(table5);
        //System.out.println(charger5.getChargingCost(23,2));
        System.out.println("Charger 5 START TIME: " + charger5.getChargeStartTime(5));

        System.out.println();

        int[] table6 = {75,1,68,3,2,8,6,4,2,88,5,3,856,3,8,45,32,956,3,67,4,2,4,67};
        BatteryCharger charger6 = new BatteryCharger(table6);
        //System.out.println(charger6.getChargingCost(23,2));
        System.out.println("Charger 6 START TIME: " + charger6.getChargeStartTime(5));

        System.out.println();

        int[] table7 = {52,7,73,2,8,5,3,237,7,4,2,7,8,4,67,7,34,6,4,2,79,8235,6,2};
        BatteryCharger charger7 = new BatteryCharger(table7);
        //System.out.println(charger7.getChargingCost(23,2));
        System.out.println("Charger 7 START TIME: " + charger7.getChargeStartTime(5));


        /*column dominant:
        loop through column
            loop through row
                arr2d[r][c]

        */
    }
}
