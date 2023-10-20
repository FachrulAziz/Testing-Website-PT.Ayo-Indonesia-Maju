package com.IndonesiaMaju.utils;

public enum TestScenarios {
    T1("a"),
    T2("b"),
    T3("c"),
    T4("d"),
    T5("e"),
    T6("f"),
    T7("g"),
    T8("h"),
    T9("i"),
    T10("j"),
    T11("k");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
