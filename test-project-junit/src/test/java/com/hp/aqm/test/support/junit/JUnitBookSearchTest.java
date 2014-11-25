package com.hp.aqm.test.support.junit; /**
 * Created with IntelliJ IDEA.
 * User: hyao
 * Date: 9/23/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */

import com.hp.aqm.agent.annotations.AQMInfo;
import junit.framework.Assert;
import org.junit.*;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

//import java.util.*;
public class JUnitBookSearchTest {



    @Test
    @AQMInfo(name = "Features", val={"1308"})
    public void bookSearch() {
        assertEquals("book1", "book2");
        // assertEquals(String message, double expected, double actual, double delta)
        //assertEquals("Error in div()!", 0.5, com.hp.aqm.test.support.junit.JUnit4Calc.div(1, 2), 1e-8);
    }

    @Test
    @AQMInfo(name = "UserStories", val={"1399"})
    public void searchBookByWritersFirstName() {
       System.out.println("test");
    }

    @Test
    @AQMInfo(name = "UserStories", val={"1400"})
    @Ignore
    public void searchBookByWritersLastName() {
        System.out.println("test");
    }

    @Test
    @AQMInfo(name = "UserStories", val={"1415"})
    public void getAutomaticRecommendation() {
        throw new IllegalArgumentException("no recommendation");
    }




}
