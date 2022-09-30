<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Home</title>
    </head>
<body>
    <h1>Employee management</h1>
    
    <table>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    <c:out value="${user.firstname}"/>
                </td>
                <td>
                    <c:out value="${user.lastname}"/>
                </td>
                <td>
                    <c:out value="${user.dateofbirth}"/>
                </td>
                 <td>
                    <c:out value="${user.department}"/>
                </td>
                 <td>
                    <c:out value="${user.salary}"/>
                </td>
                <td>
                    <a href="<c:url value="/edit/${user.id}.html"/>" >Edit Employee</a>
                </td>
            </tr>
        </c:forEach>
        <c:if test="${empty users}">
            no employees added yet.
        </c:if>
    </table>
    
    <%-- <a href="<c:url value="/employee.html"/>" >Add new user</a> --%>
</body>
</html>