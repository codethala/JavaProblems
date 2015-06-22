package com.selva.programs.threads;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {}

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
//        fl.methodInFirstLevel(23);
    }
}