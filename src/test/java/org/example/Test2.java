package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test2 {
    @Tag("slow")
    @Test
    void test2() {
        System.out.println("test 2 +");
    }
}
