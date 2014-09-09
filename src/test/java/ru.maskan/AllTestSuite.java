package ru.maskan;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        InputTyposTest.class,
        BaseCalculationsTest.class,
        NegativeValuesTest.class,
        NonIntersectTest.class
})
public class AllTestSuite {


}
