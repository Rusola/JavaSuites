package pack1;

import org.example.Test1;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)// чтобы появилась кнопка run suite

@SelectClasses({
        Test3.class,
        Test1.class // just import as Test1 is public class

})
@SelectPackages({
        "org.example"
})

public class CombineSuiteB {
    // empty
}
