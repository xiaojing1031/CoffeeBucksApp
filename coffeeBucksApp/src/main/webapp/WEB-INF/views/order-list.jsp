<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <title>List Coffee</title>

    <!-- reference our style sheet -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/static_resources/css/style.css">
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Coffee Management </h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <!-- add out html table here -->
        <table>
            <tr>
                <th>Id</th>
                <th>Create Time</th>
                <th>Update Time</th>
                <th>Customer</th>
                <th>State</th>
            </tr>

            <!-- loop over and print our coffee -->
            <c:forEach var="tempOrder" items="${order}">
                <tr>
                    <td>${tempOrder.id}</td>
                    <td>${tempOrder.createTime}</td>
                    <td>${tempOrder.updateTime}</td>
                    <td>${tempOrder.coffee}</td>
                    <td>${tempOrder.price}</td>

                </tr>
            </c:forEach>

        </table>

    </div>

</div>

</body>

</html>
