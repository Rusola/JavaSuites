package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("slow")
class SpeedTests {
    @Tag("slow")
    @Test
    void test1() {
        System.out.println("slow test1");
    }
    @Tag("slow")
    @Test
    void test2() {
        System.out.println("slow test2");
    }

    @Test
    void slowTest3() {
        System.out.println("slow test3");
    }

    @Test
    void fastTest() {
        System.out.println("fast test");
    }
}
