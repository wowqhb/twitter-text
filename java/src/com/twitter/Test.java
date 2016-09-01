package com.twitter;

import java.util.regex.Pattern;

/**
 * Created by axe on 2016/09/01.
 */
public class Test {
    public static void main(String[] args) {
/*        assertCaptureCount(Regex.VALID_URL, "http://example.com");
        assertCaptureCount(Regex.VALID_URL, "http://www.baidu.com");
        assertCaptureCount(Regex.VALID_URL, "http://www.163.com");
        assertCaptureCount(Regex.VALID_URL, "http://127.0.0.1:9000");

        Autolink autolink=new Autolink();
        System.out.println(autolink.autoLink("http://127.0.0.1sdfsdfsdf"));
        System.out.println(autolink.autoLink("http://www.163.com你好"));
        System.out.println(autolink.autoLink("http://127.0.0.1:1001sdfdsf"));
        System.out.println(autolink.autoLink("http://example.com:90sdfsdfdsfdsfsd"));*/
    }

    private static void assertCaptureCount(Pattern pattern, String sample) {
        System.out.println(pattern.matcher(sample).find());
    }
}
