package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestMonthConversion {

   @Test
   public void testMonthConversion()
   {
     // action
     String strResult = MonthConversion.convertMonth(1);
     // assertion
     assertEquals("January", strResult);

     strResult = MonthConversion.convertMonth(2);
     // assertion
     assertEquals("February", strResult);

     strResult = MonthConversion.convertMonth(3);
     // assertion
     assertEquals("March", strResult);

     strResult = MonthConversion.convertMonth(4);
     // assertion
     assertEquals("April", strResult);

     strResult = MonthConversion.convertMonth(5);
     // assertion
     assertEquals("May", strResult);

     strResult = MonthConversion.convertMonth(6);
     // assertion
     assertEquals("June", strResult);

     strResult = MonthConversion.convertMonth(7);
     // assertion
     assertEquals("July", strResult);

     strResult = MonthConversion.convertMonth(8);
     // assertion
     assertEquals("August", strResult);

     strResult = MonthConversion.convertMonth(9);
     // assertion
     assertEquals("September", strResult);

     strResult = MonthConversion.convertMonth(10);
     // assertion
     assertEquals("October", strResult);

     strResult = MonthConversion.convertMonth(11);
     // assertion
     assertEquals("November", strResult);

     strResult = MonthConversion.convertMonth(12);
     // assertion
     assertEquals("December", strResult);

     strResult = MonthConversion.convertMonth(13);
     // assertion
     assertEquals("No Such Month", strResult);     

   }
}
