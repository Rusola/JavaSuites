package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class) // чтобы гарантировать порядок
public class AlphanumericOrder {
    @Test
    void testA() {
        System.out.println("testA");
    }
    @Test
    void testC() {
        System.out.println("testC");
    }
    @Test
    void testD() {
        System.out.println("testD");
    }
    @Test
    void testB() {
        System.out.println("testB");
    }
}
