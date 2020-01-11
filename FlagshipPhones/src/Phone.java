public class Phone
{
    private String manufacturer;
    private String companyLocation;
    private String model;
    private String operatingSystem;
    private int msrp;
    private boolean discontinued;

    public Phone(String manufacturer, String location, String model, String os, int msrp, boolean discontinued)
    {
        this.manufacturer = manufacturer;
        companyLocation = location;
        this.model = model;
        operatingSystem = os;
        this.msrp = msrp;
        this.discontinued = discontinued;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
    public String getCompanyLocation()
    {
        return companyLocation;
    }
    public String getModel()
    {
        return model;
    }
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
    public int getMsrp()
    {
        return msrp;
    }
    public boolean isDiscontinued()
    {
        return discontinued;
    }

    public boolean equals(Phone other)
    {
       if(this.getManufacturer().equals(other.getManufacturer()) && this.getModel().equals(other.getModel()))
           return true;

       return false;
    }
    public boolean equals(String manufacturer, String model)
    {
        if(this.getManufacturer().equals(manufacturer) && this.getModel().equals(model))
            return true;

        return false;
    }

    public int compareTo(Phone other)
    {
        if(this.getMsrp() == other.getMsrp())
            return 0;
        else
        {
            if(this.getMsrp() > other.getMsrp())
                return 1;

            return -1;
        }
    }

    public String toString()
    {
        String output = "";
        output += getUnderscores(output);
        output += manufacturer + " ";
        output += getSpaces(10 - manufacturer.length()) + "|" + " " + companyLocation + getSpaces(15 - companyLocation.length()) + "|" + " " + model + getSpaces(15 - model.length()) + "|" + " "  + operatingSystem + getSpaces(22 - operatingSystem.length()) + "|" + " " + String.valueOf(msrp) + getSpaces(6 - String.valueOf(msrp).length()) + "|" + " ";

        if(isDiscontinued())
            output+= "Y" + " |";
        else
            output+= "N" + " |";

        output += "\n" + getUnderscores(output);


        return output;
    }
    public static String getUnderscores(String str)
    {
        String underscores = "";

        for(int i = 0; i < str.length(); i++)
        {
            underscores += "_";
        }
        return underscores;
    }
    public static String getSpaces(int numOfSpaces)
    {
        String spaces = "";
        for (int i = 0; i < numOfSpaces; i++)
            spaces += " ";

        return spaces;
    }
}
