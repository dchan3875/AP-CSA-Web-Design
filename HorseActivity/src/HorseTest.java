public class HorseTest
{
    public static void main(String[] args)
    {
        Horse Trigger = new Horse("Trigger", 1340);
        Horse Silver = new Horse("Silver", 1210);
        Horse Lady = new Horse("Lady", 1575);
        Horse Patches = new Horse("Patches", 1350);
        Horse Duke = new Horse("Duke",1410);

        Horse[] testBarn = {Trigger, null, Silver, Lady, null, Patches, Duke};

        HorseBarn sweetHome = new HorseBarn(testBarn);

        System.out.println(sweetHome.findHorseSpace("Trigger"));
        System.out.println(sweetHome.findHorseSpace("Silver"));
        System.out.println(sweetHome.findHorseSpace("Coco"));

        sweetHome.consolidate();
        System.out.println(sweetHome);

    /*    String[] arrNames = sweetHome.consolidatedNames();
        for(int i = 0; i < arrNames.length; i++)
        {
            if(i != arrNames.length - 1)
                System.out.print(arrNames[i] + ", ");
            else
                System.out.print(arrNames[i] + ".");
        }
        */
    }
}
