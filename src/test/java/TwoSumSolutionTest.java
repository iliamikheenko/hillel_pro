package test.java;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

//Task: "Each input would have exactly one solution, and you may not use the same element twice"
public class TwoSumSolutionTest {
    TwoSumSolution checker;
    @Before
    public void init(){
        checker = new TwoSumSolution();
    }
    @Test
    public void twoSum_WithTwoNumbersInArray_Test() {
        int[] numbers = new int[]{3,3};
        int target = 6;
        int[] expected = new int[]{0,1};
        int[] actual = checker.twoSum(numbers,target);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void twoSum_WithNegativeTarget_Test() {
        int[] numbers = new int[]{1,2,3,4,-10};
        int target = -6;
        int[] expected = new int[]{3,4};
        int[] actual = checker.twoSum(numbers,target);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void twoSum_WithPositiveTarget_Test() {
        int[] numbers = new int[]{1,2,3,4,10};
        int target = 12;
        int[] expected = new int[]{1,4};
        int[] actual = checker.twoSum(numbers,target);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void twoSum_WithOnlyNegativeNumbers_Test() {
        int[] numbers = new int[]{-1,-2,-3,-4,-10};
        int target = -12;
        int[] expected = new int[]{1,4};
        int[] actual = checker.twoSum(numbers,target);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void twoSum_WithZeroTarget_Test() {
        int[] numbers = new int[]{-1,-2,-3,-4,4,5,6,7,8,9};
        int target = 0;
        int[] expected = new int[]{3,4};
        int[] actual = checker.twoSum(numbers,target);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void twoSum_WithNoSolution_Test() {
        int[] numbers = new int[]{-1,-2,-3,-4,4,5,6,7,8,9};
        int target = 100;
        int[] expected = new int[]{};
        int[] actual = checker.twoSum(numbers,target);
        assertArrayEquals(expected,actual);
    }
}