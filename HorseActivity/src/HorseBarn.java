public class HorseBarn
{
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name)
    {
        for(int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null && spaces[i].getName().equals(name))  //order of && is important
            {
                return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        Horse[] tempArr = new Horse[spaces.length];

        int i = 0;
        int g = 0;

        while(i < spaces.length)
        {
            if(spaces[i] != null)
            {
                tempArr[g] = spaces[i];
                i++;
                g++;
            }
            else
            {
                i++;
            }
        }
        spaces = tempArr;
    }
    /* int nextSpace = 0;
        for (int i = 0; i < spaces.length; i++)
        {
            if spaces[i] != null

        }
     */

/*    public String[] consolidatedNames()
    {
        String[] namesCons = new String[spaces.length];

        int i = 0;
        int g = 0;

        while(i < spaces.length)
        {
            if(spaces[i] != null)
            {
                namesCons[g] = spaces[i].getName();
                i++;
                g++;
            }
            else
            {
                i++;
            }
        }
        return namesCons;
    }
  */
    public String toString()
    {
        String output = "";
        if (spaces.length > 0)
        {
            for (int i = 0; i < spaces.length - 1; i++)
            {
                output += spaces[i] + ", ";
            }
        }
        else
        {
            output = "No barn found.";
        }

        output += spaces[spaces.length - 1];
        return output;
    }
}
