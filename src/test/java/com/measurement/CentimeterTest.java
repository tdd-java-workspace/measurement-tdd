package com.measurement;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimeterTest {

    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedWithOneCentimeter() {

        Centimeter oneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter, is(equalTo(oneCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter() {

        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void toCheckInEqualityWhenOneCentimeterIsComparedWithTenCentimeter() {

        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter tenCentimeter = new Centimeter(10);

        assertThat(oneCentimeter, is(not(equalTo(tenCentimeter))));
    }

}
