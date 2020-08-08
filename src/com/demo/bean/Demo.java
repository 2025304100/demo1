package com.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String s1 = "{\"Id\":272,\"NodeFlag\":\"34511231594528689\",\"NodeStatus\":0,\"NodeLastTime\":0,\"NodeLastAttr2\":\"\",\"NodeIp\":\"127.0.0.1\",\"UserBedno\":\"\",\"UserRealname\":\"\",\"UserAge\":\"\",\"UserGender\":\"\",\"UserExtdata\":\"\",\"Delflag\":0,\"CmpIsOnline\":false}";
        s1 = s1.replace("\"", "");
        List<String> list = new ArrayList<>();
        while (s1.indexOf(':') != -1) {
            int i1 = s1.indexOf(':');
            int i2 = s1.indexOf(',');
            System.out.println(s1.indexOf(','));
            String str = s1.substring(i1 != -1 ? i1 + 1 : 0, i2 != -1 ? i2 : s1.indexOf('}'));
            list.add(str);
            s1 = s1.substring(i2 != -1 ? i2 + 1 : s1.lastIndexOf(':') + 1, s1.indexOf('}') + 1);
            System.out.println(s1);
        }
        list.get(2);
        System.out.println(list.size());
    }
}
