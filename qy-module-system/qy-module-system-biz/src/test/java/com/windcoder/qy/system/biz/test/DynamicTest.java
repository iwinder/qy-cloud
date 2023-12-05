package com.windcoder.qy.system.biz.test;


import com.baomidou.dynamic.datasource.toolkit.CryptoUtils;
import org.junit.jupiter.api.Test;

public class DynamicTest {

    @Test
    public void test() {
        String root = null;
        try {
            root = CryptoUtils.encrypt("zzz");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(root);
    }

}
