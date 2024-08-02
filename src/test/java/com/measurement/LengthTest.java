package com.measurement;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.measurement.Length.centiMeter;
import static com.measurement.Length.meter;
import static com.measurement.Length.kiloMeter;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LengthTest {

    private static Length hundredCentimeters;
    private static Length oneCentimeter;

    @BeforeAll
    static void beforeAll() {
        oneCentimeter = centiMeter(1);
        hundredCentimeters = centiMeter(100);
    }

    @Nested
    class Equality {
        @Test
        void toCheckEqualityWhenOneCentimeterIsComparedWithOneCentimeter() {

            assertThat(oneCentimeter, is(equalTo(oneCentimeter)));
        }

        @Test
        void toCheckEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter() {

            Length anotherOneCentimeter = centiMeter(1);

            assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
        }

        @Test
        void toCheckInEqualityWhenOneCentimeterIsComparedWithTenCentimeter() {

            Length tenCentimeters = centiMeter(10);

            assertThat(oneCentimeter, is(not(equalTo(tenCentimeters))));
        }
    }

    @Nested
    class Conversion {
        @Test
        void toCheckEqualityWhenOneMeterIsComparedWithHundredCentimeter() {

            Length oneMeter = meter(1.0);

            assertThat(oneMeter.convertToBase(), is(equalTo(hundredCentimeters.convertToBase())));
        }

        @Test
        void toCheckEqualityWhenHundredCentimeterIsComparedWithZeroPointZeroZeroOneKilometer() {

            Length zeroPointZeroZeroOneKilometer = kiloMeter(0.001);

            assertThat(hundredCentimeters.convertToBase(), is(equalTo(zeroPointZeroZeroOneKilometer.convertToBase())));
        }
    }

}
