package pack1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test3 {
    @Test
    void test3() {
        System.out.println("test 3");
    }
    @Tag("slow")
    @Test
    void test33() {
        System.out.println("test 33 with tag 'slow'");
    }
}
