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
<ul class="list-group">
    <c:forEach items="${list}" var="user">
        <li class="list-group-item size">
            <c:if test="${user.userRealname!=''}">
                <a href="us?id=${user.id==''?'-':user.id}" target="table">
                    <b style="color: #00bfbd">床位编号:</b>${user.count}
                    <b style="color: #00bfbd">姓名:</b>${user.userRealname==""?"-":user.userRealname}
                    <b style="color: #00bfbd">年龄:</b>${user.userAge==""?"-":user.userAge}
                    <b style="color: #00bfbd">性别:</b>${user.userGender==""?"-":user.userGender}
                    <b style="color: #00bfbd"> 温度:</b>${user.nodeLastAttr2==0.0?"-":user.nodeLastAttr2}
                </A>
            </c:if>
            <c:if test="${user.userRealname==''}">
                <a href="us?id=${user.id==''?'-':user.id}" target="table"><b
                        style="color: red">床位编号:</b><i>${user.count}</i><b style="color: red">编号id:${user.nodeFlag}</b>
                </A>
            </c:if>
            <span class="buth">
				<!--用于添加按钮-->
			</span>
        </li>
    </c:forEach>
</ul>
</body>
</html>
