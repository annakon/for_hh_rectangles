package ru.maskan;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ru.maskan.InputTyposTest;
import ru.maskan.BaseCalculationsTest;
import ru.maskan.NegativeValuesTest;
import ru.maskan.NonIntersectTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        InputTyposTest.class,
        BaseCalculationsTest.class,
        NegativeValuesTest.class,
        NonIntersectTest.class
})
public class AllTestSuite {


}
