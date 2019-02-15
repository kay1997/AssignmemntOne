import org.junit.Assert;
import za.ac.cput.CalcAssignment1.Calculate;
import org.junit.Test;

public class CalculateTest
{
    @Test
    public void addition()
    {
        Calculate calc = new Calculate();
        Assert.assertEquals(10, calc.addition(5,5));

    }

    @Test
    public void subtraction()
    {
        Calculate calc = new Calculate();
        Assert.assertEquals(0, calc.subtraction(5,5));
    }

    @Test
    public void multiplication()
    {
        Calculate calc = new Calculate();
        Assert.assertEquals(25, calc.multiplication(5,5));
    }

    @Test
    public void division()
    {
        Calculate calc = new Calculate();
        Assert.assertEquals(1, calc.division(5,5));
    }
}
