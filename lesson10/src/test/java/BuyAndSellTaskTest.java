import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyAndSellTaskTest {
    BuyAndSellTask buySell;
    @Before
    public void init(){
        buySell = new BuyAndSellTask();
    }
    @Test
    public void maxProfit_WithEmptyArray_Test() {
        int[] prices = new int[]{};
        int expected = 0;
        int result = buySell.maxProfit(prices);
        assertEquals(expected,result);
    }
    @Test
    public void maxProfit_WithNormalArray_Test() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int expected = 5;
        int result = buySell.maxProfit(prices);
        assertEquals(expected,result);
    }
    @Test
    public void maxProfit_WithDescArray_Test() {
        int[] prices = new int[]{7,6,5,4,3,2,1,0};
        int expected = 0;
        int result = buySell.maxProfit(prices);
        assertEquals(expected,result);
    }
    @Test
    public void maxProfit_WithOnePrice_Test() {
        int[] prices = new int[]{1};
        int expected = 0;
        int result = buySell.maxProfit(prices);
        assertEquals(expected,result);
    }
    @Test
    public void maxProfit_WithSamePrice_Test() {
        int[] prices = new int[]{7,7,7,7,7,7,7};
        int expected = 0;
        int result = buySell.maxProfit(prices);
        assertEquals(expected,result);
    }
}