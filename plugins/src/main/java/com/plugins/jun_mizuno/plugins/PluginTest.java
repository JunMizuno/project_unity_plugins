package com.plugins.jun_mizuno.plugins;

public class PluginTest {
    private static String testString = "初期設定の文字列";

    public static void setTestString(String str) {
        testString = str;
    }

    public static String getTestString() {
        return testString;
    }
}
