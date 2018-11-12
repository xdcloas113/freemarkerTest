<html>
<%@ page contentType="text/html; charset=utf-8" language="java"
         pageEncoding="utf-8" errorPage=""%><!--乱码 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- 标签-->
<body>
<h2>jsp页面</h2>
</body>
<div>
    <p>
        ${name} 我是jsp
    </p>

    <p>性别：
            <c:choose>
                <c:when test="${sex ==1}">
                    男
                </c:when>
                <c:when test="${sex ==2}">
                    女
                </c:when>
                <c:otherwise>
                    不详
                </c:otherwise>
            </c:choose>
    </p>

    <h4>我的好友：</h4>
    <c:forEach items="${friends}" var="map">
    姓名：${map.name} , 年龄${map.age}
    <br>
    </c:forEach>
</div>
</html>
