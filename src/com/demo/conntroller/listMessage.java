package com.demo.conntroller;

import com.demo.bean.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;

import java.util.ArrayList;
import java.util.List;

@WebServlet("/list")
public class listMessage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        URL url = new URL("http://127.0.0.1:9101/api/node/list");
        URLConnection us = url.openConnection();
        InputStream inp = us.getInputStream();

        String s = new String(inp.readAllBytes(), "UTF-8");

        JSONObject json = JSONObject.fromObject(s);
        JSONArray data = json.getJSONArray("data");
        List<User> users = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String s1 = data.get(i).toString();

            s1 = s1.replace("\"", "");
            List<String> list = new ArrayList<>();
            while (s1.indexOf(':') != -1) {
                int i1 = s1.indexOf(':');
                int i2 = s1.indexOf(',');
                String str = s1.substring(i1 != -1 ? i1 + 1 : 0, i2 != -1 ? i2 : s1.indexOf('}'));
                list.add(str);
                s1 = s1.substring(i2 != -1 ? i2 + 1 : s1.lastIndexOf(':') + 1, s1.indexOf('}') + 1);
            }
            BigDecimal big = null;
            String s2 = list.get(4);

            if (s2.equals(""))
                s2 = "0E+0";
            big = new BigDecimal(s2);
            User user = new User(i + 1, Integer.valueOf(list.get(0)), list.get(1), Integer.valueOf(list.get(2)),
                    Integer.valueOf(list.get(3)), big.floatValue(), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9),
                    list.get(10), Integer.valueOf(list.get(11)), Boolean.getBoolean(list.get(12)));
            users.add(user);
        }
        System.out.println(users.size());
        req.getSession().setAttribute("list", users);
        req.setAttribute("list", users);
        req.getRequestDispatcher("/list.jsp").forward(req, resp);
    }


}
