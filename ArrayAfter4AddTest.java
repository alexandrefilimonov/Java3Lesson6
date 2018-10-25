package ru.geekbrains.Lesson6;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class ArrayAfter4AddTest {
    int nArrayLength = 6;
    ArrayAfter4 aa = null;
    @Before
    public void startTest() {
        aa = new ArrayAfter4(nArrayLength);
        System.out.println(Arrays.toString(aa.a));
        System.out.println(Arrays.toString(aa.getArrayAfter4(nArrayLength)));
    }

    @Test
    public void Test1 () {
        int [] a1 = {4,2,3};
        Assert.assertArrayEquals(a1, aa.getArrayAfter4(nArrayLength));
    }
    @Test
    public void Test2 () {
        int [] a1 = {4,2,3};
        Assert.assertArrayEquals(aa.getArrayAfter4(nArrayLength), aa.getArrayAfter4(nArrayLength));
    }
}
