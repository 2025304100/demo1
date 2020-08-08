<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<link href="bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script src="bootstrap.min.js"></script>
<script src="jquery-1.9.1.min.js"></script>
<link href="style.css" rel="stylesheet" type="text/css"/>
<body>
<div class="title_user">
    <table class="table table-striped user" id="user">
        <thead>
        <tr>
            <th>终端id</th>
            <th>终端ip</th>
            <th>床号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>${us.nodeFlag}</td>
            <td>${us.nodeIp==""?"-":us.nodeIp}</td>
            <td>${us.count}</td>
            <td>${us.userRealname==""?"-":us.userRealname}</td>
            <td>${us.userGender==""?"-":us.userGender}</td>
            <td>${us.userAge==""?"-":us.userAge}</td>
        </tr>

        </tbody>
    </table>
</div>
<div class="below_table">
    ​
    <table class="table table-striped message" id="message">
        <thead>
        <tr>
            <th>终端id</th>
            <th>终端ip</th>
            <th>电压(uv)</th>
            <th>温度</th>
            <th>时间</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${mes}" var="me">
            <tr>
                <td>${me.nodeFlag}</td>
                <td>${me.nodeIp==""?"-":me.nodeIp}</td>
                <td>${me.voltage==0.0?"-":me.voltage}</td>
                <td>${me.nodeLastAttr2==''?"-":me.nodeLastAttr2}</td>
                <td>${me.nodeLastTime=""?"-":me.nodeLastTime}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<style>
    body {
        background-color: #00000000;
    }
</style>
</html>
