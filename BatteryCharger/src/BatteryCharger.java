public class BatteryCharger
{
    private int[] rateTable;

    public BatteryCharger(int[] table)
    {
        rateTable = table;
    }

    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
        int hrIndex = startHour;

        for(int h = 1; h <= chargeTime; h++)
        {
            cost += rateTable[hrIndex];
            hrIndex++;

            if(hrIndex == 24) // hrIndex >= rateTable.length
                hrIndex = 0;
        }
        return cost;
    }

    public int getChargeStartTime(int chargeTime)
    {
        int startTime = 0;
        int minCost = Integer.MAX_VALUE;

        for(int i = 0; i < rateTable.length; i++)
        {
            if(getChargingCost(i,chargeTime) < minCost)
            {
                minCost = getChargingCost(i,chargeTime);
                startTime = i;
            }
        }
        return startTime;
    }



}
