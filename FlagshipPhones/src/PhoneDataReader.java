import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class PhoneDataReader
{
    public static void main(String[] args) throws Exception
    {
        String filename = "PhoneTable.csv";
        File inputFile = new File(filename);

        if (!inputFile.exists())
            System.out.println(filename + " cannot be found.");
        else
        {
            Scanner input = new Scanner(inputFile);

            /*
            int lineCount = 0;                                   //only use if using array
            while (input.hasNextLine())
            {
                input.nextLine();
                lineCount++;
            }
            input.close();
            Phone[] arr = new Phone[lineCount];
            */

            ArrayList<Phone> arrList = new ArrayList<>();      // pass in using arrayList


            input = new Scanner(inputFile);
            String currentLine;
            String[] phoneData;
            Phone p;
            String manufacturer, companyLocation, model, operatingSystem;
            int msrp;
            boolean discontinued;

           // lineCount = 0;                //Pass in using array
            currentLine = input.nextLine(); //SKIPS FIRST LINE OF DATA

            while(input.hasNextLine())
            {
                currentLine = input.nextLine();
                phoneData = currentLine.split(",");

                manufacturer = phoneData[0];
                companyLocation = phoneData[1];
                model = phoneData[2];
                operatingSystem = phoneData[3];
                msrp = Integer.parseInt(phoneData[4]);

                if(phoneData[5].equals("Y"))
                    discontinued = true;
                else
                    discontinued = false;

                p = new Phone(manufacturer, companyLocation, model, operatingSystem, msrp, discontinued);

              /*
              arr[lineCount] = p;  //Passing in using array
              lineCount++;         //Passing in using array
              */

                arrList.add(p);                   // passing in with arraylist

            }
            //FlagshipPhones fp = new FlagshipPhones(arr);  //passing in using array
            FlagshipPhones fp = new FlagshipPhones(arrList); // passing in with arraylist
            input.close();
            System.out.println(fp);
            System.out.println();

            /*
            System.out.println();
            System.out.println();
            System.out.println("Getting all ANDROIDS . . . ");
            List<Phone> androids = fp.getByOsList("Android");
            for(Phone a : androids)
                System.out.println(a);

            System.out.println();
            */

            /*
            System.out.println("Expensive:");
            System.out.println(fp.getMostExpensive());

            System.out.println();
            */

            /*
            System.out.println("Cheapest:");
            System.out.println(fp.getCheapest());
            */

            /*
            System.out.println("Average of Apple = " + fp.averageOfManufacturer("Apple"));
            */
            System.out.println();

           /*
            ArrayList<Phone> locationList = fp.getLocationList("South Korea");
            for(Phone x : locationList)
                System.out.println(x);
           */

            /*ArrayList<Phone> budgetList = fp.getBudgetList(500);
            for(Phone y : budgetList)
                System.out.println(y);
            */
          /*
            fp.sortManufacturersAlphabetically();
            System.out.println(fp);
          */

          /*
            fp.sortByPrice();
            System.out.println(fp);
          */

            //System.out.println(fp.getCountryWithMostManufacturers());


            //System.out.println(fp.averageOfCountry("United States"));

            /*
            fp.sortByPrice();
            System.out.println(fp);
            */

            //System.out.println(fp.getByManuModel("Apple","iPhone XR"));

            //System.out.println(fp.getMostExpensiveManufacturer());

            //System.out.println(fp.totalAveragePrice());

            //System.out.println(fp.averagePrice(fp.getBudgetList(500)));

            /*
            fp.sortModelsAlphabetically();
            System.out.println(fp);
            */

            //System.out.println("Average of South Korea :" + fp.averageOfCountry("South Korea"));

            /*
            fp.sortByPrice();
            System.out.println(fp);
            */

        }
    }
}
