public class QuadraticRoots
{
    private ComplexNumber root1;
    private ComplexNumber root2;

    public QuadraticRoots(double r1, double r2)
    {
        root1 = new ComplexNumber(r1,0);
        root2 = new ComplexNumber(r2, 0);
    }
    public QuadraticRoots(ComplexNumber r1)
    {
        root1 = new ComplexNumber(r1.getRealMagnitude(), r1.getImaginaryMagnitude());
        root2 = new ComplexNumber(r1.getRealMagnitude(), -r1.getImaginaryMagnitude());
    }
    public ComplexNumber getRoot1()
    {
        return root1;
    }
    public ComplexNumber getRoot2()
    {
        return root2;
    }
    public boolean areValid()
    {
        if(root1.getImaginaryMagnitude() == 0 && root2.getImaginaryMagnitude() != 0)
        {
            return false;
        }
        if(root2.getImaginaryMagnitude() == 0 && root1.getImaginaryMagnitude() != 0)
        {
            return false;
        }
        if(root1.getImaginaryMagnitude() != 0 && root2.getImaginaryMagnitude() != 0)
        {
            if(root1.getRealMagnitude() != root2.getRealMagnitude() && root1.getImaginaryMagnitude() != root2.getImaginaryMagnitude())
                return false;
        }
        return true;

    }
    public String toString()
    {
        if(root1.getImaginaryMagnitude() == 0 && root2.getImaginaryMagnitude() == 0)
        {
            return "(" + "(" + root1.getRealMagnitude() + ",0) , " + "(" + root2.getRealMagnitude() + ",0))";
        }
        else
        {
            return "(" + "(" + root1.toString() + ",0 ," + "(" + root2.toString() + ",0))";
        }
    }
}
