<%--
  Created by IntelliJ IDEA.
  User: Peter's Desktop
  Date: 2/8/2015
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <template:javascript/>
    <title>Weapons</title>
</head>
<body>

    <table>
        <tr>
            <td>
                <select id="characters-select" items="${characters}"/>
            </td>
        </tr>
    </table>

</body>
</html>
