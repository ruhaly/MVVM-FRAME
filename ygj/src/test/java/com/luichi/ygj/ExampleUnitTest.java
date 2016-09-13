package com.luichi.ygj;

import com.luichi.ygj.utils.L;
import com.orhanobut.logger.Logger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void check_isName() throws Exception {
        System.out.println(1111);
        L.init();
        L.d("23");
    }
}