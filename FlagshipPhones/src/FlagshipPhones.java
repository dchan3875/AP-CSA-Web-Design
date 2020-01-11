import java.util.ArrayList;
import java.util.List;

public class FlagshipPhones
{
    private ArrayList<Phone> collection;

    public FlagshipPhones() //no param
    {
        collection = new ArrayList<>();
    }
    public FlagshipPhones(ArrayList<Phone> arrList) //constructor with arraylist
    {
        collection = arrList;
    }
    public FlagshipPhones(Phone[] arr)      //construct with array
    {
        collection = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++) // arr.length - 1 b/c splitting string leaves empty space
        {
            collection.add(arr[i]);
        }
    }
    public void addPhone(Phone p)
    {
        collection.add(p);
    }
    public void setPhone(int idx, Phone p)
    {
        collection.set(idx, p);
    }
    public void removePhone(int idx)
    {
        collection.remove(idx);
    }
    public Phone getPhone(String modelName)
    {
        for(Phone p : collection)
            if(p.getModel() ==  modelName)
                return p;

        return null;
    }
    public List<Phone> getByOsList(String os)
    {
        ArrayList<Phone> osList = new ArrayList<>();

        for(Phone p : collection)
            if(p.getOperatingSystem().equals(os))
            {
                osList.add(p);
            }
        return osList;
    }
    public ArrayList<Phone> getLocationList(String location)
    {
        ArrayList<Phone> locationList = new ArrayList<>();

        for(Phone p : collection)
            if(p.getCompanyLocation().equals(location))
                locationList.add(p);

        return locationList;
    }
    public ArrayList<Phone> getBudgetList(int maxPrice)
    {
        ArrayList<Phone> budgetList = new ArrayList<>();

        for(Phone p : collection)
            if(p.getMsrp() <= maxPrice)
                budgetList.add(p);

        return budgetList;
    }
    public double totalAveragePrice()
    {
        double sum = 0;
        for(Phone p : collection)
            sum += p.getMsrp();

        return sum / collection.size();
    }
    public double averagePrice(List<Phone> phonesList)
    {
        double sum = 0;
        for(Phone p : phonesList)
            sum += p.getMsrp();

        return sum / phonesList.size();
    }

    public void sortModelsAlphabetically()
    {
        for(int i = 0; i < collection.size() - 1; i++)
        {
            int lowPos = i;
            for(int j = i + 1; j < collection.size(); j++)
            {
                if(collection.get(j).getModel().compareTo(collection.get(lowPos).getModel()) < 0)
                {
                    lowPos = j;
                }
            }
            swap(i, lowPos, collection);
        }
    }

    public void sortManufacturersAlphabetically()
    {
        for(int i = 0; i < collection.size() - 1; i++)
        {
            int lowPos = i;
            for(int j = i + 1; j < collection.size(); j++)
            {
                if(collection.get(j).getManufacturer().compareTo(collection.get(lowPos).getManufacturer()) < 0)
                {
                    lowPos = j;
                }
            }
            swap(i, lowPos, collection);
        }
    }

    public Phone getMostExpensive()
    {
        int mostExpensive = collection.get(0).getMsrp();
        int idx = 0;

        for(int i = 1; i < collection.size(); i++)
            if(collection.get(i).getMsrp() > mostExpensive) {
                mostExpensive = collection.get(i).getMsrp();
                idx = i;
            }
        return collection.get(idx);
    }

    public Phone getByManuModel(String manufacturer, String model)
    {
        for(Phone p : collection)
            if(p.equals(manufacturer, model))
                return p;

        return null;
    }
    public String getMostExpensiveManufacturer()
    {
        ArrayList<String> allManu = getManufacturers();
        double currentMost = 0;
        double mostExpensiveAvg = 0;
        String mostExpenManu = "";

        for(int i = 0; i < allManu.size(); i++) {
            for (int g = 0; g < collection.size(); g++) {
                if (allManu.get(i).equals(collection.get(g).getManufacturer())) {
                    currentMost = averageOfManufacturer(allManu.get(i));
                    if (currentMost > mostExpensiveAvg) {
                        mostExpensiveAvg = currentMost;
                        mostExpenManu = allManu.get(i);
                    }
                }
            }
        }
        return mostExpenManu;
    }
    public ArrayList<String> getManufacturers()
    {
        ArrayList<String> allManu = new ArrayList<>();

        for(Phone p : collection)
            if (!allManu.contains(p.getManufacturer()))

                allManu.add(p.getManufacturer());

        return allManu;

    }

    public String getCountryWithMostManufacturers()
    {
        sortManufacturersAlphabetically();
        int currMaxCount = 0;
        int maxCount = 0;
        int maxIdx = 0;
        for(int i = 1; i < collection.size() - 1; i++)
        {
            if (collection.get(i).getManufacturer().equals(collection.get(i - 1).getManufacturer())) {
                currMaxCount++;
            }
            else
            {
                if(currMaxCount > maxCount)
                {
                    maxCount = currMaxCount;
                    maxIdx = i - 1;
                }
                else
                    currMaxCount = 0;
            }
        }
        return collection.get(maxIdx).getCompanyLocation();

    }
    public Phone getCheapest()
    {
        int cheapest = collection.get(0).getMsrp();
        int idx = 0;

        for(int i = 1; i < collection.size(); i++)
            if(collection.get(i).getMsrp() < cheapest) {
                cheapest = collection.get(i).getMsrp();
                idx = i;
            }
        return collection.get(idx);
    }
    public double averageOfManufacturer(String theManu)
    {
        double sum = 0;
        double numPhones = 0;

        for(Phone p : collection)
        {
            if (p.getManufacturer().equals(theManu))
            {
                sum += p.getMsrp();
                numPhones++;
            }
        }
        return sum/numPhones;
    }
    public double averageOfCountry(String theCountry)
    {
        double sum = 0;
        double numPhones = 0;

        for(Phone p : collection)
        {
            if (p.getCompanyLocation().equals(theCountry))
            {
                sum += p.getMsrp();
                numPhones++;
            }
        }
        return sum/numPhones;


    }
    private static void swap(int indexA, int indexB, List<Phone> list)
    {
        list.set(indexA,list.set(indexB,list.get(indexA)));
    }

    public void sortByPrice()
    {
        for(int i = 0; i < collection.size() - 1; i++)
        {
            int lowPos = i;
            for(int j = i + 1; j < collection.size(); j++)
            {
                if(collection.get(j).getMsrp() < collection.get(lowPos).getMsrp())
                {
                    lowPos = j;
                }
            }
            swap(i, lowPos, collection);
        }
    }
    public String toString()
    {
        String output = "";
        for(Phone p: collection)
            output += p + "\n";
        return output;
    }






}
