package com.demo.conntroller;

import com.demo.bean.Message;
import com.demo.bean.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/us")
public class listUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        String id = req.getParameter("id");
        System.out.println(id);
        URL url = new URL("http://127.0.0.1:9101/api/nodelog/list?nodeid=" + id);
        URLConnection urlConnection = url.openConnection();
        InputStream in = urlConnection.getInputStream();
        String str = new String(in.readAllBytes(), "UTF-8");
        JSONObject json = JSONObject.fromObject(str);
        JSONArray data = json.getJSONArray("data");
        List<Message> ls = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            JSONObject jsonObject = JSONObject.fromObject(data.get(i));
            String s1 = jsonObject.get("Node").toString();
            List<String> list = new ArrayList<>();
            s1 = s1.replace("\"", "");
            while (s1.indexOf(':') != -1) {
                int i1 = s1.indexOf(':');
                int i2 = s1.indexOf(',');
                String s = s1.substring(i1 != -1 ? i1 + 1 : 0, i2 != -1 ? i2 : s1.indexOf('}'));
                list.add(s);
                s1 = s1.substring(i2 != -1 ? i2 + 1 : s1.lastIndexOf(':') + 1, s1.indexOf('}') + 1);
            }
            SimpleDateFormat si = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒  E");
            Date date = new Date();
            date.setTime(Long.parseLong(list.get(3)));
            String format = si.format(date);
            String s = list.get(4);
            System.out.println(s);
            if (s.equals(""))
                s = "0E+0";
            BigDecimal bigDecimal = new BigDecimal(s);

            Message message = new Message(i, Float.valueOf(jsonObject.get("Attr1").toString()), Integer.valueOf(list.get(0)), list.get(1), Integer.valueOf(list.get(2)), format,
                    bigDecimal.floatValue(), list.get(5), list.get(6), list.get(7), list.get(8),
                    list.get(9), list.get(10), Integer.valueOf(list.get(11)), Boolean.valueOf(list.get(12)));
            ls.add(message);
        }
        HttpSession session = req.getSession();
        List<User> list = (List<User>) session.getAttribute("list");
        User user = null;
        for (User us : list) {
            if (id.equals(String.valueOf(us.getId()))) {
                user = us;
                break;
            }
        }
        session.setAttribute("mes", ls);
        req.setAttribute("us", user);
        req.setAttribute("mes", ls);
        req.getRequestDispatcher("/table.jsp").forward(req, resp);
    }
}
