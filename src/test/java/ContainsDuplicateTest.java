package test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ContainsDuplicateTest {
    DuplicateChecker checker;
    @Before
    public void init(){
        checker = new DuplicateChecker();
    }
    @Test
    public void containsDuplicate_WithEmptyArray_Test() {
        var numbers = new int[]{};
        assertFalse(checker.containsDuplicate(numbers));
    }
    @Test
    public void containsDuplicate_WithOneNumber_Test() {
        var numbers = new int[]{1};
        assertFalse(checker.containsDuplicate(numbers));
    }
    @Test
    public void containsDuplicate_WithNoDuplicate_Test(){
        var numbers = new int[]{1,2,3,4,5,6,7,8,9};
        assertFalse(checker.containsDuplicate(numbers));
    }
    @Test
    public void containsDuplicate_WithAllDuplicates_Test(){
        var numbers = new int[]{6,6,6,6,6,6,6,6};
        assertTrue(checker.containsDuplicate(numbers));
    }
    @Test
    public void containsDuplicate_WithOneDuplicate_Test(){
        var numbers = new int[]{1,2,3,4,5,6,6};
        assertTrue(checker.containsDuplicate(numbers));
    }
    @Test
    public void containsDuplicate_WithNegativeNumber_Test(){
        var numbers = new int[]{-1,1,2,3,4,5,6};
        assertFalse(checker.containsDuplicate(numbers));
    }

}