<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta charset="utf-8">
    <title>病人病房</title>
</head>
<link href="bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script src="bootstrap.min.js"></script>
<script src="jquery-1.9.1.min.js"></script>
<link href="style.css" rel="stylesheet" type="text/css"/>
<body>
<div class="win">
    <div class="top"><i></i><b>病床监控中心</b></div>
    <hr size="1">
    <div class="body">
        <div class="left">
            <header>
                <h3 align="center">病床情况</h3>
            </header>
            <iframe frameborder="0" name="ul" id='ul' src="list" scrolling="no" allowfullscreen="true"></iframe>
        </div>
        <div class="rigth">
            <header>
                <h3 align="center">病人详细信息</h3>
                <a id="derive">
                    <button type="button" class="btn btn-primary">导出数据</button>
                </a>
            </header>
            <iframe frameborder="0" name="table" id='table' src="us?id=260" scrolling="no"
                    allowfullscreen="true"></iframe>
        </div>
    </div>
</div>
</body>
<style>
    body {
        overflow: hidden;
    }
</style>
<script>
    $(window).ready(function () {
        //文本生成器
        $.getJSON("http://127.0.0.1:9101/api/node/list", function (json) {

        });
    })
</script>
</html>
